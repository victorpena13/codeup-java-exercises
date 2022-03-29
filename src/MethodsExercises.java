public class MethodsExercises {

    public static String sayHello() {
        return "Hello, World";
    }

    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

    public static void changeString(String s) {
        s = "wuba lub a dub dub";
    }

    public static void count(int n) {
        if (n <=0) {
            System.out.println("All Done!");
            return;
        }
        System.out.println(n);
        count(n -1 );
    }

    public static void main(String[] args) {
        System.out.println(sayHello());
        System.out.println(sayHello("world"));
        System.out.println(returnThree());
        System.out.println(shout("does this work?"));

        String changeMe = "hello victor";

        changeString(changeMe);
        System.out.println(changeMe);

        count(10);
    }

}
