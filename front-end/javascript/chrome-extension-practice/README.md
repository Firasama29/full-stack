- This simple project demonstrates how to create a basic calculator using html and javascript

- In this project, we get introduced to functions and 'document.getElementById().innerText

- What I've learned:
    - use addEventListener("onclick", function() { .... }) instead of adding onclick even in html
    - document.getElementById("..").value to insert some value into an input field
    - innerHTML
    - declaring variables using const
    - .innerHTML vs document.createElement("..")
    - use template strings `..` to avoid the complexity and confusion of combining single and double quotes
    - template strings can be broken into multiple lines, unlike with regular strings
    - deploying a chrome extension
    - window.localStorage object and how to use it to store key/value pairs in browser's localStorage and fetch it
        - data stored in localStorage has no expiration date 
        - data is not deleted when the browser is closed
        - localStorage only stores strings. We can use JSON.stringify()
    - truthy and falsy values
        - falsy values(false, null, 0, "", undefined, NaN)
    - addEventListener("click", function{ ..  }) for one click and
      addEventListener("dblclick", function{ .. }) for double clicks
    - save current chrome tab in localStorage and render it on browser      


- steps to deploy a chrome extension:
    1. Create the app
    2. create a manifest.json file
    3. go to chrome://extensions/
    4. turn on developer mode
    5. select 'Load unpacked' tab on top
    6. once app folder is selected, you can use the extension


- steps to store an item to and fetch it from browser's localStorage
    1. Push the new string
    2. use localStorage.setItem("key", JSON.stringify("value")) method. Make sure you use JSON.stringify()
       to convert the value from object to JSON string because localStorage only stores strings
    3. refresh and try it out
    4. to fetch the item from localStorage, use method localStorage.getItem("key"). Make sure you use
       JSON.parse(localStorage.getItem("key")) to convert it from JSON string to object
    5. to verify if the item is saved in localStorage, inspect the page, click on 'Application', under localStorage,
       find your application

- steps to save current chrome tab in localStorage and render it on browser
    1. create a button and evenListener in js file
    2. inside the evenListener function, call chrome's API chrome.tab.query({active: true, activeWindow: true}, function(tabs) { 
            - push current tab to the array             -> yourArray.push(tab[0].url)
            - store current tab into localStorage       -> localStorage.setItem("yourArray", tab[0])
            - render current tab's url in the browser
        })
    3. add the following to manifest.json file
        "permissions: [
            "tabs"
        ]

- steps tp re-deploy updated version of your chrome's extension:
    1. go to chrome://extensions/
    2. turn on developer mode
    3. select 'LUpdate' tab on top
    