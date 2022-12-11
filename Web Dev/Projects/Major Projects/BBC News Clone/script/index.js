function hiddenMenu() {
	document.getElementById("hidden-menu-container").style.display = "flex";
}

function closeHiddenMenu() {
	document.getElementById("hidden-menu-container").style.display = "none";
}

var active = false;

function moreMenu() {

	if (active === false) {
	document.getElementById("grid-container").style.display = "grid";
	document.getElementById("moreMenuBtn").style.backgroundColor = "white";
	document.getElementById("moreMenuBtn").style.color = "black";
	document.getElementById("moreMenuBtn").style.padding = "10px";
	active = true;		
	}

	else {
		document.getElementById("grid-container").style.display = "none";
		document.getElementById("moreMenuBtn").style.backgroundColor = "#B80000";
		document.getElementById("moreMenuBtn").style.color = "white";
		document.getElementById("moreMenuBtn").style.padding = "0px 8px";
		active = false;
	}
}