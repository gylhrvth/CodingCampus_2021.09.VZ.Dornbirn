"use strict";

let textElement;
let textElementFromLocalStorage;
let textElementFromDateTime;
let buttonClickedCounter = 0;

window.onload = () => {
    textElement = document.getElementById("text");
    textElementFromLocalStorage = document.getElementById("localStorageId");
    textElementFromDateTime = document.getElementById("dateTime");
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
    textElementFromLocalStorage.innerHTML = "On Youre last visit you clicked the Button: " + localStorage.getItem("localSavedButtonCounter") + " Times!";
}


function countDateTimes() {
    var newHtmlElement = document.createElement("li");
    const date = new Date();
    newHtmlElement.innerHTML = "Clicked at: " + date.toLocaleDateString() + " " + date.toLocaleTimeString();
    document.getElementById("list").appendChild(newHtmlElement);

    var newButton = document.createElement("button");
    newButton.innerHTML = "Remove";
    document.getElementById("list").appendChild(newButton);
    newButton.onclick = function () {
        remove(getIndex(newButton));
    };
}

function remove(index) {
    var list = document.getElementById("list");
    list.removeChild(list.childNodes[index]);
    list.removeChild(list.childNodes[index - 1]);
}

function getIndex(button) {
    var pressedButtonTimes = button.parentNode.childNodes;

    for (var i = 0; i < pressedButtonTimes.length; i++) {
        if (pressedButtonTimes[i] == button) {
            return i;
        }
    }
}
