let clicks = 0;

function increase ( ) {
    clicks ++;
    document.getElementById("counterText").innerHTML = clicks;
    localStorage.setItem("Clicks", clicks);
}
let ctn = localStorage.getItem("Clicks");

document.getElementById("local").innerHTML = ctn;
