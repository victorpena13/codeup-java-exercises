public class MethodsExerciseLesson {

    public static String sayHello(String name) {
        return String.format("Hello, %s", name);
    }

    public static void main(String[] args) {
        System.out.println(sayHello("victor"));
    }
}
