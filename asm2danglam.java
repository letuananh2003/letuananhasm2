import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asm2danglam {
    static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong sv:");
        n = scanner.nextInt();
        scanner.nextLine();  // Clear the buffer

        for (int i = 1; i <= n; i++) {
            input(scanner);
        }
        System.out.println("IN DANH SACH SV:");
        output();
    }

    // Nhap moi 1 sinh vien
    public static void input(Scanner scanner) {
        System.out.println("Nhap vao thong tin sinh vien:");

        System.out.println("Nhap ma sv:");
        String code = scanner.nextLine();
        System.out.println("Nhap ten sv:");
        String name = scanner.nextLine();
        System.out.println("Nhap diem:");
        float grade = scanner.nextFloat();
        scanner.nextLine();  // Clear the buffer
        Student student = new Student(code, name, grade);
        studentList.add(student);
    }

    // In danh sach sinh vien
    public static void output() {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    public static void removeByCode(String code) {
        // Implement removal logic here
    }

    public static void sortByGradeDesc() {
        // Implement sorting logic here
    }

    public static Student findByCodeOrName(String keyword) {
        // Implement finding logic here
        return null;
    }

    public static List<Student> filterByGrade(float x) {
        // Implement filtering logic here
        return null;
    }
}

class Student {
    private String code;
    private String name;
    private float grade;

    public Student(String code, String name, float grade) {
        this.code = code;
        this.name = name;
        this.grade = grade;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}