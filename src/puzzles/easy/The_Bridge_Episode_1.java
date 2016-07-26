package puzzles.easy;

import java.util.Scanner;

/**
 * Created by yoshiki-voyager on 16/07/27.
 */
public class The_Bridge_Episode_1 {
    private static String keyword;
    private static boolean UsedJamp;
    private static int maxSpeed;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int road = in.nextInt(); // the length of the road before the gap.
        int gap = in.nextInt(); // the length of the gap.
        int platform = in.nextInt(); // the length of the landing platform.

        // game loop
        while (true) {
            int speed = in.nextInt(); // the motorbike's speed.
            int coordX = in.nextInt(); // the position on the road of the motorbike.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if (UsedJamp) {

                if (platform - coordX <= maxSpeed) {
                    keyword = "SLOW";
                } else {
                    keyword = "WAIT";
                }

            } else {

                if (speed != gap + 1) {
                    if (speed > gap + 1) {
                        keyword = "SLOW";
                    } else {
                        keyword = "SPEED";
                    }

                } else if (coordX == road - 1) {
                    keyword = "JUMP";
                    UsedJamp = true;
                    maxSpeed = speed;

                } else {
                    keyword = "WAIT";
                }
            }


            // A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.
            System.out.println(keyword);
        }
    }
}
