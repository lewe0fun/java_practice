package service;

import data.Student;
import data.StudentGroup;

import java.util.Collections;
import java.util.List;
import java.util.Iterator;

import static utils.ReadFromTxt.getStudentsFromTxt;
import static utils.ReadFromTxt.getTeacherFromTxt;

public class StudentGroupServiceImpl implements  DataService{

@Override
    public StudentGroup getGroup() {
        return new StudentGroup(getTeacherFromTxt(), getStudentsFromTxt());
    }

    @Override
    public StudentGroup getGroup(int number) {
        return new StudentGroup(getTeacherFromTxt(), getStudentsFromTxt(),number);
    }

    @Override
    public void removeStudent(String firstName,String lastName) {
        Iterator students=getGroup().getStudentList().iterator();

        while(students.hasNext())
        {
            Student student= (Student) students.next();
            if(firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName()))
            {
                students.remove();
            }
        }

    }

    @Override
    public void sortStudents(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());
    }

    @Override
    public void sortStudentsByName(StudentGroup studentGroup) {

    }

}
