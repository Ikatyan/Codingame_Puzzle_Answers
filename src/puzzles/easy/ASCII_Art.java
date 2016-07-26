package puzzles.easy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by yoshiki-voyager on 16/07/25.
 */
public class ASCII_Art {
    private static final char[] alfabetNumberList =
            {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '?'};

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        String[][] asciiArtList = new String[alfabetNumberList.length][H];
        char[] text = T.toUpperCase().toCharArray();
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            for (int index = 0; index < alfabetNumberList.length; index++) {
                int beginIndex = index * L;
                int endIndex = beginIndex + L - 1;
                asciiArtList[index][i] = ROW.substring(beginIndex, endIndex);
            }
        }
        ArrayList<Integer> intList = convertNumberIntoChar(text);
        for (int height = 0; height < H; height++) {
            String line = "";
            for (int i : intList) {
                line = line + asciiArtList[i][height];
            }
            System.out.println(line);
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("answer");
    }

    private static ArrayList<Integer> convertNumberIntoChar(char[] text) {
        ArrayList<Integer> intList = new ArrayList<>();
        for (char c : text) {
            for (int index = 0; index < alfabetNumberList.length; index++) {
                if (c == alfabetNumberList[index]) {
                    intList.add(index);
                    break;
                }
                if (index == alfabetNumberList.length - 1) {
                    intList.add(index);
                    break;
                }
            }
        }
        return intList;
    }

}
