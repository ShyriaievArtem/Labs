package Lab.Lab3.controller;

import Lab.Lab3.ComponentCreator;
import Lab.Lab3.model.University;

public class Run {
    public static void main(String[] args) {
        ComponentCreator componentCreator = new DefaultComponentCreator();
        UniversityCreator universityCreator = new UniversityCreator(componentCreator);
        University university = universityCreator.createTypicalUniversity("NTU DP");
    }
}
