let backend = ["java", "spring boot", "mysql", "postges"];

console.log("Traditional function");

let xyz = backend.map(function(b) {
    return "I know " + b;
});

console.log(xyz)

/**arrow function with parameter*/
console.log("\nArrow function");

let abc = backend.map((b) => {
    return `I know ${b}`;
});
console.log(abc);


//simplified arrow function with parameter
console.log("\nSimplified arrow function with parameter");
const test = b => `${b}`;
console.log(test("java"))


//function with no parameter
console.log("\nArrow function with no param");
const noParam = () => `${backend}`;
console.log(noParam())


//with multiple params
console.log("\nMultiple params")
const quantity = "100";
const fruit = ["mango", "papaya", "grapes"];

const cost = fruit.map((name, i) => ({name, quantity, price: quantity * i}));

console.log(cost)