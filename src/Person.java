public class Person {
    public static long worldPopulation = 7_500_000_000L;
    public String firstName;
    public String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";

        Person ada = new Person();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";

        Person grace = new Person();
        grace.firstName = "Grace";
        grace.lastName = "Hopper";

        Person theBestDrummerAlive = new Person();
        theBestDrummerAlive.firstName = "Neil";
        theBestDrummerAlive.lastName = "Peart";

        System.out.println(rick.sayHello());
        System.out.println(ada.sayHello());
        System.out.println(grace.sayHello());
        System.out.println(Person.worldPopulation +=4);
        // static fields - are accessible through class itself and not through instance.
        System.out.println(Math.PI);


    }
}
