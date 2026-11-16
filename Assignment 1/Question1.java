import java.util.*;

class Professor {
    private String name;
    private String employeeId;
    private String specialization;

    public Professor() {
    }

    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + employeeId +
               ", Specialization: " + specialization;
    }
}

class Department {
    private String deptName;
    private String hodName;
    private List<Professor> professors;

    public Department() {
        professors = new ArrayList<>();
    }

    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        professors = new ArrayList<>();
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    public String toString() {
        String result = "Department: " + deptName + "\n";
        result += "HOD: " + hodName + "\n";
        result += "Professors:\n";

        for (Professor p : professors) {
            result += p + "\n";
        }

        return result;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Department details (deptName,hodName)");
        String[] dept = sc.nextLine().split(",");

        Department d = new Department(dept[0], dept[1]);

        System.out.println("Enter number of professors");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter professor details (name,employeeId,specialization)");

        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(",");

            Professor p = new Professor(data[0], data[1], data[2]);
            d.addProfessor(p);
        }

        System.out.println(d);

        sc.close();
    }
}