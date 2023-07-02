/* ----- Normal Function ----- */

function sum(a, b) {
    return a+b;
}

console.log(sum(2,3));



/* ----- Anonymous Function ----- */

var add = function (a, b){
    return a+b;
}

console.log(add(1,2));



/* ----- Arrow Function 1 ----- */

const double = (n) => {
    return n*n;
}

console.log(double(3));



/* ----- Arrow Function 2 ----- */

const power = (n) => n*n;
console.log(power(4));



/* ----- Callback Function ----- */

const addition = (a, b, operation) => {
    return operation(a,b);
}

const operation = (a,b) =>{
    return a+b;
}

console.log(operation(10,5));