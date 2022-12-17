package service;

import data.StudentGroup;

public interface DataService {
    StudentGroup getGroup();
    StudentGroup getGroup(int number);
}
