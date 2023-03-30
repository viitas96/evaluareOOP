package org.example.model;

public class Teacher extends Person {

    private int hours;

    public Teacher(String firstname, String lastname, int hours) {
        super(firstname, lastname);
        this.hours = hours;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return String.format("""
                firstname: %s,
                lastname: %s,
                hours: %d
                """, getFirstname(), getLastname(), getHours());

    }
}
