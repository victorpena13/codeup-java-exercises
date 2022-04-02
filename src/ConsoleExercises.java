public class ConsoleExercises {
    public static void main(String[] args) {
        int a = 5;
        while(a<=15) {
            System.out.println(a);
            ++a;
        }
        int b = 0;
        do {
                if(b % 2 == 0) {
                    System.out.println(b);
                }
                b++;
        } while (b<=100);
        int c = 100;
        do {
            System.out.println(c);
            c-=5;
        } while(c>0);

        for (long d = 2; d < 1000000; d *= d) {
            System.out.println(d);
        }
    }
}