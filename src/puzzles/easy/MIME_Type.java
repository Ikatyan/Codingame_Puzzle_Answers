package puzzles.easy;

import java.util.Scanner;

/**
 * Created by yoshiki-voyager on 16/07/26.
 */
public class MIME_Type {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        String ExtList[] = new String[N];
        String MTList[] = new String[N];
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            ExtList[i] = EXT.toLowerCase();
            MTList[i] = MT;
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            int lastDotIndex = FNAME.lastIndexOf(".");
            String printMes = "UNKNOWN";
            if (lastDotIndex != -1) {
                int fNameLength = FNAME.length();
                String fNameExt = FNAME.substring(lastDotIndex + 1, fNameLength).toLowerCase();
                for (int index = 0; index < N; index++) {
                    if (ExtList[index].equals(fNameExt)) {
                        printMes = MTList[index];
                        break;
                    }
                }
            }
            System.out.println(printMes);
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
    }
}
