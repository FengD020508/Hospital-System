package main.java.hospitalSystem.entities;

import java.util.Date;

public class Doctor {
    private String name;
    private String gender;
    private int age;
    private String office;

    public Doctor(String name, String gender, int age, String office) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.office = office;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String toString() {
        return getName()+" "+getAge()+" "+getGender()+" "+getOffice()+" ";
    }
}
