package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student vic = new Student("vic");
        vic.addGrade(100);
        vic.addGrade(50);
        System.out.print(vic.getName() + ": ");
        System.out.println(vic.getGradeAverage());
        vic.recordAttendance("06-06-2022", "P");
        vic.recordAttendance("06-07-2022", "P");
        vic.recordAttendance("06-08-2022", "A");
        System.out.println(vic.attendanceAverage());
        vic.datesAbsent();

    }

}
