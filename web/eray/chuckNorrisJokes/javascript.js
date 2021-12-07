window.onload = () => {
    getRandomJokes();
}

async function getRandomJokes() {
    let response = await fetch('https://api.chucknorris.io/jokes/random');
    let data = await response.json();
    createJokesBox(data);
}

function createJokesBox(data) {
    var currentDiv = document.getElementById("chuckNorrisJokes");
    currentDiv.innerHTML = data.value;
}
