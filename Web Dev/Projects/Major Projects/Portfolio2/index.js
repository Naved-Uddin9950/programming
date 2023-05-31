// function menu() {
//     var nav = document.getElementById("navbar");
    
//     if (nav.style.display == "none") {
//         nav.style.display = "flex";
//     }
// }

var menu = document.getElementById("menubtn");

menu.onclick = function(){
    var nav = document.getElementById("navbar");

    if (nav.style.display === "none") {
        nav.style.display = "flex";
    }

    else if (nav.style.display === "flex") {
        nav.style.display = "none";
    }
}