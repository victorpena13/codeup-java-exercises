public class StudentLesson {
    public String name;
    public String cohort;

    public StudentLesson(String studentName) {
        name = studentName;
        cohort = "Unassigned";
    }

    public StudentLesson(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort;
    }

    public String getInfo() {
        return String.format("name: %s, cohort: %s", name, cohort);

    }

    public static void main (String[] args) {
        StudentLesson s1 = new StudentLesson("Student A");
        StudentLesson s2 = new StudentLesson("Student B", "Voyagers");
        System.out.println(s1.getInfo());
        System.out.println(s2.getInfo());

    }
}
