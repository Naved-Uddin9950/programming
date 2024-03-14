import ribald from "ribald";

let input = "This is a test string containing vulgar words like fuck, asshole, and slut.";

let detectedWords = ribald(input);

console.log(detectedWords);