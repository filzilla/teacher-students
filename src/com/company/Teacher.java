package com.company;

/**
 * Created by phillipdelia on 7/26/17.
 */

public class Teacher {

    String firstName;
    String lastName;
    double id;
    int gradeLevel;


    public Teacher(){

    }

    public Teacher(String firstName, String lastName, double id, int gradeLevel){

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gradeLevel = gradeLevel;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;

        Teacher teacher = (Teacher) o;

        return Double.compare(teacher.getId(), getId()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getId());
        return (int) (temp ^ (temp >>> 32));
    }
}


