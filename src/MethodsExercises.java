import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        int power = 0;
        for (int i = 1; i <= y; i++) {
            power = power + x;
        }
        return power;
    }


    public static int division(int x, int y) {
        if (x == 0) {
            return 0;
        } else if (y == 0) {
            System.out.print("undefined ");
            return -1;
        }
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput < min) {
            System.out.println("the number:" + userInput + " is smaller then " + min);
            getInteger(min, max);
        } else if (userInput > max) {
            System.out.println("the number:" + userInput + " is bigger then " + max);
            getInteger(min, max);
        }
        return userInput;
    }

    public static long factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a new number");
        long n = scanner.nextInt();
        long fact;
        for(int i = 1; i <= n; i++) {
            fact = 1;
            System.out.print(i + "! = ");
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) System.out.print(" x ");
                fact = fact * j;
            }
            System.out.println(" = " + fact);
        }
        return n;
    }



    public static void main(String[] args) {
        System.out.println(addition(1, 4));
        System.out.println(subtraction(0,1));
        System.out.println(multiplication(12,0));
        System.out.println(division(4,2));
        System.out.println(division(4,0));
        System.out.println(division(0,4));
        System.out.println(modulus(4,2));
        System.out.println(getInteger(1,10));
        System.out.println(factorial());
    }
}