import java.util.Locale;

public class MethodsExerciseLesson {

    public static String sayHello() {
        return "Hello, World!";
    }

    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static String sayHello(String greeting, String name) {
        return String.format("%s, %s!\n", greeting, name);
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

    public static void main(String[] args) {
        System.out.println(sayHello());
        System.out.println(sayHello("Victor"));
        System.out.print(sayHello("whats up", "dude"));
        System.out.println(returnThree());
        System.out.println(shout(sayHello("whatsup", "dudette")));
    }
}
