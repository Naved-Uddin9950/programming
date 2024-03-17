const ask = require('../../NPM/node_modules/prompt-sync')();
let fs = require('fs');
let os = require('os');

let doc;
let save = false;

while(save != true) {
    doc = ask();
    fs.appendFile('file.txt', doc, () => {
        console.log("File has been created.");
    });
    fs.appendFile('file.txt', '\n', () => {
        console.log("File has been created.");
    });
    
    if(doc == 'ctrl + s') {
        console.log("File is saved");
        break;
    }
}