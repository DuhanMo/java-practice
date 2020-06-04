package silsub4.model.vo;

public class Student {

    private static int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    static {
        grade = 4;
    }

    {
        classroom = 11;
        name = "홍길동";
        height = 195.2;
        gender = 'M';
    }

    public Student() {
    }


    public static int getGrade() {
        return grade;
    }

    public static void setGrade(int grade) {
        Student.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String information() {
        return "Student{" +
                "grade=" + grade +
                ", classroom=" + classroom +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }
}
