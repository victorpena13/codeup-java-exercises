public class PersonLesson {

    // class - is used t o define a custom type in java. blue print for objects to be created on it. 
    // field - variable or method that belongs to an object or a class. 
    // object - is an instance of a class 
    //        - have field and methods, and are instantiated, created with the new keyword.

    public String firstName; 
    public String lastName;

    public String sayHello() {
        return String.format("hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {

        PersonLesson rick = new PersonLesson();
        rick.firstName = "rick";
        rick.lastName = "sanchez";
        System.out.println(rick.sayHello());

    }
}