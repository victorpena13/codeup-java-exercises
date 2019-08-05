package Grades;


import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student victor = new Student("victor");
        victor.addGrade(90);
        victor.addGrade(85);
        victor.addGrade(75);
        students.put("victorpena13", victor);
        System.out.println(students.get("victorpena13").getName());
        System.out.println(victor.getGradeAverage());
    }
}
