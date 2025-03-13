
public class School {
    private Teacher[] teachers=new Teacher[100];
    private Student[] students=new Student[100];
    int teachersIndex=0;
    int studentsIndex=0;
    School(){}
    public Teacher[] getTeachers() {
        return teachers;
    }
    public Student[] getStudents() {
        return students;
    }
    public double getTotalMoneyEarned(){
        double totalMoneyEarned=0;
        for(Teacher teacher : teachers){

        }
        return totalMoneyEarned;
    }
    public  double getTotalMoneySpent(){
        double totalMoneySpent=0;
        for(Student student : students){

        }
        return totalMoneySpent;
    }
    public void addTeacher(Teacher teacher){
        this.teachers[teachersIndex++]=teacher;

    }
    public void addStudent(Student student){
        for(Teacher teacher : teachers){
            this.students[studentsIndex++]=student;
        }
    }

}
