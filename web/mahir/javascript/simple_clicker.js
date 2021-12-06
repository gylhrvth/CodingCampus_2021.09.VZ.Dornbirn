
let myElement = 15;

function increaseText(){
    myElement += 2;
let textElement = document.getElementById("text");
textElement.style.fontSize = myElement + "px" ;
}
function decreaseText(){
    myElement -= 2;
let textElement = document.getElementById("text");
textElement.style.fontSize = myElement + "px" ;
}
