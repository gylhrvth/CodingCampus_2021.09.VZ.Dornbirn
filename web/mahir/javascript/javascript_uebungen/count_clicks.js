


window.onload = () => {
    updateDisplay();
}
function resetCounter() {
    let resetElement = document.getElementById("counter")
    localStorage.count = 0;
    resetElement.innerHTML = localStorage.count;
}

function updateDisplay() {
    let countElement = document.getElementById("counter");
    if (!localStorage.count) {
        localStorage.count = 0;
    }
    countElement.innerHTML = localStorage.count;
}

function increaseCounter() {
    if (localStorage.count) {
        localStorage.count = Number(localStorage.count) + 1;
    } else {
        localStorage.count = 1;
    }
}

function countUp() {
    increaseCounter();
    updateDisplay();
};
