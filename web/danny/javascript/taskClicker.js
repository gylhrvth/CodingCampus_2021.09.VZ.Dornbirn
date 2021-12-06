let counter = 0;

window.onload = () => {
    if (localStorage.getItem("counter")) {
        counter = parseInt(localStorage.getItem("counter"));
    }
    printCounter();
}

function clickedIncrease() {
    counter++;
    localStorage.setItem("counter", counter);
    printCounter();


}

function printCounter() {
    document.getElementById("Text").innerHTML = "Clicked so many times: " + counter;

}
