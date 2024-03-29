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

        for(int e = 100; e>0; e-=5) {
            System.out.println(e);
        }

        // in order to square a number from 2 to 1000000 a long must be used.
        long k = 2;
        do {
            System.out.println(k);
            k *= k;
        } while(k < 1000000);

        for (long d = 2; d < 1000000; d *= d) {
            System.out.println(d);
        }

        //fizzbuzz
        int j = 1;
        do {
            j++;
            if(j % 5 == 0 && j%3==0) {
                System.out.println("fizzbuzz");
                continue;
            } else if (j % 5 == 0) {
                System.out.println("buzz");
                continue;
            } else if (j%3==0){
                System.out.println("fizz");
                continue;
            }
            System.out.println(j);
        } while(j < 100);

        


    }
}