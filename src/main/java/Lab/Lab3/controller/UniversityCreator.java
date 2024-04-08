package Lab.Lab3.controller;

import Lab.Lab3.ComponentCreator;
import Lab.Lab3.model.*;
public class UniversityCreator {
    private ComponentCreator componentCreator;

    public UniversityCreator(ComponentCreator componentCreator) {
        this.componentCreator = componentCreator;
    }

    public University createTypicalUniversity(String name) {
        University university = (University) componentCreator.createUniversity(name);

        Faculty faculty1 = componentCreator.createFaculty("Information technologies", new Human("Artem", "Shyriaiev", "Oleksandrovich", Sex.MALE));
        university.addFaculty(faculty1);
        Faculty faculty2 = componentCreator.createFaculty("Financially economical", new Human("Olena", "Pavlova", "Yuryivna", Sex.FEMALE));
        university.addFaculty(faculty2);

        Department department1 = (Department) componentCreator.createDepartment("System analysis and management", new Human("Artem", "Shyriaiev", "Oleksandrovich", Sex.MALE));
        faculty1.addDepartment(department1);
        Department department2 = (Department) componentCreator.createDepartment("Marketing", new Human("Olena", "Pavlova", "Yuryivna", Sex.FEMALE));
        faculty2.addDepartment(department2);

        Group group1 = new Group("124-20-2");
        Student student1 = (Student) componentCreator.createStudent("Artem", "Shyriaiev", "Oleksandrovich", Sex.MALE, group1);
        department1.addStudent(student1);

        Group group2 = new Group("075-20-1");
        Student student2 = (Student) componentCreator.createStudent("Olena", "Pavlova", "Yuryivna", Sex.FEMALE, group2);
        department2.addStudent(student2);


        System.out.println("University: " + university.getName());
        System.out.println("\nFaculty: " + faculty1.getName());
        System.out.println("Department: " + department1.getName());
        System.out.println(student1.toString());

        System.out.println("\nFaculty: " + faculty2.getName());
        System.out.println("Department: " + department2.getName());
        System.out.println(student2.toString());

        return university;
    }
}
