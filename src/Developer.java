public class Developer extends Emp {
    public Developer(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "writing code";
    }

    public static void main(String[] args) {
        Format fmt = new ConsoleFormatter();


        Developer developer1 = new Developer("victor", "engineer");

        System.out.println(fmt.display(developer1));
    }
}
