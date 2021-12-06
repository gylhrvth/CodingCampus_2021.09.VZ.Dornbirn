

function getTimeStamp() {

    const date = new Date();
    document.getElementById("new").innerHTML = "Clicked at: " + date;


};

function addElement() {

    var element = document.createElement('p');
    element.id = "new";
    element.onclick = "getTimeStamp()";

    var tmp = //element from somewhere
        tmp.appendChild(element);
}