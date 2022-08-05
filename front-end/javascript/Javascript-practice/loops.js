//here we test different types of for loops

var technologies = [
    "java",
    "spring boot", 
    "docker",
    "mssql",
    "postgresql"
]


//normal for loop
console.log("using normal for loop: ");
for(var i = 0; i < technologies.length; i++) {
    console.log(technologies[i])
}


//for of
console.log("\nusing normal forOf loop: ");
for (const technology of technologies) {
    console.log(technology);
}

//forEach(using callback function)
console.log("\nusing normal forEach loop: ");
technologies.forEach(function(technology) {
    console.log(technology)
}) 