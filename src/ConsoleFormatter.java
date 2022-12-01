public class ConsoleFormatter implements Format{
    @Override
    public String display(Emp emp) {
        return "--------------------" +
                "\n  name:  " + emp.getName() +
                "\n  email: " + emp.getDepartment();
    }
}
