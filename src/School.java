
public class School {
    private Teacher[] teachers=new Teacher[10];
    private Student[] students=new Student[10];
    private int teachersCount=0;
    private int studentsCount=0;
    School(){}
    public Teacher[] getTeachers() {
        return teachers;
    }
    public Student[] getStudents() {
        return students;
    }
    public void addTeacher(Teacher teacher){
        if(teachersCount>=teachers.length){
            Teacher[] temp=new Teacher[teachers.length*2];
            for(int i=0;i<teachers.length;i++){
                temp[i]=teachers[i];
            }
            teachers=temp;
        }
        teachers[teachersCount++]=teacher;
        teacher.setSchool(this);
    }
    public void addStudent(Student student){
        if(studentsCount>=students.length) {
            Student[] temp = new Student[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                temp[i] = students[i];
            }
            students = temp;
        }
        students[studentsCount++]=student;
    }
    public double getTotalMoneyEarned(){
        double totalMoneyEarned=0;
        for(int i=0;i<studentsCount;i++){
            totalMoneyEarned+=students[i].getFeesPaid();
        }
        return totalMoneyEarned;
    }
    public  double getTotalMoneySpent(){
        double totalMoneySpent=0;
        for(int i=0;i<studentsCount;i++){
            totalMoneySpent+=students[i].getFeesPaid();
        }
        return totalMoneySpent;
    }

}
