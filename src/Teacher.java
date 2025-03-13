
public class Teacher extends School {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private double salaryEarned;
    private School school;
    public Teacher(int id, String firstName, String lastName, double salary, School school) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.school = school;
    }
    Teacher(){
        salaryEarned=0.0;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getSalary() {
        return salary;
    }
    public School getSchool() {
        return school;
    }
    public double getSalaryEarned(){
        return salary;
    }
    public void receiveSalary(){
        return;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", school=" + school +
                '}';
    }
}
