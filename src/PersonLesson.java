public class PersonLesson {
    public static long worldPopulation = 7_500_000_000L;

    private String firstName;
    private String lastName;
    private int age;

    public PersonLesson(String first_name, String last_name) {
        this.firstName = first_name;
        this.lastName = last_name;

    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public PersonLesson() {
        System.out.println("A person is being created");
    }

    public String sayHello() {
        return String.format("Hello from %s %s!", this.firstName, this.lastName);
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