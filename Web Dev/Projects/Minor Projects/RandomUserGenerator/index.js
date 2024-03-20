const profile = document.getElementById('profile-image');
const generate = document.getElementById('generate');

const fname = document.getElementById('name');
const age = document.getElementById('age');
const gen = document.getElementById('gen');
const user = document.getElementById('user');
const email = document.getElementById('email');
const pass = document.getElementById('pass');
const phone = document.getElementById('phone');
const address = document.getElementById('address');

const city = document.getElementById('city');
const state = document.getElementById('state');
const country = document.getElementById('country');
const postcode = document.getElementById('postcode');
const lat = document.getElementById('lat');
const lon = document.getElementById('lon');

async function fetchAPI() {
	let api = await fetch('https://randomuser.me/api/');
	let fetched = await api.text();
	let json = JSON.parse(fetched);
	let data = json.results[0];

	profile.setAttribute('src', data.picture.large);

	fname.innerHTML = `Full Name : ${data.name.title} ${data.name.first} ${data.name.last}`;
	age.innerHTML = `Age : ${data.dob.age}`
	gen.innerHTML = `Gender : ${data.gender}`;
	user.innerHTML = `Username : ${data.login.username}`;
	email.innerHTML = `Email Address : ${data.email}`;
	pass.innerHTML = `Password : ${data.login.password}`;
	phone.innerHTML = `Phone : ${data.phone}`;
	address.innerHTML = `Address : ${data.location.street.number}, ${data.location.street.name}, ${data.location.city}`;
	
	city.innerHTML = `City : ${data.location.city}`;
	state.innerHTML = `State : ${data.location.state}`;
	country.innerHTML = `Country : ${data.location.country}`;
	postcode.innerHTML = `Postcode : ${data.location.postcode}`;
	lat.innerHTML = `Latitude : ${data.location.coordinates.latitude}`;
	lon.innerHTML = `Longitude : ${data.location.coordinates.longitude}`;
}

fetchAPI();


generate.addEventListener('click', () => {
	fetchAPI();
});