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
    }


}
