public class Person {
    private String name;

    public void setName(String fullName) {
        name = fullName;
    }

    public String getName() {
        return name;

    }

    public void sayHello() {
        System.out.println("Hello from, " + getName());
    }

    public static void main(String[] args) {

    Person victorP = new Person();
    victorP.setName("victor pena");
    victorP.sayHello();

    Person person1 = new Person();
    Person person2 = person1;
    person1.setName("John");
//    person2.setName("John");

        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        System.out.println(person1.getName()); //john
        System.out.println(person2.getName()); //john
        person2.setName("Jane");
        System.out.println(person1.getName());  //result: is jane because person 2 is person 1
        System.out.println(person2.getName());  //jane

    }
}
