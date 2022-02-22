import java.io.PrintStream;

public class MethodsExercises {

    public static PrintStream sayHello(String name) {
        return System.out.printf("Hello, %s!", name);
    }

    public static void main(String[] args) {
        sayHello("world");
    }
}
