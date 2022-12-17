//логика чтения Студентов и Преподавателя из файла txt
//создания класса StudentGroup и возвращения его.
package service;

import data.StudentGroup;
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
}
