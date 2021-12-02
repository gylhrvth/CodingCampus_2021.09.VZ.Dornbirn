var hueDegree = 0;

function updateHue(degree) {
    hueDegree = (hueDegree + degree) % 360;
    let body = document.getElementsByTagName("body")[0];
    body.style.filter = "hue-rotate(" + hueDegree + "deg)";
}

window.onload = async () => {
    document.addEventListener("mousemove", () => {
        updateHue(15);
    })

    while (true) {
        await new Promise(resolve => setTimeout(resolve, 50));
        updateHue(1);
    }
}