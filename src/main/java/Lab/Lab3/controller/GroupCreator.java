package Lab.Lab3.controller;

import Lab.Lab3.model.Group;

public class GroupCreator {
    public Group createGroup(String name) {
        return new Group(name);
    }
}
