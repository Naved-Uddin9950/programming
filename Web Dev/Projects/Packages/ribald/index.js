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
    "Pube", "Pussy-whipped", "Raunchy", "Scat", "Semen", "Smegma", "Wench"
  ];

let ribald = (e) => {
    let element = e.toLowerCase();  
    let detect = [];
    for(let i=0; i<words.length; i++) {
        let word = words[i].toLowerCase();
        if(element.includes(word[i])) {
            detect.push(words[i]);
        }
    }
    return detect;
}

export default ribald;