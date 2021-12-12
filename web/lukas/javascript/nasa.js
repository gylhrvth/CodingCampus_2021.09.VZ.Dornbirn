function onButtonClicked() {
    loadNasaPicture("1995-12-10");
}

async function loadNasaPicture(date) {
    let url = "https://api.nasa.gov/planetary/apod?api_key=9EwGCQHxvO6Omtng4YIqGA8jAsEhczG6r18Vj4cO";
    url += "&date=" + date;

    try {
        let response = await fetch(url);
        if (response.ok) {
            handleNasaResponse(await response.json());
        } else {
            console.log("Fehler: " + response.status + " " + response.statusText);
        }
    } catch (err) {
        console.log("Fehler: " + err.message);
    }
}

function handleNasaResponse(data) {
    let image = data["hdurl"];

    let imageTag = document.getElementById("picture");
    imageTag.src = image;
}