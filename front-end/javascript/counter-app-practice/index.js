// use document.getElementById().innerText to display the output on the HTML element
let countVar = 0
let counterScreen1 = document.getElementById("my-counter");

// to display previous count entries
let counterScreen2 = document.getElementById("count-entry");

function countEntries() {
    countVar += 1;
    // console.log(countVar);
    counterScreen1.innerText = countVar;
}

function getPreviousCount() {
    let countStr = " "  + countVar;
    counterScreen2.innerText = countStr;
    countEntries();
}

function resetCount() {
    counterScreen1.innerText = 0
    countVar = 0;
}