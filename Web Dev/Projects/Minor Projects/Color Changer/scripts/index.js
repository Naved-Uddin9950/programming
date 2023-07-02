let arr = ["background-color: red", "background-color: blue", "background-color: green"];
let obj = ["Red", "Blue", "Green"];

let j = 0;
clickBtn.style = arr[2];

let bgc = clickBtn.getAttribute('style');

const colorChange = () => {
    for(let i = 1; i<=arr.length; i++){
        if(bgc == arr[i]){
            clickBtn.style = arr[j+1];
            console.log(obj[j+1]);
            console.log("if");
            break;
        }
        else{
            clickBtn.style = arr[j];
            console.log(obj[j]);
            console.log("else");
            break;
        }
    }
    j++;
    
}

j = 0;

clickBtn.addEventListener('click', colorChange);