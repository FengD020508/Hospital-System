package main.java.hospitalSystem.entities;


public class Nurse extends Doctor {
    private String department;

    public Nurse(String name, String gender, int age, String office, String department) {
        super(name, gender, age, office);
        this.department = department;
    }

    // getters and setters for department property

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return getName()+" "+getAge()+" "+getGender()+" "+getOffice()+" "+getDepartment();
    }

    public static Nurse createNurse(String name, String gender, int age, String office,  String department) {

        return new Nurse(name, gender, age, office, department);
    }
}
