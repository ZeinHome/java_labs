package laboratory3.controller;

import laboratory3.model.*;
public class DepartmentCreator implements Creator<Department> {
    @Override
    public Department create(String name, Human header) {
        return new Department(name, header);
    }
}