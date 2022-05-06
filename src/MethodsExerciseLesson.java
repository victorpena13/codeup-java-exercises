public class MethodsExerciseLesson {

    public static void sayHello() {
         sayHello("Hello", "World!");
    }

    public static void sayHello(int times) {
        for (int i =0; i < times; i += 1) {
            sayHello();
        }
    }

    public static void sayHello(String name) {
      sayHello("Hello, ", name);
    }

    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + " " + name);
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase();
    }

    public static String changeString(String s) {
        return s = "wub a lub a dub dub";
    }

    // recursion:
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n-1);
    }

    //loop:
    public static long getPowerLoop(int base, int exponent) {
        long result = 1;
        for(int i =1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    //recursion:
    public static long getPowerRecursion(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent ==1) {
            return base;
        } else if (exponent == 2) {
            return base*base;
        }
        return base * getPowerRecursion(base, exponent-1);
    }

    public static void main(String[] args) {
        sayHello(5);
        sayHello("victor");
        sayHello("victor can overload a", "method");// no need to sout because it is inside method
        System.out.println(returnThree());
        System.out.println(shout("these letters should be capitalized!"));

        String changeMe = "hello VP";
        String variableTest = changeString(changeMe);
        System.out.println(variableTest);
        System.out.println(changeMe);
        count(5);
        System.out.println(getPowerLoop(2, 4));
        System.out.println(getPowerRecursion(2,4));
    }
}
