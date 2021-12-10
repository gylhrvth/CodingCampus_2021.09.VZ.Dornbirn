function onButtonClicked() {
    loadNumberInfo(1000)
}

async function loadNumberInfo(number) {
    //fetch("http://numbersapi.com/" + number + "/trivia")
    //    .then(response => console.log(response))
    //    .catch(err => console.log(err))

    try {
        //HTTP GET request
        let response = await fetch("http://numbersapi.com/" + number + "/trivia");
        if (response.ok) {
            console.log(await response.text());
        } else {
            console.log("Fehlgeschlagen: " + response.status + " " + response.statusText)
        }
    } catch (err) {
        console.log("Fehlgeschlagen: " + err.message);
    }
}