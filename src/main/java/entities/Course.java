package entities;

import java.util.List;

public class Course<T> {
    private char name;
    private Instructor instructor;

    private List<T> list;


    public Course(char name, Instructor instructor, List<T> list) {
        this.name = name;
        this.instructor = instructor;
        this.list = list;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }



}
