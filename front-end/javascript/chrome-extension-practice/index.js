let myTextArray = []
const inputEl = document.getElementById("txt-el")
let ulEl = document.getElementById("ul-el")
const btnEl = document.getElementById("btn-el")
const saveTabBtn = document.getElementById("tab-el")
let deleteBtn = document.getElementById("delete-btn")

// fetch an item from localStorage
const myItemsInLocalStorage = JSON.parse(localStorage.getItem("myTextArray"))

// check if localStorage is empty or contains any data
// if localStorage is not empty, render the data into the browser
if (myItemsInLocalStorage)  {
    myTextArray = myItemsInLocalStorage 
    render(myTextArray)
}
console.log(myItemsInLocalStorage)

// render the array into the browser
function render(texts) {
    let listOfItems = ""
    for(let i = 0; i < texts.length; i++) {
        listOfItems += `<li>
                            <a target='_blank' href='${texts[i]}'>
                                ${texts[i]}
                            </a>
                        </li>`
    }
    ulEl.innerHTML = listOfItems
}


// add onclick event listener for save button
btnEl.addEventListener("click", function() {
    // push the new string to the array
    myTextArray.push(inputEl.value)
    // clear the input field
    inputEl.value = ""

    // store the new element to the localStorage
    localStorage.setItem("myTextArray", JSON.stringify(myTextArray))

    // fetch the element from localStorage to the console
    console.log(localStorage.getItem("myTextArray"))

    /** first approach to render the value into the browser */
    render(myTextArray)
    
    //** second approach */
    // for(let i = 0; i < myTextArray.length; i++) {
    //     const liEl = document.createElement("li")
    //     liEl.textContent = myTextArray[i]
    //     ulEl.append(liEl)
    // }
})


// add evenListener to save current tab
saveTabBtn.addEventListener("click", function() {
    chrome.tabs.query({active: true, currentWindow: true}, function(tabs) {
        myTextArray.push(tabs[0].url)
        localStorage.setItem("myTextArray", JSON.stringify(myTextArray))
        render(myTextArray)
    })
    
})


// add onclick for delete button
deleteBtn.addEventListener("dblclick", function() {
    localStorage.clear()
        myTextArray = []
        render(myTextArray)

})

