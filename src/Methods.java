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
    public static int multiplyLoop(int x , int y) {
        int power= 0;
        for (int i = 1; i <= y; i++) {
            power+=x;
        }
        x = power;
        return x;
    }

    public static int multiplyRecursion(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        } else if (x == 1) {
            return y;
        } else if (y == 1) {
            return y;
        } else {
            return multiplyRecursion(x-1, y) +y;
        }
    }

    public static Object modulus(int x , int y) {
        if(x == 0 || y == 0) {
            return "does not work with zero";
        }
        return x%y;
    }

//    public static int getInteger(int min, int max) {
//
//    }

    public static void main(String[] args) {

        System.out.println(multiplyLoop(4, 5));
        System.out.println(multiplyRecursion(5, 6));
        System.out.println(modulus(2,1));
        System.out.println(modulus(2,0));
    }
}
