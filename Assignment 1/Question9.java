import java.util.*;

class Course {
    private String courseName;
    private String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }
}

class Student {
    protected String name;
    protected Course enrolledCourse;

    public Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    public void display() {
        System.out.println(
            "Student: " + name +
            " Course: " + enrolledCourse.getCourseName() +
            " (" + enrolledCourse.getDuration() + ")"
        );
    }
}

class PremiumStudent extends Student {
    private double discount;

    public PremiumStudent(String name, Course enrolledCourse,
                          double discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    public void display() {
        System.out.println(
            "Premium Student: " + name +
            " Course: " + enrolledCourse.getCourseName() +
            " (" + enrolledCourse.getDuration() +
            ") Discount: " + discount + "%"
        );
    }
}

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] courseData = sc.nextLine().split(",");

        Course course = new Course(
            courseData[0],
            courseData[1]
        );

        for (int i = 0; i < 2; i++) {
            String[] studentData = sc.nextLine().split(",");

            Student student;

            if (studentData.length == 2) {
                student = new Student(
                    studentData[0],
                    course
                );
            } else {
                student = new PremiumStudent(
                    studentData[0],
                    course,
                    Double.parseDouble(studentData[2])
                );
            }

            student.display();
        }

        sc.close();
    }
}