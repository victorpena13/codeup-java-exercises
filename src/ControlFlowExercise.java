public class ControlFlowExercise {
    public static void main(String[] args) {
        System.out.println("while loop:");
        int i = 5;

        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\ndo-while loop:");
        int a = 0;
        do {
            System.out.print(a + " ");
            a+=2;
        } while (a <= 100);

        int b = 100;
        do {
            System.out.println(b);
            b-=5;
        } while (b >= -10);

        long c = 2;
        do {
            System.out.println(c);
            c*=c;
        } while (c <= 1000000);

        for(int d = 0; d <= 100; d++) {
            if (d% 2 ==1) {
                continue;
            }
            System.out.print(d+" ");
        }

        for(int e = 100; e >= -10; e-=5) {
            System.out.println(e);
        }

        System.out.println("FizzBuzz:");
        for(int x=1; x<=100; x++) {
            if(x%3==0) {
                System.out.println("FIZZ");
                continue;
            } else if(x%5==0) {
                System.out.println("BUZZ");
                continue;
            }
            System.out.println(x);
        }
    }
}
