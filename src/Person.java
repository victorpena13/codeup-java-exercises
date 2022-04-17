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
    }
}
