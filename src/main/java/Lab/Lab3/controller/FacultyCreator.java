package Lab.Lab3.controller;

import Lab.Lab3.model.Faculty;
import Lab.Lab3.model.Human;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
