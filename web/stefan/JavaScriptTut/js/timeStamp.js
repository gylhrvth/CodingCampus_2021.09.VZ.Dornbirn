var elem = document.getElementById('Eingabe');
elem.addEventListener('click', erzeugeZeitStempel);

var rem = document.getElementById('Remove');
// rem.addEventListener('click', loeschen);

function erzeugeZeitStempel() {
    var Zeitstempeltext = document.createTextNode(new Date().toISOString());
    var TextZuvor = document.createTextNode('Das letzten Update: ');
    var TextDanach = document.createTextNode('\n');
    var div = document.createElement("div");
    div.id = "id" + count;
    document.getElementById('Absatz').appendChild(TextZuvor);
    document.getElementById('Absatz').appendChild(Zeitstempeltext);
    document.getElementById('Absatz').appendChild(TextDanach);
    document.getElementById('Remove').onclick = function () {
        Absatz.remove();
        let elementToDelete = document.getElementById(div.id)
        elementToDelete.parentNode.removeChild(elementToDelete);
    }

}