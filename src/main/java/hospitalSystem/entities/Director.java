package main.java.hospitalSystem.entities;
import java.util.Date;

public class Director extends Doctor {
    private String department;

    public Director(String name, String gender, int age, String office, String department) {
        super(name, gender, age,office);
        this.department = department;
    }

    // getters and setters for department property

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return getName()+" "+getAge()+" "+getGender()+" "+getOffice()+" "+getDepartment();
    }

    public static Director createDirector(String name, String gender, int age, String office,  String department) {

        return new Director(name, gender, age, office, department);
    }
}