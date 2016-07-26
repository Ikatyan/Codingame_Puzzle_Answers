package puzzles.easy;

import java.util.Scanner;

/**
 * Created by yoshiki-voyager on 16/07/24.
 */
public class Temperatures {
    private static int closestTemp;
    private static int closestRange;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        String[] tempsList = temps.split(" ");
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for (int index = 0; index < n; index++) {
            int temp = Integer.parseInt(tempsList[index]);
            if (index == 0) {
                closestTemp = temp;
                closestRange = Math.abs(temp);
                continue;
            }
            checkClosest(temp);

        }
        System.out.println(closestTemp);
    }

    private static void checkClosest(int temp) {
        if (temp != closestTemp) {
            int range = Math.abs(temp);
            if (range < closestRange) {
                closestTemp = temp;
                closestRange = range;
            }
            if (range == closestRange) {
                closestRange = range;
            }
        }


    }
}
