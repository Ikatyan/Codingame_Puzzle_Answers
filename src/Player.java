import java.util.Scanner;

/**
 * Created by yoshiki-voyager on 16/07/22.
 */
class Player {
    private static int x;
    private static int y;
    private static int nextCheckpointX;
    private static int nextCheckpointY;
    private static int nextCheckpointDist;
    private static int nextCheckpointAngle;
    private static int opponentX;
    private static int opponentY;
    private static boolean boostAvailable;
    private static Scanner in;
    private static String stringSpeed;

    public static void main(String args[]) {
        in = new Scanner(System.in);
        boostAvailable = true;
        int speed = 100;

        // game loop
        while (true) {
            storeShipInfo();
            if (boostAvailable == true) {
                boost();
            } else {
                stringSpeed = Integer.toString(speed);
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // You have to output the target position
            // followed by the power (0 <= thrust <= 100)
            // i.e.: "x y thrust"

            System.out.println(nextCheckpointX + " " + nextCheckpointY + " " + stringSpeed);
        }
    }

    private static void storeShipInfo() {
        x = in.nextInt();
        y = in.nextInt();
        nextCheckpointX = in.nextInt(); // x position of the next check point
        nextCheckpointY = in.nextInt(); // y position of the next check point
        nextCheckpointDist = in.nextInt(); // distance to the next checkpoint
        nextCheckpointAngle = in.nextInt(); // angle between your pod orientation and the direction of the next checkpoint
        opponentX = in.nextInt();
        opponentY = in.nextInt();
    }

    private static void boost() {
        if ((nextCheckpointAngle > 10 || nextCheckpointAngle > -10) && nextCheckpointDist > 10000) {
            boostAvailable = false;
            stringSpeed = "BOOST";
            System.err.println("Use Booster!!!");
        }
    }

    private static void brake() {
    }

    private static void printErrShipInfo() {
        System.err.println("shipPosition = " + x + " y = " + y);
        System.err.println("nextCheckpointPosition = " + nextCheckpointX + "," + nextCheckpointY);
        System.err.println("nextCheckpointDist = " + nextCheckpointDist);
        System.err.println("nextCheckpointAngle");
    }
}
