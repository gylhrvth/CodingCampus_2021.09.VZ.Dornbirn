let clicks = 0;

function increase() {
    clicks += 1;
    document.getElementById("counterText").innerHTML = clicks;
    localStorage.setItem("Clicks", clicks);
}
console.log(localStorage.getItem("Clicks"));

let ctn = localStorage.getItem("Clicks");
console.log(ctn);

document.getElementById("local").innerHTML = ctn;