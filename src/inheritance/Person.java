package inheritance;
public class Person {
    public String name;

    public Person(String name) {
        this.name=name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }

    public String getName() {
        return name;
    }
}
