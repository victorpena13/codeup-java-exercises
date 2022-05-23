
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
    public static void main(String[] args) {
        addition(2,2);
        subtraction(4,2);
        multiplication(2,3);
        division(4,2);
        System.out.print("division ");
        division(5,0);
        modulus(4,2);
        System.out.println(multiplicationWithoutStar(3, 3));


    }
}
