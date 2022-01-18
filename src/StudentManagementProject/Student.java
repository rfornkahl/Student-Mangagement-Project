package StudentManagementProject;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompts the user to enter the student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - for Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
        this.gradeLevel = in.nextInt();
        setStudentID();
       // System.out.println(firstName + " " + lastName + " Grade Level: " + gradeLevel + " " + studentID);


    }


    // Generate an ID
    private void setStudentID(){
        //Grade Level + ID
        id++;
        this.studentID = gradeLevel + "" + id;
    }


    // Enroll in courses.
    //!course.equals("Q") means the course is not equal to "Q". course != "Q" was not accurately
    //read by the program, so since the if statement is checking a String we could swithc to
    //.equals

    public void enroll() {
        // Get inside a loop, user hits 0 when done enrolling in courses
        do {
            System.out.print("Enter a course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        }while (1 != 0);


      //System.out.println("ENROLLED IN: " + courses);

    }

    // View balance
public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
}

    // Pay Tuition
public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment amount: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $"+ payment);
        viewBalance();
}

    // Show status
    public String toString(){
         return "\nName: " + firstName + " " + lastName +
                 "\nGrade Year: " + gradeLevel +
                 "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
