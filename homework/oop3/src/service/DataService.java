package service;

import data.StudentGroup;

public interface DataService {
    StudentGroup getGroup();
    StudentGroup getGroup(int number);
    void removeStudent(String firstName,String lastName);
    void sortStudents(StudentGroup studentGroup);
    void sortStudentsByName(StudentGroup studentGroup);
}
