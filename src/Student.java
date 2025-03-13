public class Student extends Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private double feesPaid;
    private double fessTotal;
    private School school;
    public Student(int id, String firstName, String lastName, int grade, double fessTotal) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.fessTotal = fessTotal;
    }
    Student(){
        feesPaid = 0.0;
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
    public int getGrade() {
        return grade;
    }
    public double getFeesPaid() {
        return feesPaid;
    }
    public double getFessTotal() {
        return fessTotal;
    }
    public double getRemainingFees(){
        return fessTotal-=feesPaid;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public void pay(int fees){
        feesPaid += fees;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", fessTotal=" + fessTotal +
                ", school=" + school +
                '}';
    }
}
