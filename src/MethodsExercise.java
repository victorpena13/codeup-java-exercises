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
        if (y == 0) {
            System.out.println("undefined");
            return;
        }
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
        division(4,0);
        modulus(4,4);
    }

}
