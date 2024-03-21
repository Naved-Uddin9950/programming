const joke = document.querySelector('#joke');
const gen = document.querySelector('#gen');
const catList = document.querySelector('.cat-list');

const url = "https://api.chucknorris.io/jokes/random";

// Initialized an array that stores categories of the jokes
let categories =  ["animal","career","celebrity","dev","explicit","fashion","food","history","money","movie","music","political","religion","science","sport","travel"];

// Looped through array of categories and injected them in HTML list items
for(let i=0; i<categories.length; i++) {
    catList.innerHTML += `<li id="${categories[i]}">${categories[i]}</li>`
}

for(let i=0; i<categories.length; i++) {
    let catJoke = document.getElementById(`${categories[i]}`);
    catJoke.addEventListener('click', () => {
        getJoke(categories[i]);
    })
}

// Onclick of the 'Random Joke' button it will call 'getRandJoke' function to generate random jokes.
gen.addEventListener('click', () => {
    getRandJoke();
});

async function getRandJoke () {
    let api = await fetch(url);
    let data = await api.text();
    let json = JSON.parse(data);

    joke.innerHTML = json.value;
}

async function getJoke (cat) {
    let catUrl = `https://api.chucknorris.io/jokes/random?category=${cat}`;
    let api = await fetch(catUrl);
    let data = await api.text();
    let json = JSON.parse(data);

    joke.innerHTML = json.value;
}