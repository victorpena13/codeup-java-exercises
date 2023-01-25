package staticClasses;

public class Arithmetic {

    // this class is only referenced statically, meaning that we never create instances of it.

    public static double pi = 3.14159;

    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }
    
}
