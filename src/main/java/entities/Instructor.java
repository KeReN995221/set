package entities;

import java.util.List;

public class Instructor {
    private String name;
    private List<Course> course;

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourse() {
        return course;
    }
}
