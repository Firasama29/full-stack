//vanilla javascript uses imperative programming.
/*
- create an element
- give it some textContent
- give it a class name of a header
- append it as a child of the devroot in index.html
*/

const h3 = document.createElement("h3")
h3.textContent = "Example of imperative programming with vanilla javascript"
h3.className = "header"
document.getElementById("root").append(h3)
