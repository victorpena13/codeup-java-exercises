import java.util.Scanner;
public class MethodsExerciseTwo {
    public static void addition(int x,int y) {
        System.out.println(x+y);
    }
    public static void subtraction(int x, int y) {
        System.out.println(x-y);
    }
    public static void multiplication(int x, int y) {
        System.out.println(x*y);
    }
    public static int multiplicationWithoutStar(int x, int y) {
        int result = 0;
        for(int i =1; i<=y; i++) {
            result = result+x;
        }
        return result;
    }
    public static void division(int x, int y) {
        if (y == 0) {
            System.out.println("undefined");
            return;
        }
        System.out.println(x/y);
    }

    public static void modulus(int x, int y) {
        System.out.println(x%y);
    }

    public static void factorialOriginal() {
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
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int userInt = scanner.nextInt();
        int fact=1;
        for(int i =1; i <= userInt;i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static int factorial(int n) {
        if (n==0) {
            return 1;
        } else {
            return(n*factorial(n-1));
        }
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer from 1 to 10");
        int userInteger = scanner.nextInt();
        if(userInteger < min) {
            System.out.println("that is smaller");
            getInteger(min,max);
        } else if(userInteger > max) {
            System.out.println("that is larger");
            getInteger(min,max);
        }
        return userInteger;
    }

    public static void main(String[] args) {
        addition(2,2);
        subtraction(4,2);
        multiplication(2,3);
        division(4,2);
        System.out.print("division ");
        division(5,0);
        modulus(4,2);
        System.out.println(multiplicationWithoutStar(3, 3));
        System.out.println(getInteger(1,10));
        factorial();
        System.out.println(factorial(6));
        factorialOriginal();


    }
}
