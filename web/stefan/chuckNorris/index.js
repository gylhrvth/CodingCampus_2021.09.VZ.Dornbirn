var witz;


async function randomWitze() {
    let request = await fetch("https://api.chucknorris.io/jokes/random");
    let data = await request.json();

    let element = document.getElementById("text");
    element.innerHTML = data["value"];
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