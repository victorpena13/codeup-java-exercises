public class Person {
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
    }
}
