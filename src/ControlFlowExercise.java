import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[] args) {
        System.out.println("while loop:");
        int i = 5;

        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\ndo-while loop:");
        int a = 0;
        do {
            System.out.print(a + " ");
            a+=2;
        } while (a <= 100);

        int b = 100;
        do {
            System.out.println(b);
            b-=5;
        } while (b >= -10);

        long c = 2;
        do {
            System.out.println(c);
            c*=c;
        } while (c <= 1000000);

        for(int d = 0; d <= 100; d++) {
            if (d% 2 ==1) {
                continue;
            }
            System.out.print(d+" ");
        }

        for(int e = 100; e >= -10; e-=5) {
            System.out.println(e);
        }

        System.out.println("FizzBuzz:");
        for(int x=1; x<=100; x++) {
            if(x%3==0) {
                System.out.println("FIZZ");
                continue;
            } else if(x%5==0) {
                System.out.println("BUZZ");
                continue;
            }
            System.out.println(x);
        }

        System.out.print("Enter a numerical grade from 0 to 100: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if(grade >= 88 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade <= 87) {
            System.out.println("B");
        } else if (grade >= 67 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 66) {
            System.out.println("D");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println("F");
        } else {
            System.out.println("thats not a number between 0 and 100");
        }
    }
}
