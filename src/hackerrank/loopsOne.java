package hackerrank;

import java.util.Scanner;

public class loopsOne {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int counter = 1;

        while (counter <= 10) {
            System.out.println(n + " x " + counter + " = " + (counter * n));
            counter++;
        }


    }
}
