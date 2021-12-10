//alert("Ich mag Pizza");

//console.log("I Really really enjoy Pizza");

//var myName = window.prompt("What´s your name?");

//console.log("Hello "+myName);

document.getElementById("myButton").onclick = function () {
    var myName = document.getElementById("myText").value;
    console.log("Hello", myName);
}

function sayHello() {
    console.log("Hello");
};
sayHello();

// var myName = window.prompt("enter your name");

/* nested loop = a loop inside of another loop

var symbol = window.prompt("Enter a symbol to use");
var rows = window.prompt("Enter # of rows");
var columns = window.prompt("Enter # of columns");

for (let i = 0; i < rows; i++) {
    for (let j = 0; j < columns; j++) {
        document.getElementById("myRectangle").innerHTML += symbol;
    }
    document.getElementById("myRectangle").innerHTML += "<br>"

}
*/
// 
