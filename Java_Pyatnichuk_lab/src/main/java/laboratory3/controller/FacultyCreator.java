package laboratory3.controller;

import laboratory3.model.*;
public class FacultyCreator implements Creator<Faculty> {
    @Override
    public Faculty create(String name, Human header) {
        return new Faculty(name, header);
    }
}
