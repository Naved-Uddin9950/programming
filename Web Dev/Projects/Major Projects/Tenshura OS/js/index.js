// targeted elements and stored them into a variable to access them later
const apps = document.getElementById("apps-menu-container");
const appsBtn = document.getElementById("appsBtn");
const search = document.getElementById("searchBar");
const searchBtn = document.getElementById("searchBtn");

// stored boolean values in some variables to access and modify them later
let isMenuOpen = false;
let isSearchOpen = false;

// Event listeners
appsBtn.addEventListener("click", appsMenu); // opens & closes the Apps Menu/ Start Menu
searchBtn.addEventListener("click", searchBar); // opens & closes Search Bar at the bottom of the taskbar

// Function to open & close the Apps menu/ Start Menu
function appsMenu() {
    if (isMenuOpen === false) {
        apps.classList.remove("slide-bottom");
        apps.style = "display: flex";
        apps.classList.add("slide-top");
        isMenuOpen = true
    } else {
        apps.classList.remove("slide-top");
        apps.classList.add("slide-bottom");
        isMenuOpen = false;
    }
}

// Function to open & close the Search Bar
function searchBar() {
    if (isSearchOpen === false) {
        search.style = "display: inline";
        search.classList.add("fadeInLeft", "animated");
        isSearchOpen = true;
    } else {
        search.classList.remove("fadeInLeft", "animated");
        search.style = "display: none"
        isSearchOpen = false;
    }
}