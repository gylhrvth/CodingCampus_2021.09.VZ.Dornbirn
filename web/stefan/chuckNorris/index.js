var witz;

async function randomWitze() {
    let newElement = document.createElement("li");
    let request = await fetch("https://api.chucknorris.io/jokes/random");
    let data = await request.json();

    let element = document.getElementById("textList").appendChild(newElement);
    element.innerHTML = data["value"];

}

function clearSite() {
    var el = document.getElementById("textList");
    location.reload();
}

// function sucheWitz() {
//     let request = await fetch("https://api.chucknorris.io/jokes/search?query={query}");
//     var input = document.getElementById("myInput");
//     input.addEventListener("keyup", function (event) {
//         if (event.keyCode === 13) {
//             event.preventDefault();
//         }
//     });
// }