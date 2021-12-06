let joke;

async function getJoke() {
  let request = await fetch("https://api.chucknorris.io/jokes/random");
  let data = await request.json();

  let element = document.getElementById("test");
  element.innerHTML = data["value"];
}
