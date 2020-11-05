import java.util.*;

public class Main {
    static class Student {

        public int studentNumber;
        public String dob;
        public String favSubject;
    }

    public static void main(String[] args) {
        Student PennyLane = new Student();
        PennyLane.studentNumber = 5;
        PennyLane.dob = "13/10/2005";
        PennyLane.favSubject = "Computer Science";
        Student AbbeyRoad = new Student();
        AbbeyRoad.studentNumber = 6;
        AbbeyRoad.dob = "14/10/2005";
        AbbeyRoad.favSubject = "Computing";
        ArrayList<Student> myStudents = new ArrayList<>();
        myStudents.add(PennyLane);
        myStudents.add(AbbeyRoad);
        System.out.println(myStudents.get(0).dob);
        for (Student s : myStudents) {
            System.out.println(s.favSubject);
        }
    }

}