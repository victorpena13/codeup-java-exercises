package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student extends StudentTest {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
        attendance = new HashMap<String , String>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double average = 0;
        for(double grade : grades) {
            average += grade;
        }
        return average / grades.size();
    }



    public void recordAttendance(String date, String value) {
        attendance.put(date, value);
    }

    public double attendanceAverage() {
        double total = 0;
        for (Map.Entry<String, String> username : attendance.entrySet()) {
            if (username.getValue().equalsIgnoreCase("p")) {
                total++;
            }

        }
        return total / attendance.size();
    }

    public void datesAbsent() {
        for (Map.Entry<String, String> username : attendance.entrySet()) {
            if (username.getValue().equalsIgnoreCase("a")) {
                System.out.println(username.getKey());
            }
        }

    }
}
