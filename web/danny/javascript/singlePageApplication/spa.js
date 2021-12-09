


async function randomJoke() {
    try {
        let response = await fetch("https://api.chucknorris.io/jokes/random");
        if (response.ok) {
            let data = await response.json();
            document.getElementById("jokeValue").innerHTML = data["value"];
        } else {
            document.getElementById("jokeValue").innerHTML = "Request war nicht erfolgreich. Statuscode: " + response.status + " " + response.statusText;
        }
    } catch (err) {
        document.getElementById("jokeValue").innerHTML = err.message;
    }
}

async function searchJokeByText() {
    let query = "God";
    try {
        let response = await fetch("https://api.chucknorris.io/jokes/search?query=God")
        if (response.ok) {
            let data = await response.json();
            document.getElementById("jokeText").innerHTML = data["value"];
        } else {
            document.getElementById("jokeText").innerHTML = "Request war nicht erfolgreich. Statuscode: " + response.status + " " + response.statusText;
        }
    } catch (err) {
        document.getElementById("jokeText").innerHTML = err.message;

    }
}






/**fetch("https://api.chucknorris.io/jokes/random")
    .then(response => response.json())
    .then(data => document.getElementById("jokeValue").innerHTML = data["value"])
    .catch(err => document.getElementById("jokeValue").innerHTML = err.message);
**/
    // joke = response

    // document.getElementById("jokeValue").innerHTML = joke["value"];









