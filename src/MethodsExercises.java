public class MethodsExercises {

    public static int addition(int x, int y) {
        return x+y;
    }

    public static int subtraction(int x, int y) {
        return x-y;
    }

    public static int multiplication(int x, int y) {
            return x *y;
            // for bonus you wil use shift and plus operators.
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
        System.out.println(multiplication(3,3));
        System.out.println(division(4,2));
        System.out.println(modulus(4,2));
    }

}