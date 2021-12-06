window.onload = () => {
    buttonClickerText = document.getElementById("buttonText");
}

let buttonClickedCounter = 0;

function increaseCounter() {
    buttonClickedCounter++;
    refreshClickedButton();

}

function decreaseCounter() {
    buttonClickedCounter--;
    refreshClickedButton();
}

function refreshClickedButton() {
    buttonClickerText.innerHTML = "Button was clicked this many Times: " + buttonClickedCounter + " Times!";

}