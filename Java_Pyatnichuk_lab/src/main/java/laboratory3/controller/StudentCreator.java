package laboratory3.controller;

import laboratory3.model.*;
public class StudentCreator implements Creator<Student> {
    @Override
    public Student create(String name, Human header) {
        return new Student(name, header.getFirstName(), header.getLastName(), header.getSurname(), header.getGender());
    }
}
