public class ControlStatementsLoops {

    public static void main(String[] args) {
        int i = 5;
        while(i<=15) {
            System.out.print(i + " ");
            i++;
        }

        int a = 0;
        do {
            System.out.println(a);
            a+=2;
        } while(a<=100);

        int b = 100;
        do{
            System.out.print(b + " ");
            b-=5;
        } while (b>=0);

        long c = 2;
        do{
            System.out.println(c);
            c*=c;
        } while(c<=1000000);

        for(int d = 100; d >= 0; d-=5) {
            System.out.print(d + " for_loop ");
        }
        System.out.println();
        for(long e= 2; e <= 1000000; e*=e) {
            System.out.print(e + " for_loop ");
        }

        for(int f = 1; f<=100; f++) {
            if(f%5==0 && f%3==0) {
                System.out.println("fizzbuzz");
            }else if(f % 3 == 3) {
                System.out.println("fizz");
            } else if(f % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(f);
            }
        }
    }
}
