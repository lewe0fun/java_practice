package controller;

import data.GroupStream;
import data.StudentGroup;
import service.DataService;
import service.GroupStreamServiceImpl;
import service.StreamService;


import java.util.List;


public class Controller {
private DataService groupService;
private StreamService streamService;

    public Controller(DataService groupService) {
        this.groupService = groupService;
    }

    public Controller(GroupStreamServiceImpl streamService) {
        this.streamService = streamService;
    }

    public StudentGroup createGroup(int groupNumber)
    {
        return groupService.getGroup(groupNumber);
    }
    public void streamListSort(List<GroupStream> groupStream)
    {
        streamService.streamSort(groupStream);
    }
}
