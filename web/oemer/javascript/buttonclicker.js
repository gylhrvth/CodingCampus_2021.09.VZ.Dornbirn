window.onload = () => {
    buttonclickertext = document.getElementById("text");
}

let buttonclickedCounter = 0;

function up() {
    buttonclickedCounter++;
    refreshclickedbutton();
}

function down() {
    buttonclickedCounter--;
    refreshclickedbutton();
}

function refreshclickedbutton() {
    buttonclickertext.innerHTML = "buttton was clicked :" + buttonclickedCounter + "Times";
}


