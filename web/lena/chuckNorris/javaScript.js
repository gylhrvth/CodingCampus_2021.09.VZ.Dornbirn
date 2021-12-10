let joke;

let jokesArray = [];

window.onload = () => {
  if (localStorage.getItem("savedJokes")) {
    let jokes = localStorage.getItem("savedJokes");
    jokesArray = JSON.parse(jokes);

    jokesArray.forEach((element) => {
      let savedJokeElement = document.createElement("p");
      savedJokeElement.innerHTML = element;
      jokeContainer = getJokeContainer();
      let parent = document.getElementById("savedJokes");
      jokeContainer.appendChild(savedJokeElement);
      jokeContainer.appendChild(getDeleteButton());
      parent.appendChild(jokeContainer);
    });
  }
};

function getJokeContainer() {
  let jokeContainer = document.createElement("div");
  jokeContainer.classList.add("jokeContainer", "shadowbox");
  jokeContainer.id = "jokecontainer";
  return jokeContainer;
}

function getSaveButton() {
  let saveJokeButton = document.createElement("button");
  saveJokeButton.innerHTML = "save";
  saveJokeButton.className = "bn30";
  saveJokeButton.onclick = function () {
    savejoke(saveJokeButton);
  };
  return saveJokeButton;
}

function getDeleteButton() {
  let deleteJokeButton = document.createElement("button");
  deleteJokeButton.innerHTML = "delete";
  deleteJokeButton.className = "bn30";
  deleteJokeButton.onclick = function () {
    deleteJoke(deleteJokeButton);
  };
  return deleteJokeButton;
}

async function getRandomJoke() {
  let request = await fetch("https://api.chucknorris.io/jokes/random");
  let data = await request.json();
  if (document.getElementById("randomJoke")) {
    let joke = document.getElementById("randomJoke");
    joke.innerHTML = data["value"];
  } else {
    let joke = document.createElement("p");
    joke.innerHTML = data["value"];
    joke.id = "randomJoke";
    let parent = document.getElementById("random");
    let jokeContainer = getJokeContainer();
    jokeContainer.appendChild(joke);
    jokeContainer.appendChild(getSaveButton());
    parent.appendChild(jokeContainer);
  }
}

async function getJokeswithInput() {
  let parent = document.getElementById("searchedJokes");

  if (document.getElementById("input").value) {
    let input = document.getElementById("input").value;
    let data = await fetchData(input);

    if (document.getElementById("jokeresults")) {
      parent.removeChild(document.getElementById("jokeresults"));
    }
    let container = document.createElement("div");
    container.id = "jokeresults";

    if (data.total == 0) {
      let noReslut = document.createElement("p");
      noReslut.innerHTML = "Es wurde kein Joke gefunden";
      container.appendChild(noReslut);
    } else {
      for (let key in data.result) {
        let jokeAndButton = getJokeContainer();
        let newJoke = document.createElement("p");
        newJoke.innerHTML = data.result[key]["value"];
        newJoke.id = "joke";
        jokeAndButton.appendChild(newJoke);
        jokeAndButton.appendChild(getSaveButton());
        container.appendChild(jokeAndButton);
      }
    }

    parent.appendChild(container);
  } else {
    window.alert("keine Eingabe vorhanden");
  }
}

async function fetchData(input) {
  let request = await fetch(
    "https://api.chucknorris.io/jokes/search?query=" + input
  );
  let data = await request.json();
  return data;
}

function savejoke(button) {
  let parentOfButton = button.parentElement;
  let joke = parentOfButton.childNodes[0];
  let jokeContainer = getJokeContainer();
  let savedJoke = document.createElement("p");
  savedJoke.innerHTML = joke.innerHTML;
  let parent = document.getElementById("savedJokes");
  jokeContainer.appendChild(savedJoke);
  jokeContainer.appendChild(getDeleteButton());
  parent.appendChild(jokeContainer);
  jokesArray.push(savedJoke.innerHTML);
  localStorage.setItem("savedJokes", JSON.stringify(jokesArray));
}

function deleteJoke(button) {
  let parentOfButton = button.parentElement;
  let joke = parentOfButton.childNodes[0];
  deleteFromLocalStorage(joke.innerHTML);
  parentOfButton.parentElement.removeChild(parentOfButton);
}

function deleteFromLocalStorage(joke) {
  let storedJokes = localStorage.getItem("savedJokes");
  let jokesArray = JSON.parse(storedJokes);

  for (let i in jokesArray) {
    if (jokesArray[i] === joke) {
      jokesArray.splice(i, 1);
    }
  }
  localStorage.setItem("savedJokes", JSON.stringify(jokesArray));
}
