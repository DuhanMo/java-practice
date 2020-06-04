package silsub7.model.vo;

public class Employee {
    private static int count = 1;
    private int empNo;
    private String empName;
    private String dept;
    private int age;
    private char gender;
    private int salary;
    private String phone;
    private String address;


    {
        empNo = count++;
    }

    public Employee() {
    }

    public Employee(String empName, String dept, int age, char gender, int salary, String phone, String address) {


        this.empName = empName;
        this.dept = dept;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.phone = phone;
        this.address = address;
    }



    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String intformation() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
