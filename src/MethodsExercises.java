public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(sayHello("world"));;

    }

    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

}
