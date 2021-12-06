window.onload = () => {
    textElement = document.getElementById("text");
    textElement.style.fontSize = myElement + "px";
};

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