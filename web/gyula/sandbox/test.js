
let counter = 0
function addCounter(){
  ++counter;
  document.getElementById("counterText").innerHTML = "Counter: " + counter;
}

function myAppendChild(){
  let inputElement = document.getElementById("textField")

  if (inputElement.value != ""){
    let rootElement = document.getElementById("listRoot")
    let divElement = document.createElement("div")
    divElement.classList.add("divElement")

    let paragraph = document.createElement("p")
    paragraph.innerHTML = inputElement.value
    inputElement.value = ""
    paragraph.style.fontSize = "24px"
    divElement.appendChild(paragraph)

    let buttonElement = document.createElement("button")
    buttonElement.innerHTML = "X"
    buttonElement.addEventListener("click", () => {
          rootElement.removeChild(divElement)
        }
      )
    divElement.appendChild(buttonElement)  
    rootElement.appendChild(divElement)
  } else {
    alert("Please type input first")
  }
}
