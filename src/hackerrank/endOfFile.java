package hackerrank;

import java.util.Scanner;

public class endOfFile {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int i = 1;
        while (stdin.hasNextLine()) {
            String str = stdin.nextLine();
            if(str.isEmpty())
                break;
            System.out.println(i + " " + str);
        }
    }
}
