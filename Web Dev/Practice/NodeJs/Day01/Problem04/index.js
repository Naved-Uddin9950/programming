// Problem 4 : Arrays 

// You’re organizing a party and want to keep track of the guest list. Create an array called “guestList” and add the names of at least five guests. Then, write a program that checks if a given name is on the guest list. If the name is found. Display “Welcome to the party, [name]!”; otherwise, display “Sorry, you’re not on the guest list.”

const ask = require('../../NPM/node_modules/prompt-sync')();

let guestList = ["Naved", "Basharat", "Rohit", "Izhar", "Vaibhav"];

let name = ask("What is your name ? : ");
let inList = false;

const isGuest = (name) => {
    for(let i=0; i<guestList.length; i++) {
        if(name == guestList[i]) {
            console.log("Welcome to the party, " + name + "!");
            inList = true;
            break;
        }
    }
    if(inList == false) {
        console.log("Sorry, you're not on the guest list.");
    }
}

isGuest(name);