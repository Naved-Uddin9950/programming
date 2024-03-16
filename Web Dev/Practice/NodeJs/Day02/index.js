// Practice 01 :
// map, filter, reduce method

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// map method
arr.map( (item) => {
    console.log(`Using map method : ${item}`);
});

// filter method
let filt = arr.filter( (item) => {
    return item>=4;
});

console.log(`Using filter method : ${filt}`);

// reduce method
let reduce = arr.reduce( (acc, item) => {
    return acc + item;
}, 0);

console.log(`Using reduce method : ${reduce}`);