public class MethodsExerciseLesson {

    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static String sup(String greeting, String name) {
        return String.format("%s, %s!\n", greeting, name);
    }

    public static void main(String[] args) {
        System.out.println(sayHello("Victor"));
        System.out.println(sup("whats up", "dude"));

    }

}
