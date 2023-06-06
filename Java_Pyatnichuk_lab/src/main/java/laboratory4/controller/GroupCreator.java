package laboratory4.controller;

import laboratory4.model.*;
public class GroupCreator implements Creator<Group> {
    @Override
    public Group create(String name, Human header) {
        return new Group(name, header);
    }
}
