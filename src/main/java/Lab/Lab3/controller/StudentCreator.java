package Lab.Lab3.controller;

import Lab.Lab3.model.Group;
import Lab.Lab3.model.Sex;
import Lab.Lab3.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group) {
        return new Student(firstName, lastName, patronymic, sex, group);
    }
}
