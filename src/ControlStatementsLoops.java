import java.util.Scanner;

public class ControlStatementsLoops {

    public static void main(String[] args) {
        int i = 5;
        while(i<=15) {
            System.out.print(i + " ");
            i++;
        }

        int a = 0;
        do {
            System.out.println(a);
            a+=2;
        } while(a<=100);

        int b = 100;
        do{
            System.out.print(b + " ");
            b-=5;
        } while (b>=0);

        long c = 2;
        do{
            System.out.println(c);
            c*=c;
        } while(c<=1000000);

        for(int d = 100; d >= 0; d-=5) {
            System.out.print(d + " for_loop ");
        }
        System.out.println();
        for(long e= 2; e <= 1000000; e*=e) {
            System.out.print(e + " for_loop ");
        }

        for(int f = 1; f<=100; f++) {
            if (f % 5 == 0 && f % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (f % 3 == 3) {
                System.out.println("fizz");
            } else if (f % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(f);
            }

            Scanner scan = new Scanner(System.in);
            String answer;

            do {
                System.out.print("enter an integer: ");
                Scanner scanner = new Scanner(System.in);
                int userInt = scanner.nextInt();

                System.out.println("number | squared | cubed");
                for (int l = 1; l <= userInt; l++) {
                    System.out.printf("%-7d|%-9d|%-8d%n", l, l * l, l * l * l);
                }
                System.out.println("again? [y/n]");
                answer = scan.next();
            } while(answer.equalsIgnoreCase("y"));

            String playAgain;
            do {
                System.out.print("enter a numerical grade from 0 to 100: ");
                int userGrade = scan.nextInt();

                if (userGrade >= 95 && userGrade <= 100) {
                    System.out.println("A+");
                } else if (userGrade >= 90 && userGrade <= 94) {
                    System.out.println("A-");
                } else if (userGrade >= 85 && userGrade <= 89) {
                    System.out.println("B+");
                } else if (userGrade >= 80 && userGrade <= 84) {
                    System.out.println("B-");
                } else if (userGrade >= 75 && userGrade <= 79) {
                    System.out.println("C+");
                } else if (userGrade >= 70 && userGrade <= 74) {
                    System.out.println("C-");
                } else {
                    System.out.println("F");
                }

                System.out.print("play again? [y/n]");
                playAgain = scan.next();
            } while(playAgain.equalsIgnoreCase("y"));

        }
    }
}
