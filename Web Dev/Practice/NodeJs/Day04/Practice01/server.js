const json = '{"name" : "Shinigami", "age" : 21, "degree" : "BCA"}'; // json string
const obj = JSON.parse(json); // converts json data to JavaScript object
const str = JSON.stringify(obj); // converts JavaScript object to json string (json is a string type)

console.log("Type of json is : " + typeof(json));
console.log("Type of obj is : " + typeof(obj));
console.log("Type of str is : " + typeof(str));

console.log(`json is : ${json}`);
console.log(`obj is : ${obj.name}`);
console.log(`str is : ${str}`);