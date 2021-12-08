


function clickedAdd() {
    const d = new Date();
    let nListe = document.getElementById("list");
    let newNode = document.createElement('li');

    let paragraphNode = document.createElement('p')

    let spanNode = document.createElement('span')
    spanNode.innerHTML = "Clicked Add: " + d.toISOString();
    paragraphNode.appendChild(spanNode)

    let buttonNode = document.createElement('button')
    buttonNode.innerHTML = 'Delete'
    buttonNode.style.float = 'right'
    buttonNode.classList.add("sizeFont")
    buttonNode.addEventListener("click", () => {
        nListe.removeChild(newNode);
    })

    paragraphNode.appendChild(buttonNode)
    newNode.appendChild(paragraphNode)
    nListe.appendChild(newNode);
}
