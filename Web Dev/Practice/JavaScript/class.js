// Class for mimicing Java output method
class Java {
    constructor(string){
        this.string = string;
    }
    print(string){
        console.log(string);
    }
}

// constructing system object with Java class
var system = new Java();

// printing a string with Java class
system.print("Hello World!");