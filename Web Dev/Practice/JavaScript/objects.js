// var hero = {
//     hp: 100,
//     mp: 70,
//     str: 30,
//     def: 23,
//     mdef: 24,
// }

// console.log(hero);

var player = {
    name: "Shinigami",
    title: "Demon Lord",
    race: "Demon",
    likes: ["Anime", "Manga", "Swords", "Isekai"],
    dislikes: ["Tea", "Sugar", "Oily Food"],
    stats: {
        hp: 100,
        mp: 50,
        str: 30,
        def: 23,
        mdef: 24,
    },
    powers: {
        spells: {
            fireball: 50,
            pheonixdrive: 150,
            meteorstrike: 200,
            heal: 100,
        },
        physical: {
            attack: 20,
            martialarts: 140,
            swordmaster: 200,
        }
    },
}


console.log(player.powers.spells.fireball);