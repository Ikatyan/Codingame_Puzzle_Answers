package puzzles.easy;

import java.util.Scanner;

/**
 * Created by yoshiki-voyager on 16/07/25.
 */
public class Chuck_Norris {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        char[] mes = MESSAGE.toCharArray();
        String byteMessage = "";
        for (char c : mes) {
            String tempMes = Integer.toBinaryString((int) c);
            if (tempMes.length() < 7) {
                tempMes = "0" + tempMes;
            }
            byteMessage = byteMessage + tempMes;
        }
        char[] message = byteMessage.toCharArray();
        char lastChar;
        char currentChar;
        String convertedMessage = "";

        System.err.println(Integer.toBinaryString((int) message[0]));

        if (message[0] == '1') {
            convertedMessage = convertedMessage + "0 0";
        }
        if (message[0] == '0') {
            convertedMessage = convertedMessage + "00 0";
        }
        for (int index = 1; index < message.length; index++) {
            currentChar = message[index];
            lastChar = message[index - 1];
            if (currentChar == lastChar) {
                convertedMessage = convertedMessage + "0";
            } else {
                if (message[index] == '1') {
                    convertedMessage = convertedMessage + " 0 0";
                }
                if (message[index] == '0') {
                    convertedMessage = convertedMessage + " 00 0";
                }
            }
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(convertedMessage);
    }

}
