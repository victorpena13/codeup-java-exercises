public class PolymorphismDemo {

    public static void work(Employee e) {
        e.doWork();
    }

    public static void main(String[] args) {
        Employee one = new Employee("lana", "del rey");
        Employee two = new Manager("shania", "twain");

        work(one);
        work(two);


    }
}
