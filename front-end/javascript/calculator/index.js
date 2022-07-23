
let num1 = 8;
let num2 = 5;

// display the numbers
document.getElementById("num1-el").textContent = num1;
document.getElementById("num2-el").textContent = num2;

// associate a variable with the sum <span> element

let sumEl = document.getElementById("sum-el");
function add() {
    let result = num1 + num2;
    sumEl.textContent = "sum: " + result 
}

function subtract() {
    let result = num1 - num2;
    sumEl.textContent = "sum: " + result;
    
}

function divide() {
    let result = num1 / num2;
    sumEl.textContent = "sum: " + result;
}

function multiply() {
    let result = num1 * num2;
    sumEl.textContent = "sum: " + result;
}

function reset() {
    let result = 0;
    sumEl.textContent = "sum: " + result;
}