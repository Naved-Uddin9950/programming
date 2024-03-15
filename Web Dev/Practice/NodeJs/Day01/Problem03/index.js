// Problem 3 : Objects and Properties

// You’re creating an online store. Define a JavaScript object named “product” with the following properties : 
// -	name (string)
// -	price (number)
// -	inStock (boolean)
// Create at least three products using your object template and display their details using console.log.

let product = {
    "name" : "",
    "price" : 0,
    "inStock" : false
}

let item1 = Object.create(product);
let item2 = Object.create(product);
let item3 = Object.create(product);

item1.name = "Laptop";
item1.price = 30000;
item1.inStock = true;

item2.name = "Notebook";
item2.price = 40;
item2.inStock = false;

item3.name = "Book";
item3.price = 499.50;
item3.inStock = true;

console.log(item1);
console.log(item2);
console.log(item3);
