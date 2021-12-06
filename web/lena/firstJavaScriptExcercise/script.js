let intitCount = 0;
let element;

function clickButton1() {
  localStorage.count = Number(localStorage.getItem("count")) + 1;
  element.innerHTML =
    "Clicked this many times: " + localStorage.getItem("count");
}

function clickButton2() {
  let newElement = document.createElement("li");
  const d = new Date();
  newElement.innerHTML =
    "Clicked at: " + d.toLocaleDateString() + " " + d.toLocaleTimeString();
  document.getElementById("list").appendChild(newElement);

  let newButton = document.createElement("button");
  newButton.innerHTML = "Remove";
  document.getElementById("list").appendChild(newButton);
  newButton.onclick = function () {
    remove(getIndex(newButton));
  };
}

function remove(index) {
  let list1 = document.getElementById("list");
  list1.removeChild(list1.childNodes[index]);
  list1.removeChild(list1.childNodes[index - 1]);
}

function getIndex(button) {
  let aElements = button.parentNode.childNodes;
  let aElementsLength = aElements.length;

  for (var i = 0; i < aElementsLength; i++) {
    if (aElements[i] == button) {
      return i;
    }
  }
}

window.onload = () => {
  element = document.getElementById("text");
  element.innerHTML =
    "Clicked this many times: " + localStorage.getItem("count");
};
