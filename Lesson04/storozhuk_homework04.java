package Lesson04;

import java.util.Random;
import java.util.Scanner;

public class storozhuk_homework4 {

    public static final boolean debug = false;
    public static final boolean whole = true;

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static boolean gameContinue = true;
    public static boolean levelComplete = false;

    //player
    public static int playerX;
    public static int playerY;
    public static int playerHp = 100;
    public static String playerName = "username";
    public static int difficulty = 1;

    //map
    public static char[][] map;
    public static int mapMinX = 4;
    public static int mapMinY = 4;
    public static int mapMaxX = 10;
    public static int mapMaxY = 10;
    public static int mapW;
    public static int mapH;

    //map legend
    public static char player = '@';
    public static char trap = 't';
    //    public static char enemy = 'e';
    public static char wall = '#';
    public static char stair = '>';
    public static char empty = '_';
    public static char ready = '*';

    //traps
    public static int trapCount;
    public static int trapDamage;

    //key binding
    public static final int moveUp = 8;
    public static final int moveDown = 2;
    public static final int moveLeft = 4;
    public static final int moveRight = 6;
    public static final int spell = 5;
    public static final int quit = 0;

// ===============================================================================================
    public static void main (String[]args){

        if (debug) System.out.println("main game loop");

        do {
            createMap();
            spawnPlayer();
            spawnTraps();
            spawnWalls();
            spawnStair();
            levelComplete = false;
            System.out.println("To win - go to the stairs (>) to the next level and stay alive.");

            do {
                if (debug) System.out.println("level loop");

                showMap(!whole);
                playerAction();

                if (playerHp <= 0) {
                    System.out.println(playerName + " is dead ! ! !");
                    gameContinue = false;
                }

                if (levelComplete) {
                    System.out.println(playerName + " find stair to next level");
                    difficulty++;
                }

            } while (!levelComplete && gameContinue);
            System.out.print("Pres any key to continue...");
            //спасибо, яндекс
            try {
                System.in.read();
            }
            catch(Exception e)
            {}

        } while (gameContinue);
        System.out.println("Game over, glad to see again.");

    }
// ===============================================================================================

    public static int randomValue ( int min, int max){
        return min + random.nextInt(max - min + 1);
    }

    public static void createMap () {
        if (debug) System.out.println("*debug*  Create map");
        mapW = randomValue(mapMinX, mapMaxX);
        mapH = randomValue(mapMinY, mapMaxY);
        map = new char[mapH][mapW];

        for (int y = 0; y < mapH; y++) {
            for (int x = 0; x < mapW; x++) {
                map[y][x] = empty;
            }
        }
        System.out.println("Map created, " + mapW + "x" + mapH);
    }

    public static void spawnPlayer () {
        if (debug) System.out.println("*debug*  Spawn player");
        playerX = randomValue(0, mapW - 1);
        playerY = randomValue(0, mapH - 1);
        map[playerY][playerX] = player;
        System.out.println(playerName + " has spawn at " + difficulty + " difficulty with " + playerHp + " HP");
    }

    public static void spawnTraps () {
        if (debug) System.out.println("*debug*  Spawn traps");

        trapCount = (((mapW + mapH) / 2) + difficulty);
        trapDamage = randomValue(playerHp/(trapCount*5), playerHp/(trapCount*3) + difficulty*3);

        if (debug) System.out.println("*debug*  (mapW + mapH)=" + (mapW + mapH) + ", trapCount=" + trapCount);
        if (debug) System.out.println("*debug*  playerHp/trapCount/3=" + playerHp / trapCount / 3 + ", playerHp/3=" + playerHp / 3 + ", difficulty*10=" + difficulty * 10);

        int trapX;
        int trapY;

        for (int i = 1; i <= trapCount; i++) {
            do {
                trapX = random.nextInt(mapW);
                trapY = random.nextInt(mapH);
            } while (isEmpty(trapX, trapY));
            map[trapY][trapX] = trap;
        }
        System.out.println(trapCount + " traps has been placed with damage = " + trapDamage);
    }

    public static boolean isEmpty ( int x, int y){
        return (map[y][x] != empty);
    }

