package inheritanceAndPolymorphism;

public class Employee extends Person{
    private double salary;

    public void doWork() {
        System.out.println("Work, work...");
    }

    public Employee(String employeeName) {
        super(employeeName);
    }

    public static void main(String[] args) {
        Person p = new Person("P");
        Employee john = new Employee("John");
        john.sayHello();
        john.doWork();
        System.out.println(john.name);
        p.sayHello();
//        p.doWork();  //superclasses do not extend subclasses.


    }
}
