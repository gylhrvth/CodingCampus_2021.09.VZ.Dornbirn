


function clickedAdd() {
    const d = new Date();
    let nListe = document.getElementById("list");
    let newNode = document.createElement('li');
    let spanNode = document.createElement('span')

    let paragraphNode = document.createElement('p')
    paragraphNode.innerHTML = "Clicked Add: " + d.toISOString();
    spanNode.appendChild(paragraphNode)

    let buttonNode = document.createElement('button')
    buttonNode.innerHTML = 'Delete'
    buttonNode.style.float = 'right'

    buttonNode.addEventListener("click", () => {
        nListe.removeChild(newNode);
    })

    paragraphNode.appendChild(buttonNode)
    newNode.appendChild(spanNode)
    nListe.appendChild(newNode);
}
