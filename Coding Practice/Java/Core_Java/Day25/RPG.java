// Project 01 :
// Basic Console Based Single Player RPG Game

package Core_Java.Day25;
import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] monsters = {"Slime", "Goblin", "Skeleton", "Wolf", "Orc", "Dragon", "Golem", "Wyvern", "Fire Elemental", "Water Elemental", "Air Elemental", "Earth Elemental", "Chimera", "Harpy", "Troll", "Gargoyle", "Basilisk", "Demon"};
        String monster = monsters[(int) (Math.random() * monsters.length)];

        System.out.print("Enter your player name : ");
        String player = sc.nextLine();
        System.out.printf("%s encountered a %s \n", player, monster);

        Player you = new Player(player, 30, 20, 8, 8);
        Monster opp = new Monster(monster);
        battle(you, opp);
    }

    public static void battle(Player player, Monster monster) {
        int playerHP = player.hp;
        int monsterHP = monster.hp;

        while(monsterHP > 0 || playerHP > 0) {
            int playerDamage = monster.pow - player.def;
            playerHP -= playerDamage;
            System.out.printf("%s took damage: %d\n", player.name, playerDamage);

            if(playerHP <= 0) {
                System.out.printf("%s lost the battle, monster %s killed you\n", player.name, monster.name);
                return;
            }

            int monsterDamage = player.pow - monster.def;
            monsterHP -= monsterDamage;
            System.out.printf("%s took damage: %d\n", monster.name, monsterDamage);

            if(monsterHP <= 0) {
                System.out.printf("%s won the battle, monster %s is killed\n", player.name, monster.name);
                player.Level();
                return;
            }
        }
    }
}

class Player {
    String name;
    int hp, mp, str, def, pow, lvl = 1, exp = 0;
    Player(String name, int hp, int mp, int str, int def) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.str = str;
        this.def = def;
        pow = (hp * 2) + (mp * 3) + (str * 5) - (def * 2);
    }
    public void Level() {
        this.hp += 4;
        this.mp += 3;
        this.str += 2;
        this.def += 2;
        this.lvl++;
        System.out.printf("%s leveled up. Now you are level %d \n", this.name, lvl);
    }
}

