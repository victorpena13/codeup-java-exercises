package grades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

        students.put("victorpena13", victor.getName());
        students.put("apeclay92", clay.getName());
        students.put("elvispresley1", elvis.getName());

        System.out.print("github usernames: ");
        for(Map.Entry<String, String> set : students.entrySet()) {
            System.out.print( set.getKey() + " | ");
        }
        System.out.print("\nenter the username you would like more information on: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
    }
}

