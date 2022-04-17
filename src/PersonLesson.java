public class PersonLesson {
    public static long worldPopulation = 7_500_000_000L;
    public String firstName;
    public String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        PersonLesson rick = new PersonLesson();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";

        PersonLesson ada = new PersonLesson();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";

        PersonLesson grace = new PersonLesson();
        grace.firstName = "Grace";
        grace.lastName = "Hopper";

        PersonLesson theBestDrummerAlive = new PersonLesson();
        theBestDrummerAlive.firstName = "Neil";
        theBestDrummerAlive.lastName = "Peart";

        System.out.println(rick.sayHello());
        System.out.println(ada.sayHello());
        System.out.println(grace.sayHello());
        System.out.println(PersonLesson.worldPopulation +=4);
        // static fields - are accessible through class itself and not through instance.
        System.out.println(Math.PI);
    }
}
