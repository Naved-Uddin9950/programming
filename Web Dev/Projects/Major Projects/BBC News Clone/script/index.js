// Declarations starts here

var active = [false, false];


// Declarations ends here

// Header functions starts here

function hiddenMenu() {
	document.getElementById("hidden-menu-container").style.display = "flex";
}

function closeHiddenMenu() {
	document.getElementById("hidden-menu-container").style.display = "none";
}

function moreMenu() {

	if (active[0] === false) {
	document.getElementById("grid-container").style.display = "grid";
	document.getElementById("moreMenuBtn").style.backgroundColor = "white";
	document.getElementById("moreMenuBtn").style.color = "black";
	document.getElementById("moreMenuBtn").style.padding = "10px";
	active[0] = true;		
	}

	else {
		document.getElementById("grid-container").style.display = "none";
		document.getElementById("moreMenuBtn").style.backgroundColor = "#B80000";
		document.getElementById("moreMenuBtn").style.color = "white";
		document.getElementById("moreMenuBtn").style.padding = "0px 8px";
		active[0] = false;
	}
}

// Header functions ends here
// Main functions starts here

function copyLink() {
	var Url = document.createElement("textarea");
    Url.innerHTML = window.location.href;
    Copied = Url.createTextRange();
    Copied.execCommand("Copy");
}

function openShare() {
	if (active[1] === false) {
		document.getElementById("shareMe").style.display = "block";
		document.getElementById("pointerGraphic").style.display = "block";
		active[1] = true;
	}
	else {
		closeShare();
		active[1] = false;
	}
}

function closeShare() {
	document.getElementById("shareMe").style.display = "none";
	document.getElementById("pointerGraphic").style.display = "none";
}

// Main functions ends here