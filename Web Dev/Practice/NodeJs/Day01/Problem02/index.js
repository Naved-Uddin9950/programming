// Problem 2 : Variables (var and const)

// Create a JavaScript program to calculate the area of a rectangle. Ask the user for the length and width of the rectangle and store them in variables. Calculate and display the area using the formula : 
// `area = length * width `.

const ask = require('../../NPM/node_modules/prompt-sync')();

let length = ask("Enter value of length : ");
let width = ask("Enter value of width : ");

let area = length * width;

console.log("Area of the rectangle is : " + area);