window.onload = () => {
    createItem();
}


function createItem() {
    let d = new Date();

    const description = "This Item was created at:";

    const listItem = document.createElement('li');
    const spanItem = document.createElement('span')
    const pItem = document.createElement('p')
    pItem.innerHTML = 'Created: ' + d.toString()
    spanItem.appendChild(pItem)

    const buttonItem = document.createElement('button')
    buttonItem.innerHTML = 'See you later...'
    buttonItem.addEventListener("click", () =>{ deleteItem(listItem)})
    spanItem.appendChild(buttonItem)
    
    listItem.appendChild(spanItem)
    document.getElementById('item-to-fil').appendChild(listItem)
}

function deleteItem(listItem) {
        console.log("No more")   
        document.getElementById('item-to-fil').removeChild(listItem)
    }
