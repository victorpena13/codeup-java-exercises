import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static long multiply(long a, long b) {
        return a * b;
    }
    public static long divide(long a, long b) {
        return a / b;
    }
    public static long modulous(long a, long b) {
        return a % b;
    }
    public static int wloopmultiply(int x, int y) {
        int a = x-1;
        while (a > 0) {
            y = y + x;
            a--;
        }
        return y;
    }
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int inputNumber = sc.nextInt();
        if(inputNumber > max || inputNumber < min){
            inputNumber = getInteger(min, max);
        }
        return inputNumber;
    }


//    public static void factorialGame() {
//        Scanner scanner = new Scanner(System.in);
//        do {
//            int fact = getInteger(1, 10);
//
//            factorialChart(fact);
//
//            System.out.println("Wanna play again?");
//            if (!scanner.nextLine().toUpperCase().contains("Y")) return;
//        } while(true);
//    }

    public static String getFactorial() {
        int num = getInteger(1, 10);
        String output = "";
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total = total * i;
            output += i + "! = " + (total) + "\n";
        }
        return output;
    }

    public static int rollDie(int sides) {
        return (int) Math.ceil(Math.random() * sides);
    }

    public static void rollDice() {
        System.out.println("Let's roll two dice, how many sides on each");
        int sides = getInteger(4,20);
        int die1 = rollDie(sides);
        int die2 = rollDie(sides);
        System.out.printf("You rolled a %d and a %d.\n", die1, die2);

    }


    public static void main(String[] args) {

        System.out.println(add(3,4));
        System.out.println(subtract(3,4));
        System.out.println(multiply(3,4));
        System.out.println(divide(20,5));
        System.out.println(modulous(20,4));
        System.out.println(wloopmultiply(6,6));
        System.out.println(getInteger(1,10));
        System.out.println(getFactorial());

        rollDice();


    }
}
