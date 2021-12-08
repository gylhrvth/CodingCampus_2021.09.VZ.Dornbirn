let joke;

async function getRandomJoke() {
  let request = await fetch("https://api.chucknorris.io/jokes/random");
  let data = await request.json();
  if (document.getElementById("randomJoke")) {
    let joke = document.getElementById("randomJoke");
    joke.innerHTML = data["value"];
  } else {
    let joke = document.createElement("p");
    joke.innerHTML = data["value"];
    joke.className = "shadowbox";
    joke.id = "randomJoke";
    let parent = document.getElementById("random");
    parent.appendChild(joke);
  }
}

async function getJokeswithInput() {
  if (document.getElementById("input").value) {
    let input = document.getElementById("input").value;
    let data = await fetchData(input);

    if (document.getElementById("jokeresults")) {
      document.body.removeChild(document.getElementById("jokeresults"));
    }
    let container = document.createElement("div");
    container.id = "jokeresults";

    if (data.total == 0) {
      let noReslut = document.createElement("p");
      noReslut.innerHTML = "Es wurde kein Joke gefunden";
      container.appendChild(noReslut);
    } else {
      for (let key in data.result) {
        let newJoke = document.createElement("p");
        newJoke.innerHTML = data.result[key]["value"];
        newJoke.className = "shadowbox";
        container.appendChild(newJoke);
      }
    }
    document.body.appendChild(container);
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

var input = document.getElementById("input");
input.addEventListener("keyup", function (event) {
  if (event.key.value === "Enter") {
    window.alert("Hi");
    document.getElementById("getJokes").click();
  }
});
