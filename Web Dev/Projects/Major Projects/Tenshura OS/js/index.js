// targeted elements and stored them into a variable to access them later
const apps = document.getElementById("apps-menu-container");
const appsBtn = document.getElementById("appsBtn");

// stored boolean values in some variables to access and modify them later
let isMenuOpen = false;

// Event listeners
appsBtn.addEventListener("click", openMenu) // opens & closes the Apps Menu/ Start Menu

// Function to open & close the Apps menu/ Start Menu
function openMenu() {
    if (isMenuOpen === false) {
        apps.classList.remove("slide-bottom");
        apps.style = "display: flex";
        apps.classList.add("slide-top");
        isMenuOpen = true
    }else{
        apps.classList.remove("slide-top");
        apps.classList.add("slide-bottom");
        isMenuOpen = false;
    }
}