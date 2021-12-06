window.onload = () => {
    textElement = document.getElementById("text");
    textElement.style.fontSize = myElement + "px";
};

//Globalvariable
let myElement = 20;
let textElement;

function increaseText() {
    myElement += 2;
    textElement.style.fontSize = myElement + "px";
}

function decreaseText() {
    myElement -= 2;
    textElement.style.fontSize = myElement + "px";
}

// Funktion dass der direkt nach Span Element auf 20 gesetzt wird
function init() {
    let textElement = document.getElementById("text");
    textElement.style.fontSize = myElement + "px";
}