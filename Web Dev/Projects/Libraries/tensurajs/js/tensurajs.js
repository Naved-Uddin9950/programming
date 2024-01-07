// - rand() - Generates a random number
// - randstr() - Generates a random string
// - randpass () - Generates a random password of string and numbers

// Fetched IDs
const _rand = document.getElementById('rand');
const randstrID = document.getElementById('randstr');

// Function for creating random number
function rand ({start = 0, limit = 10, type = 'float', decimal = 2}) {
    let randNum = 0;

    switch (type) {
        case 'float':
            randNum = (Math.random() * (limit - start) + start).toFixed(decimal);
            break;

        case 'int':
            randNum = Math.floor(Math.random() * (limit - start + 1) + start);
            break;

        case 'bool':
            randNum = Math.random() * (limit - start + 1) + start;
            randNum = randNum>0 ? true : false;
            break;
    
        default:
            randNum = (Math.random() * (limit - start) + start).toFixed(decimal);
            break;
    }

    console.log(randNum);
}