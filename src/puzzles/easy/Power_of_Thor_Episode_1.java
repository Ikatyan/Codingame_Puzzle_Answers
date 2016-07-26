package puzzles.easy;

import java.util.Scanner;

public class Power_of_Thor_Episode_1 {
    private static int xDist;
    private static int yDist;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        xDist = lightX - initialTX;
        yDist = lightY - initialTY;
        // game loop
        while (true) {
            String direction;
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            System.err.println(xDist + " " + yDist);
            if (xDist == 0 || yDist == 0) {
                direction = tateyokoidou();
            } else {
                direction = nanameidou();
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(direction);
        }
    }

    private static String nanameidou() {
        String direction = "";
        if (xDist > 0) {
            if (yDist > 0) {
                direction = "SE";
            } else if (yDist < 0) {
                direction = "NE";
            }

        } else {
            if (yDist > 0) {
                direction = "SW";
            } else {
                direction = "NW";
            }
        }
        return direction;
    }

    private static String tateyokoidou() {
        String direction = "";
        if (xDist == 0) {
            if (yDist > 0) {
                direction = "S";
            }
            if (yDist < 0) {
                direction = "N";
            }
        }
        if (yDist == 0) {
            if (xDist > 0) {
                direction = "E";
            }
            if (xDist < 0) {
                direction = "W";
            }
        }
        return direction;
    }
}
