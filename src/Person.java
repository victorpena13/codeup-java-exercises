public class Person {
    public static long worldPopulation = 7_500_000_000L;
    public String firstName;
    public String lastName;

    public String sayhello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayhello());

        Person bestDrummerAlive = new Person();
        bestDrummerAlive.firstName = "Neil";
        bestDrummerAlive.lastName = "Peart";

        Person.worldPopulation += 1;

        System.out.println(Person.worldPopulation);
    }
}
