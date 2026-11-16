import java.util.*;

class Room {
    private String roomNumber;
    private String block;
    private String type;

    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    public String toString() {
        return "Room: " + roomNumber +
               " " + block +
               " " + type;
    }
}

class Student {
    private String name;
    private int roll;
    private String course;
    private Room room;

    public Student(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    public String toString() {
        return "Student: " + name +
               " (" + roll + ") " + course +
               "\n" + room;
    }
}

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] studentData = sc.nextLine().split(",");
        String[] roomData = sc.nextLine().split(",");

        Room room = new Room(
            roomData[0],
            roomData[1],
            roomData[2]
        );

        Student student = new Student(
            studentData[0],
            Integer.parseInt(studentData[1]),
            studentData[2],
            room
        );

        System.out.println(student);

        sc.close();
    }
}