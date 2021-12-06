window.onload = start;

function start() {
    document.querySelector('#interaktiv').addEventListener('click', klickverarbeitung);
}

function klickverarbeitung() {
    var Zeitstempeltext = document.createTextNode(new Date().toISOString());
    var TextZuvor = document.createTextNode('Das letzte update: ');
    var TextDanach = document.createTextNode('\r\n');

    document.querySelector('output').appendChild(TextZuvor);
    document.querySelector('output').appendChild(Zeitstempeltext);
    document.querySelector('output').appendChild(TextDanach);

}