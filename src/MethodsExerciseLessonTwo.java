public class MethodsExerciseLessonTwo {

    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }
    // public - this is the visibility modifier. defines wheter or not other classes can see this method.
    // static - the presence of this keyword defines that the method belongs to the class, as opposed to instances of it.
    // String - this is the return type of the method.
    // if a method does not return anything the type is void.
    // sayHello - the name of method.
    // String name - the parameters the method accepts.
    // can be defined with no parameters or multiple parameters.
    // everything inside the curly braces is the body of the method.

    public static void sayHello(String greeting, String name) {
        System.out.printf("%s,%s!\n", greeting, name);
    }

    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello("hello", " world");
        }
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

    //loop:
    public static long getPowerLoop(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    //recursion:
    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println(sayHello("victor"));
        sayHello("test", " message");
        sayHello(3);
    }
}
