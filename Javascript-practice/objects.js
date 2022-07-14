var laptop = {

    brand: "dell",
    isNew: false,
    price: 1550.00,
    dateBought: new Date(2021, 06, 26).toDateString(),
    dateToday: new Date(2021, 08, 22).toJSON()
};

console.log(laptop);
console.log("laptop brand: " + laptop.brand);

if (!laptop.isNew) {
    console.log("condition: second-hand");
} else {
    console.log("laptop is new")
}

console.log("values of object: " + Object.values(laptop));
console.log("keys of object: " + Object.keys(laptop));
console.log("brand in uppercase: " + laptop.brand.toUpperCase());
console.log("print the index of an object's value: " + laptop.brand.indexOf("i"));