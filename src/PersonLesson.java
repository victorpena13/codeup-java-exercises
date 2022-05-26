public class PersonLesson {
    public static long worldPopulation = 7_500_000_000L;
    public String firstName;
    public String lastName;


    public PersonLesson() {
        System.out.println("A Person is being created!");
    }
    public PersonLesson(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        PersonLesson rick = new PersonLesson();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());

        PersonLesson bestDrummerAlive = new PersonLesson();
        bestDrummerAlive.firstName = "Neil";
        bestDrummerAlive.lastName = "Peart";

        PersonLesson.worldPopulation += 1;

        System.out.println(PersonLesson.worldPopulation);
        System.out.println(rick.sayHello());


    }
}
