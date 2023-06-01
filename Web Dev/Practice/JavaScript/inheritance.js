// NOTE: Improve it

class Human{
    constructor(walk){
        this.walk = walk;
    }
    canWalk(walk){
        walk = "Human can walk!";
        console.log(walk);
    }
}

class Naved extends Human{
    constructor(walk){
        super(walk);
        this.walk = walk;
    }
    canWalk(walk){
        walk = "Naved can walk";
        console.log(walk);
    }
}

var me = new Naved();
me.canWalk();