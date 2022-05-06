public class MethodsExercise {

    public static void addition(int x,int y) {
        System.out.println(x + y);
    }

    public static void subtraction(int x, int y) {
        System.out.println(x-y);
    }

    public static void multiplication(int x, int y) {
        System.out.println(x*y);
    }

    public static void division(int x, int y) {
        System.out.println(x/y);

    }

    public static void modulus(int x, int y) {
        System.out.println(x%y);
    }


    public static void main(String[] args) {
        addition(2,5);
        subtraction(2,5);
        multiplication(2,5);
        division(4,2);
        modulus(4,4);
    }

}
