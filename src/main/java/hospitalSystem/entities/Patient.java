package main.java.hospitalSystem.entities;

public class Patient {
    private String name;
    private String gender;
    private int age;
    private String roomNumber;
    private String bedNumber;

    public Patient(String name, String gender, int age, String roomNumber, String bedNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
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

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    @Override
    public String toString() {
        return getName()+" "+getAge()+" "+getGender()+" "+getRoomNumber()+" "+getBedNumber();
    }

    public static Patient createPatient(String name, String gender, int age, String roomNumber, String bedNumber) {

        return new Patient(name,gender,age,roomNumber,bedNumber);
    }
}

