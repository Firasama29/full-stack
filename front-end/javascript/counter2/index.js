let num1 = 2;
let num2 = 5;
let num1El = document.getElementById("num1-el");
let num2El = document.getElementById("num2-el");

let btnOneFirst = document.getElementById("btn-one-first");
let btnTwoFirst = document.getElementById("btn-two-first");
let btnFiveFirst = document.getElementById("btn-five-first");

let btnOneSecond = document.getElementById("btn-one-second");
let btnTwoSecond = document.getElementById("btn-two-second");
let btnFiveSecond = document.getElementById("btn-five-second");

//for increment 1 buttons
btnOneFirst.onclick = function addOne() {
        num1El.innerText = num1 + 1;
}

btnOneSecond.onclick = function addOne() {
    num2El.innerText = num2 + 1;
}


//for increment 2 buttons
btnTwoFirst.onclick = function addTwo() {
    num1El.innerText = num1 + 2;
}

btnTwoSecond.onclick = function addTwo() {
    num2El.innerText = num2 + 2;
}


//for increment 5 buttons
btnFiveFirst.onclick = function addFive() {
    num1El.innerHTML = num1 + 5;
}

btnFiveSecond.onclick = function addFive() {
    num2El.innerHTML = num2 + 5;
}