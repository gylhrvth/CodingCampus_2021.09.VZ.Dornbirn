
let counter = 0
function addCounter(){
  ++counter;
  document.getElementById("counterText").innerHTML = "Counter: " + counter;
}

function myAppendChild(){
  let inputElement = document.getElementById("textField")

  if (inputElement.value != ""){
    let rootElement = document.getElementById("listRoot")
    let divElementWithDate = document.createElement("div")
    divElementWithDate.classList.add("divElementWithDate")
    let dateText = document.createElement("p")
    dateText.innerHTML = getDateTimeText() 
    divElementWithDate.appendChild(dateText)

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
          rootElement.removeChild(divElementWithDate)
        }
      )
    divElement.appendChild(buttonElement)
    divElementWithDate.appendChild(divElement)  
    rootElement.appendChild(divElementWithDate)
  } else {
    alert("Please type input first")
  }
}

function getDateTimeText(){
  const t = new Date();
  const date = ('0' + t.getDate()).slice(-2);
  const month = ('0' + (t.getMonth() + 1)).slice(-2);
  const year = t.getFullYear();
  const hours = ('0' + t.getHours()).slice(-2);
  const minutes = ('0' + t.getMinutes()).slice(-2);
  const seconds = ('0' + t.getSeconds()).slice(-2);
  return `${year}.${month}.${date}. ${hours}:${minutes}:${seconds}`;
}