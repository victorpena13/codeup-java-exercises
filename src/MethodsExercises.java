public class MethodsExercises {

    public static int addition(int x, int y) {
        return x+y;
    }

    public static int subtraction(int x, int y) {
        return x-y;
    }

    public static int multiplication(int x, int y) {
            int power = 0;
            for (int i = 1; i<= y; i++) {
                power = power + x;
            }
            // for bonus you wil use shift and plus operators.
        return power;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;

    }

    public static void main(String[] args) {
        System.out.println(addition(1, 4));
        System.out.println(subtraction(0,1));
        System.out.println("multiply:");
        System.out.println(multiplication(12,3));
        System.out.println(division(4,2));
        System.out.println(modulus(4,2));
    }

}