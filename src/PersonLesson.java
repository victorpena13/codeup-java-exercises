public class PersonLesson {
    public static long worldPopulation = 7_500_000_000L;

    public String firstName;
    public String lastName;

    public PersonLesson() {
        System.out.println("A person is being created");
    }

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }


    public static void main(String[] args) {
        PersonLesson rick = new PersonLesson();
        rick.firstName = "rick";
        rick.lastName = "sanchez";
        System.out.println(rick.sayHello());

        PersonLesson ada = new PersonLesson();
        ada.firstName = "ada";
        ada.lastName = "lovelace";

        PersonLesson grace = new PersonLesson();
        grace.firstName = "grace";
        grace.lastName = "hopper";

        System.out.println(ada.sayHello());
        System.out.println(grace.sayHello());

        PersonLesson theBestDrummerAlive = new PersonLesson();
        theBestDrummerAlive.firstName = "Travis";
        theBestDrummerAlive.lastName = "Barker";

        PersonLesson.worldPopulation += 1;

        System.out.println(PersonLesson.worldPopulation);
        System.out.println(theBestDrummerAlive.worldPopulation);
    }
}