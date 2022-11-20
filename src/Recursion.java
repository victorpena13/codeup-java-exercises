public class Recursion {

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("all done!");
            return;
        }
        System.out.println(n);
        count(n-1);
    }



    public static long getPower(int base, int exponent) {
        long result = 1;
        for(int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static long getPowerRecursion(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    public static long multiplyRecursion(int x, int y) {
        if(x == 0 || y == 0) {
            return 0;
        } else if (y == 1) {
            return x;
        } else {
            return multiplyRecursion(x,y-1) + x;
        }

    }
    public static void main(String[] args) {
        count(5);
        System.out.println(getPower(2, 2));
        System.out.println(getPower(2,3));
        System.out.println(getPower(2,0));
        System.out.println(getPowerRecursion(2,2));
        System.out.println(multiplyRecursion(4,5));

    }
}
