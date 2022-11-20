public class Methods {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int divide(int x , int y) {
        return x /y;
    }

    public static int subtract(int x, int y) {
        return x -y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    public static int multiplyLoop(int x , int y) {
        int power= 0;
        for (int i = 1; i <= y; i++) {
            power+=x;
        }
        x = power;
        return x;
    }

    public static void count(int n) {
        if(n<=0) {
            System.out.println("all done");
        }
    }


    public static void main(String[] args) {

        System.out.println(multiplyLoop(4, 5));
    }
}
