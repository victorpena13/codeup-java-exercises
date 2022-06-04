package grades;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Student victor = new Student("victor");
        Student clay = new Student("clay");
        Student elvis = new Student("elvis");
        HashMap<String, String> students = new HashMap<>();
        victor.addGrade(25);
        victor.addGrade(100);
        victor.addGrade(100);
        clay.addGrade(75);
        clay.addGrade(75);
        clay.addGrade(80);
        elvis.addGrade(40);
        elvis.addGrade(100);
        elvis.addGrade(100);

        students.put(victor.getName() , "victorpena13");
        students.put(clay.getName() , "apeclay92");
        students.put(elvis.getName() , "elvispresley1");
        System.out.println(students.get("victor pena"));


    }
}

