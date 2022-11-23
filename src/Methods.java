import java.util.Scanner;

public class Methods {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int divide(int x , int y) {
        return x/y;
    }

    public static int subtract(int x, int y) {
        return x -y;
    }
    public static int multiplyLoop(int x , int y) {
        int power= 0;
        for (int i = 1; i <= y; i++) {
            power+=x;
        }
        x = power;
        return x;
    }

    public static int multiplyRecursion(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        } else if (x == 1) {
            return y;
        } else if (y == 1) {
            return y;
        } else {
            return multiplyRecursion(x-1, y) +y;
        }
    }

    public static Object modulus(int x , int y) {
        if(x == 0 || y == 0) {
            return "does not work with zero";
        }
        return x%y;
    }

    public static String getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInteger;
        do{
            System.out.print("enter an integer between " + min + " and " + max + ": ");
            userInteger = scanner.nextInt();
        }while(userInteger < min || userInteger > max);
        return "You did it: " + userInteger;
    }

    public static void getIntegerRecursion(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an integer between " + min + " and " + max + ": ");
        int userInteger = scanner.nextInt();
        if(userInteger < min || userInteger > max) {
                getIntegerRecursion(min, max);
        } else {
            System.out.println("you did it: " + userInteger);
        }
    }

    public static int factorialRecursion(int x) {
        if(x == 0) {
            return 1;
        } else if(x == 1) {
            return 1;
        } else if (x == 2) {
            return 2;
        } else {
            return factorialRecursion(x-1) *x;
        }
    }

    public static void factorial(int x) {
        int result;
        for(int i = 1; i<= x; i++) {
            result = 1;
            System.out.print(i+"! = ");
            for(int j=1; j<=i;j++) {
                System.out.print(j);
                result = result*j;
                if(j!=i) {
                    System.out.print(" x ");
                }
            }
            System.out.println(" = " + result);
        }
    }

    public static void main(String[] args) {
        factorial(4);
        System.out.println("end");
        System.out.println(factorialRecursion(6));
        System.out.println(sum(100, 1));
        System.out.println(subtract(50,50));
        System.out.println(divide(0,10));
        System.out.println(multiplyLoop(4, 5));
        System.out.println(multiplyRecursion(5, 6));
        System.out.println(modulus(2,1));
        System.out.println(modulus(2,0));
        System.out.println(getInteger(1,10));
        getIntegerRecursion(1,10);
    }


}
