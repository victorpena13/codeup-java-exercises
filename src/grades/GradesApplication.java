package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void studentGrade(String userInput, HashMap<String, Student> hashmap) {
        if (hashmap.containsKey(userInput)) {
            System.out.println(hashmap.get(userInput).getName());
            System.out.println(hashmap.get(userInput).getGradeAverage());
        } else if (userInput.equalsIgnoreCase("0")) {
            for (Map.Entry<String, Student> username : hashmap.entrySet()) {
                System.out.print(username.getValue().getName() + " | " + username.getKey() + " | ");
                System.out.println(username.getValue().getGradeAverage());
            }
        } else if (userInput.equalsIgnoreCase("1")){
            double average = 0;
            for (Map.Entry<String, Student> username : hashmap.entrySet()) {
                average += username.getValue().getGradeAverage() / hashmap.size();
            }
            System.out.println(average);

        } else {
            System.out.println("Sorry, no student found with the GitHub username of " + "\""+userInput+"\"");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student victor = new Student("victor");
        Student clay = new Student("clay");
        Student elvis = new Student("elvis");
        HashMap<String, Student> students = new HashMap<>();
        victor.addGrade(25);
        victor.addGrade(100);
        victor.addGrade(100);
        victor.recordAttendance("05-04-22", "P");
        victor.recordAttendance("05-05-22", "P");
        victor.recordAttendance("05-06-22", "P");
        clay.addGrade(75);
        clay.addGrade(75);
        clay.addGrade(80);
        clay.recordAttendance("05-04-22", "A");
        clay.recordAttendance("05-05-22", "P");
        clay.recordAttendance("05-06-22", "A");
        elvis.addGrade(40);
        elvis.addGrade(100);
        elvis.addGrade(100);
        elvis.recordAttendance("05-04-22", "P");
        elvis.recordAttendance("05-05-22", "A");
        elvis.recordAttendance("05-06-22", "P");

        System.out.println("test");
        System.out.println(victor.attendanceAverage());
        clay.datesAbsent();

        students.put("victorpena13", victor);
        students.put("apeclay92", clay);
        students.put("elvispresley1", elvis);

        System.out.println("Welcome!");
        System.out.print("github usernames: ");
        for (Map.Entry<String, Student> username : students.entrySet()) {
            System.out.print(username.getKey() + " | ");
        }
        System.out.println("\"0\" - view all\n | \"1\" - class average\"");
        System.out.println("\nWhat student would you like to see more information on?");
        String githubUsername = scanner.next();
        studentGrade(githubUsername, students);
        while (true) {
            System.out.println("Would you like to see another student? [y/n]");
            String yesNo = scanner.next();
            if(yesNo.equalsIgnoreCase("y")) {
                System.out.println("\nWhat student would you like to see more information on?");
                githubUsername = scanner.next();
                studentGrade(githubUsername, students);
            } else if (yesNo.equalsIgnoreCase("n")) {
                System.out.println("goodbye!");
                return;
            } else {
                System.out.println("invalid response");
            }
        }


    }
}

