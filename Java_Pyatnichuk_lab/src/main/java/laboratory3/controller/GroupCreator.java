package laboratory3.controller;

import laboratory3.model.*;
public class GroupCreator implements Creator<Group> {
    @Override
    public Group create(String name, Human header) {
        return new Group(name, header);
    }
}
