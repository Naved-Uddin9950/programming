let words = [
    "Fuck", "Shit", "Asshole", "Bitch", "Cunt", "Dick", "Pussy", "Cock", "Slut", "Whore", 
    "Bastard", "Motherfucker", "Douchebag", "Wanker", "Twat", "Arsehole", "Ass", "Blowjob", 
    "Masturbate", "Fucker", "Fornicate", "Jerk", "Prick", "Slag", "Bollocks", "Bugger", 
    "Piss", "Toss", "Bonk", "Screw", "Shag", "Bang", "Hump", "Frig", "Grope", "Snatch", 
    "Schlong", "Rimjob", "Gash", "Pound", "Spank", "Cocksucker", "Clit", "Cocksucking", 
    "Clunge", "Dildo", "Felch", "Gooch", "Poon", "Queef", "Spunk", "Tit", "Bastardize", 
    "Bawdy", "Booty", "Buttplug", "Clam", "Cojones", "Fap", "Fudgepacker", "Jizz", 
    "Knob", "Nookie", "Poonani", "Quim", "Schmuck", "Scrotum", "Shaft", "Sod", "Taint", 
    "Titty", "Turd", "Wank", "Ballbag", "Beef Curtains", "Bellend", "Bollocking", 
    "Bush", "Cum", "Dingleberry", "Dong", "Ejaculate", "Flange", "Glans", "Gonads", 
    "Goo", "Handjob", "Helmet", "Knobhead", "Meat curtains", "Muff", "Pecker", "Prude", 
    "Pube", "Pussy-whipped", "Raunchy", "Scat", "Semen", "Smegma", "Wench",
    // Hinglish cuss/vulgar words
    "lode", "loda", "chut", "choot", "bhosda", "ma chuda", "lun", "lund", "randi", "randwa", 
    "gaand", "gand", "chod", "chodu", "chodna", "harami", "haramzada", "kutte", "kutta", 
    "kamine", "kamina", "behenchod", "madarchod", "gandu", "saala", "saali", "gaandu", 
    "kuttiya", "bhosdi", "bhadwa", "rundi", "gandu", "chakka", "chakke", "hijra", "hijre", 
    "chinal", "chinaal", "chutiya", "chutiyapa", "loda", "lodi", "hijdo", "londiya", 
    "lund", "lundya", "chootiya", "chootiyapa"
];


let ribald = (e) => {
    let element = e.toLowerCase(); // converts all elements to lowercase 
    let detect = []; // will store detected cuss words
    for(let i=0; i<words.length; i++) {
        let word = words[i].toLowerCase();
        if(element.includes(word)) {
            detect.push(word);
        }
    }
    let filt = element;
    for(let i=0; i<detect.length; i++) {
        if(element.includes(detect[i])) {
            filt = filt.replaceAll(detect[i], "****");
        }
    }

    let json = {
        "original" : element,
        "words" : detect,
        "count" : detect.length,
        "filter" : filt
    }
    return json;
}

export default ribald;