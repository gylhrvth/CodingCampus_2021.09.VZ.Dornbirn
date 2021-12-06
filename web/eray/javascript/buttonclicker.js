"use strict";

let textElement;
let textElementFromLocalStorage;
let buttonClickedCounter = 0;

window.onload = () => {
    textElement = document.getElementById("text");
    textElementFromLocalStorage = document.getElementById("localStorageId");
    refreshLocalStorageId();

    if (localStorage.getItem("localSavedButtonCounter")) {
        buttonClickedCounter = parseInt(localStorage.getItem("localSavedButtonCounter"));
    }
}

function buttonCounter() {
    buttonClickedCounter++;
    localStorage.setItem("localSavedButtonCounter", buttonClickedCounter)
    refreshClickedButton();
}

function refreshClickedButton() {
    textElement.innerHTML = "This Button was pressed: " + buttonClickedCounter + " Times!";
}

function refreshLocalStorageId() {
    textElementFromLocalStorage.innerHTML = "On Youre last visit you clicked the Button:<span style='color: red'>" + localStorage.getItem("localSavedButtonCounter") + "</span> Times!";
}