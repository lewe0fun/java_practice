package controller;

import data.StudentGroup;
import service.DataService;

//Создать метод в Controller createGroup(int groupNumber), в который передается номер группы, а возвращается StudentGroup.
public class Controller {
private DataService groupService;

    public Controller(DataService groupService) {
        this.groupService = groupService;
    }
    public StudentGroup createGroup(int groupNumber)
    {
        return groupService.getGroup(groupNumber);
    }
}
