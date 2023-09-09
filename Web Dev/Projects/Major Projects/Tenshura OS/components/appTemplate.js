// targeted elements and stored them into a variable to access them later
const appDiv = document.querySelector(".app-container");
const mainDiv = document.getElementById("main-container");
const appTemp = document.querySelector(".appTemplate");


// stored boolean values in some variables to access and modify them later
isAppOpen = false;


// Event listeners
appDiv.addEventListener("click", appTemplate);



// Function to open App Template
function appTemplate() {
    if (isAppOpen === false) {
        let openedApp = mainDiv.insertAdjacentHTML("afterbegin", `<div class="appTemp">Hello World!</div>`);
    }
}

