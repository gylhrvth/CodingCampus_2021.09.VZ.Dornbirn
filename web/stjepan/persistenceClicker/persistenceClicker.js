let buttonClickedCounter = 0;
let buttonText;
let localSavedButtonCounter;
let textElementFromLocalStorage;

function buttonCounter() {
    buttonClickedCounter++;
    localStorage.setItem("localSavedButtonCounter", buttonClickedCounter)
    refreshClickedButton();
}

function refreshClickedButton() {
    buttonText.innerHTML = " This Button was pressed " + buttonClickedCounter + " Times ";
}

function refreshLocalStorageId() {
    textElementFromLocalStorage.innerHTML = " On youre Last visit you pressed the Button so many times " + localSavedButtonCounter;

}
window.onload = () => {
    buttonText = document.getElementById("text");
    localSavedButtonCounter = localStorage.getItem("localSavedButtonCounter");
    textElementFromLocalStorage = document.getElementById("localStorageId");
    refreshLocalStorageId();
}

