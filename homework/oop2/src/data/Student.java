package data;

public class Student extends User{
    private String department;
    private int course;
    public Student(String firstName, String lastName, int id,String department,int course) {
        super(firstName, lastName, id);
        this.course=course;
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
