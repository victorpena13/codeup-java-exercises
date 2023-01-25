public class MathTest {

    public static void main(String[] args) {

            // this class is only referenced statically, meaning that we never create instances of it.

        System.out.println(staticClasses.Arithmetic.pi);
        System.out.println(staticClasses.Arithmetic.add(5,5));
        System.out.println(staticClasses.Arithmetic.multiply(5,5));

    }
}