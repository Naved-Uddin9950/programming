var comp_rand = Math.random() * 3;
var comp = Math.floor(comp_rand);
var player_rand = Math.random() * 3;
var player = Math.floor(player_rand);

switch (player) {
    case 1:
        console.log("You got Rock");
        player = 1;
        break;

    case 2:
        console.log("You got Paper");
        player = 2;
        break;

    case 3:
        console.log("You got Scissors");
        player = 3;
        break;

    default:
        console.log("You got Rock")
        ++player;
        break;
}

switch (comp) {
    case 1:
        console.log("Your opponent got Rock");
        comp = 1;
        break;

    case 2:
        console.log("Your opponent got Paper");
        comp = 2;
        break;

    case 3:
        console.log("Your opponent got Scissors");
        comp = 3;
        break;

    default:
        console.log("Your opponent got Rock");
        ++comp;
        break;
}

if (player == comp) {
    console.log("It's a tie.")
}

else if (player == 1 && comp == 2) {
    console.log("Opponent Won");
}

else if (player == 2 && comp == 3) {
    console.log("Opponent Won");
}

else if (player == 3 && comp == 1) {
    console.log("Opponent Won");
}

else if (comp == 1 && player == 2) {
    console.log("You Won");
}

else if (comp == 2 && player == 3) {
    console.log("You Won");
}

else if (comp == 3 && player == 1) {
    console.log("You Won");
}

// else if (player == 1 && comp == 2 | player == 2 && comp == 3 | player ==3 && comp == 1) {
//     console.log("Opponent wins");
// }

// else if (comp == 1 && player == 2 | comp == 2 && player == 3 | comp == 3 && player == 1) {
//     console.log("Player wins");
// }