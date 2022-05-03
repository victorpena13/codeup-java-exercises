public class MethodsExerciseLesson {

    public static String sayHello(String name) {
        return String.format("Hello, %s", name);
    }

    public static void sayHello(String greeting, String name) {
        System.out.printf("%s, %s!\n", greeting, name);
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(sayHello("victor"));
        sayHello("victor can overload a", "method");// no need to sout because it is inside method
        System.out.println(returnThree());
        System.out.println(shout("these letters should be capitalized!"));
    }
}
