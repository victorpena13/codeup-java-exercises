package grades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void studentGrade(String userInput, HashMap<String, Student> hashmap) {
        if (hashmap.containsKey(userInput)) {
            System.out.println(hashmap.get(userInput).getName());
            System.out.println(hashmap.get(userInput).getGradeAverage());
        }
    }

    public static void main(String[] args) {
        Student victor = new Student("victor");
        Student clay = new Student("clay");
        Student elvis = new Student("elvis");
        HashMap<String, Student> students = new HashMap<>();
        victor.addGrade(25);
        victor.addGrade(100);
        victor.addGrade(100);
        clay.addGrade(75);
        clay.addGrade(75);
        clay.addGrade(80);
        elvis.addGrade(40);
        elvis.addGrade(100);
        elvis.addGrade(100);

        students.put("victorpena13", victor);
        students.put("apeclay92", clay);
        students.put("elvispresley1", elvis);

        System.out.println("Welcome!");
        System.out.print("These are the github usernames of our students: ");
        for (Map.Entry<String, Student> username : students.entrySet()) {
            System.out.print(username.getKey() + " | ");
        }
        System.out.println();
        studentGrade("apeclay92", students);

    }
}

