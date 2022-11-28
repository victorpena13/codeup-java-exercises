import java.util.Arrays;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello from, " + this.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("john");
        person1.getName();
        person1.sayHello();

        Person person2 = new Person();
        person2.setName("victor");

        System.out.println(person1.getName().equals(person2.getName()));
    }
}