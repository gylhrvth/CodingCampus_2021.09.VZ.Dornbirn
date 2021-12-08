let element;

window.onload = () => {
  let initcount = 0;
  if (localStorage.getItem("count")) {
    initcount = localStorage.getItem("count");
  }
  element = document.getElementById("text");
  element.innerHTML = "Clicked this many times: " + initcount;
};

function countKlicks() {
  localStorage.count = Number(localStorage.getItem("count")) + 1;
  element.innerHTML =
    "Clicked this many times: " + localStorage.getItem("count");
}

function getTimestamp() {
  let container = document.createElement("div");

  let newElement = document.createElement("li");
  const d = new Date();
  newElement.innerHTML =
    "Clicked at: " + d.toLocaleDateString() + " " + d.toLocaleTimeString();
  container.appendChild(newElement);

  let newButton = document.createElement("button");
  newButton.innerHTML = "Remove";
  container.appendChild(newButton);
  document.getElementById("list").appendChild(container);

  newButton.onclick = function () {
    let list1 = document.getElementById("list");
    list1.removeChild(newButton.parentElement);
  };
}
