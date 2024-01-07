// targeted elements from here
const page = document.getElementById("mainContent");
const bold = document.getElementById("fontBold");
const italic = document.getElementById("fontItalic");
const underline = document.getElementById("fontUnderline");

// initialized boolean values in some variables to access and change it later on changes
let isBold = false;
let isItalic = false;
let isUnderline = false;

// function to change the font with 'onchange' function within html
const fontFamily = (font) => {
    page.style.fontFamily = font.value;
}

// function to change the size of the font with 'onchange' function within html
const fontSize = (size) => {
    page.style.fontSize = size.value + 'px';
}

// function to make the normal text bold and bold text back to normal on 'onclick'
const fontBold = () => {
    if (isBold == false) {
        page.style.fontWeight = "bold";
        bold.style = "border: 1px solid black; border-radius: 20%; font-size: 18px; background-color: #5E6472; color: #FAF3DD";
        isBold = true;
    }
    else{
        page.style.fontWeight = "normal";
        isBold = false;
        bold.style = "border: normal; font-size: 16px; background-color: #ea7317; color: black";
    }
}

// function to make the normal text italic and italic text back to normal on 'onclick'
const fontItalic = () => {
    if (isItalic == false) {
        page.style.fontStyle = "italic";
        italic.style = "border: 1px solid black; border-radius: 20%; font-size: 18px; background-color: #5E6472; color: #FAF3DD";
        isItalic = true;
    }
    else{
        page.style.fontStyle = "normal";
        isItalic = false;
        italic.style = "border: normal; font-size: 16px; background-color: #ea7317; color: black";
    }
}

// function to make the normal text underline and underlined text back to normal on 'onclick'
const fontUnderline = () => {
    if (isUnderline == false) {
        page.style.textDecoration = "underline";
        underline.style = "border: 1px solid black; border-radius: 20%; font-size: 18px; background-color: #5E6472; color: #FAF3DD";
        isUnderline = true;
    }
    else{
        page.style.textDecoration = "none";
        underline.style = "border: normal; font-size: 16px; background-color: #ea7317; color: black";
        isUnderline = false;
    }
}