package org.example.model;

public class Student extends Person{

    private int course;

    public Student(String firstname, String lastname, int course) {
        super(firstname, lastname);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return String.format("""
                firstname: %s,
                lastname: %s,
                hours: %d
                """, getFirstname(), getLastname(), getCourse());
    }
}
