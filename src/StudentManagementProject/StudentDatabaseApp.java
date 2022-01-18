package StudentManagementProject;


import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
// Manual entry of objects
       // Student stu1 = new Student();
       // stu1.enroll();
       // stu1.payTuition();
       // System.out.println(stu1.toString());

        //Ask how many new users we want to add
        //Creating an array of student objects
System.out.print("Enter number of new students to enroll: ");
Scanner in = new Scanner(System.in);
int numOfStudents = in.nextInt();
Student[] students = new Student[numOfStudents];

        //Create n number of new students
for (int i=0; i<numOfStudents; i++){
    students[i] = new Student();
    students[i].enroll();
    students[i].payTuition();
    // print out each object after being entered
    // System.out.println(students[i].toString());
}
//print out all the array indexes for students
        for (int j=0; j<numOfStudents; j++){
            System.out.println(students[j].toString());
        }
//print out each individually after being called seperatly
       // System.out.println(students[0].toString());
        //System.out.println(students[1].toString());
        //System.out.println(students[2].toString());
    }
}