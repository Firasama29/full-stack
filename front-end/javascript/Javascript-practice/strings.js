/* strings and string methods */

var country = "Malaysia";
var phrase = "I live in";

console.log("I live in " + country)

console.log("type of variable: " + typeof country)

console.log(country.toUpperCase())

console.log("length of the word = " + country.length)

//same result
console.log(phrase + " " + country)
console.log(phrase.concat(), country)
console.log(`${phrase} ${country}`)

console.log(country.endsWith("a"))

console.log(country.substring(0, 5))