    public static void spawnWalls () {
        if (debug) System.out.println("*debug*  Spawn walls");

        int wallCount = ((mapW + mapH) / 2);
        int wallX;
        int wallY;

        for (int i = 1; i <= wallCount; i++) {
            do {
                wallX = random.nextInt(mapW);
                wallY = random.nextInt(mapH);
            } while (isEmpty(wallX, wallY));
            map[wallY][wallX] = wall;
        }
    }

    public static void spawnStair () {
        if (debug) System.out.println("*debug*  Spawn down stair");
        int stairX;
        int stairY;
        do {
            stairX = random.nextInt(mapW);
            stairY = random.nextInt(mapH);
        } while (isEmpty(stairX, stairY));
        map[stairY][stairX] = stair;
    }

    public static void playerAction () {
        if (debug) System.out.println("*debug*  player action");
        int playerChoice;
        boolean validChoice;
        boolean choiceMove;

        do {
            System.out.print("Take your actions (move up: " + moveUp + " | move down: " + moveDown + " | move left: " +
                    moveLeft + " | move right: " + moveRight + " | use spell: " + spell + " | quit: " + quit + "): ");

            choiceMove = false;

            playerChoice = scanner.nextInt();
            switch (playerChoice) {
                case spell:
                    playerSpell();
                    validChoice = true;
                    break;
                case quit:
                    System.out.println("Game interrupted by user.");
                    gameContinue = false;
                    validChoice = true;
                    break;
                default:
                    validChoice = validMove(playerX, playerY, playerChoice);
                    choiceMove = true;
                    break;
            }

            if (choiceMove && !validChoice)
                System.out.println("!!! Route not available!!! Please try again!");

        } while (!validChoice);

        if (choiceMove) {
            moveAction(playerX, playerY, playerChoice);
        }
    }

    public static void showMap ( boolean showWhole){
        if (debug) System.out.println("*debug*  Show map, show Whole is " + showWhole);

        System.out.print(" ");
        for (int x = 0; x < mapW; x++) {
            System.out.print("_ ");
        }
        System.out.println();

        for (int y = 0; y < mapH; y++) {
            System.out.print("|");
            for (int x = 0; x < mapW; x++) {
                if (showWhole) {
                    System.out.print(map[y][x] + "|");
                } else {
                    if (map[y][x] != trap) {
                        System.out.print(map[y][x] + "|");
                    } else {
                        System.out.print(empty + "|");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void playerSpell () {
        if (debug) System.out.println("*debug* playerSpell");
        showMap(whole);
        System.out.print("Pres any key to continue...");
        try {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    public static boolean validMove ( int oldX, int oldY, int route){
        if (debug) System.out.println("*debug*  Check valid move");

        int newX = oldX;
        int newY = oldY;

        switch (route) {
            case moveUp:
                newY = oldY - 1;
                break;
            case moveDown:
                newY = oldY + 1;
                break;
            case moveLeft:
                newX = oldX - 1;
                break;
            case moveRight:
                newX = oldX + 1;
                break;
        }
        return (newX >= 0  &&  newX < mapW  &&  newY >= 0  &&  newY < mapH  &&  map[newY][newX] != wall);
    }

    public static void moveAction (int oldX, int oldY, int route){
        if (debug) System.out.println("*debug*  Do move");

        int newX = oldX;
        int newY = oldY;

        switch (route) {
            case moveUp:
                newY = oldY - 1;
                break;
            case moveDown:
                newY = oldY + 1;
                break;
            case moveLeft:
                newX = oldX - 1;
                break;
            case moveRight:
                newX = oldX + 1;
                break;
        }

        if (map[newY][newX] == trap) {
            playerHp -= trapDamage;
            trapCount--;
            System.out.println(playerName + " has " + trapDamage + " damage from trap. " + playerName + " HP = " + playerHp);
        }

        if (map[newY][newX] == stair)
            levelComplete = true;

        map[oldY][oldX] = ready;
        map[newY][newX] = player;
        playerX = newX;
        playerY = newY;
        System.out.println(playerName + " move to [" + (newX + 1) + ":" + (newY + 1) + "]");
    }

}