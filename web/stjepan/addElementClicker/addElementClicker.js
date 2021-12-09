
function addElement() {
    let button = document.createElement('button')
    let parent = document.getElementById('timestamp')
    let element = document.createElement('p')

    let dt = new Date()
    element.innerHTML = "Clicked: " + dt.toDateString()

    button.innerHTML = "remove";
    parent.appendChild(element);
    parent.appendChild(button);



}