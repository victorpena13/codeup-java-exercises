public class Person {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from, " + this.name);
    }

    public static void main(String[] args) {
        Person victor = new Person();
        victor.setName("victor");
        victor.sayHello();

        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("victor");
        person2.setName("victor");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);


    }
}
