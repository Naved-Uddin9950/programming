let ask = require('../../NPM/node_modules/prompt-sync')();
let fs = require('fs');
let os = require('os');

let doc = '';
let save = 'ctrl + s';

// 1 - Writing in a file
// while(doc != save) {
//     doc = ask();
//     if(doc == save) {
//         break;
//     } else {
//         fs.appendFile('file.txt', doc + '\n', () => {});
//     }
// }


// 2 - Reading a file
// let dir = "Practice/NodeJs/Day03/Practice02/";
// let file = dir + "file.txt";

// let content = fs.readFileSync(file, 'base64', () => {});
// console.log(content);


// 3 - OS module uses
let ram = os.freemem();
let gb = 1024*1024*1024;
let freeRam = (ram / gb).toFixed(2);
let sys = os.type();
let cpu = os.cpus();
let user = os.hostname();
let release = os.release();


let myOS = {
    "USer" : user,
    "System" : sys,
    "Version" : release,
    "Free_Ram" : freeRam,
    "CPU" : cpu,    
}

console.log(myOS);