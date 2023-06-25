// var menu = document.getElementById("menubtn");
// var openMenu = document.getElementById("menubtn");
// var closeMenu = document.getElementById("closebtn");
// var counter = false;


// menu.onclick = function() {
//     var nav = document.getElementById("navbar");

//     if(counter === false){
//         nav.style.display = "flex";
//         openMenu.style.display = "none";
//         closeMenu.style.display = "block";
//         counter = true;
//         menu = document.getElementById("closebtn");
//     }

//     else if(counter === true){
//         nav.style.display = "none";
//         openMenu.style.display = "block";
//         closeMenu.style.display = "none";
//         counter = false;
//         var menu = document.getElementById("menubtn");
//     }
// }

function OpenMenu() {
    var nav = document.getElementById("navbar");
    nav.style.display = "flex";
}