class Monster {
    String name;
    int hp, mp, str, def, pow;
    Monster(String name) {
        this.name = name;

        switch (this.name) {
            case "Slime":
                // Slimes are usually weak but have high defense
                this.hp = (int) (Math.random() * 5) + 5;
                this.mp = (int) (Math.random() * 3) + 1;
                this.str = (int) (Math.random() * 3) + 1;
                this.def = (int) (Math.random() * 7) + 3;
                break;

            case "Goblin":
                // Goblins are agile but not very strong
                this.hp = (int) (Math.random() * 8) + 5;
                this.mp = (int) (Math.random() * 5) + 1;
                this.str = (int) (Math.random() * 5) + 3;
                this.def = (int) (Math.random() * 5) + 1;
                break;

            case "Skeleton":
                // Skeletons are weak but have high attack power
                this.hp = (int) (Math.random() * 6) + 3;
                this.mp = (int) (Math.random() * 4) + 1;
                this.str = (int) (Math.random() * 8) + 5;
                this.def = (int) (Math.random() * 4) + 1;
                break;

            case "Wolf":
                // Wolves are balanced in stats
                this.hp = (int) (Math.random() * 7) + 4;
                this.mp = (int) (Math.random() * 5) + 1;
                this.str = (int) (Math.random() * 6) + 2;
                this.def = (int) (Math.random() * 6) + 2;
                break;

            case "Orc":
                // Orcs are strong but slower
                this.hp = (int) (Math.random() * 9) + 8;
                this.mp = (int) (Math.random() * 4) + 1;
                this.str = (int) (Math.random() * 9) + 6;
                this.def = (int) (Math.random() * 6) + 4;
                break;

            case "Dragon":
                // Dragons are extremely powerful
                this.hp = (int) (Math.random() * 15) + 10;
                this.mp = (int) (Math.random() * 10) + 5;
                this.str = (int) (Math.random() * 15) + 10;
                this.def = (int) (Math.random() * 10) + 5;
                break;

            case "Golem":
                // Golems are heavily armored
                this.hp = (int) (Math.random() * 12) + 10;
                this.mp = (int) (Math.random() * 6) + 1;
                this.str = (int) (Math.random() * 12) + 8;
                this.def = (int) (Math.random() * 15) + 10;
                break;

            case "Wyvern":
                // Wyverns are agile with moderate stats
                this.hp = (int) (Math.random() * 10) + 6;
                this.mp = (int) (Math.random() * 8) + 2;
                this.str = (int) (Math.random() * 10) + 5;
                this.def = (int) (Math.random() * 8) + 3;
                break;

            case "Fire Elemental":
                // Fire Elementals have high attack and moderate stats
                this.hp = (int) (Math.random() * 8) + 5;
                this.mp = (int) (Math.random() * 10) + 5;
                this.str = (int) (Math.random() * 10) + 5;
                this.def = (int) (Math.random() * 6) + 2;
                break;

            case "Water Elemental":
                // Water Elementals have high defense and moderate stats
                this.hp = (int) (Math.random() * 10) + 5;
                this.mp = (int) (Math.random() * 10) + 8;
                this.str = (int) (Math.random() * 6) + 2;
                this.def = (int) (Math.random() * 10) + 5;
                break;

            case "Air Elemental":
                // Air Elementals are agile with moderate stats
                this.hp = (int) (Math.random() * 8) + 3;
                this.mp = (int) (Math.random() * 12) + 5;
                this.str = (int) (Math.random() * 6) + 2;
                this.def = (int) (Math.random() * 8) + 3;
                break;

            case "Earth Elemental":
                // Earth Elementals have high defense and moderate stats
                this.hp = (int) (Math.random() * 12) + 8;
                this.mp = (int) (Math.random() * 8) + 3;
                this.str = (int) (Math.random() * 6) + 2;
                this.def = (int) (Math.random() * 12) + 8;
                break;

            case "Chimera":
                // Chimeras are a mix of different creatures with high stats
                this.hp = (int) (Math.random() * 15) + 8;
                this.mp = (int) (Math.random() * 10) + 5;
                this.str = (int) (Math.random() * 15) + 8;
                this.def = (int) (Math.random() * 10) + 5;
                break;

            case "Harpy":
                // Harpies are agile with moderate stats
                this.hp = (int) (Math.random() * 8) + 3;
                this.mp = (int) (Math.random() * 10) + 3;
                this.str = (int) (Math.random() * 6) + 2;
                this.def = (int) (Math.random() * 8) + 3;
                break;

            case "Troll":
                // Trolls are resilient with high defense
                this.hp = (int) (Math.random() * 15) + 10;
                this.mp = (int) (Math.random() * 6) + 1;
                this.str = (int) (Math.random() * 10) + 5;
                this.def = (int) (Math.random() * 15) + 10;
                break;

            case "Gargoyle":
                // Gargoyles are heavily armored
                this.hp = (int) (Math.random() * 12) + 10;
                this.mp = (int) (Math.random() * 6) + 1;
                this.str = (int) (Math.random() * 12) + 8;
                this.def = (int) (Math.random() * 15) + 10;
                break;

            case "Basilisk":
                // Basilisks are dangerous with high attack and moderate defense
                this.hp = (int) (Math.random() * 12) + 8;
                this.mp = (int) (Math.random() * 8) + 3;
                this.str = (int) (Math.random() * 15) + 8;
                this.def = (int) (Math.random() * 10) + 5;
                break;

            case "Demon":
                // Demons are powerful with high stats
                this.hp = (int) (Math.random() * 20) + 15;
                this.mp = (int) (Math.random() * 15) + 10;
                this.str = (int) (Math.random() * 20) + 15;
                this.def = (int) (Math.random() * 15) + 10;
                break;

            default:
                this.hp = (int) (Math.random() * 10) + 1;
                this.mp = (int) (Math.random() * 10) + 1;
                this.str = (int) (Math.random() * 10) + 1;
                this.def = (int) (Math.random() * 10) + 1;
        }
        pow = (hp * 2) + (mp * 3) + (str * 5) - (def * 2);
    }
}