package main.java.hospitalSystem.service;

import main.java.hospitalSystem.controller.Manage;
import main.java.hospitalSystem.entities.Director;
import main.java.hospitalSystem.entities.Nurse;
import main.java.hospitalSystem.entities.Patient;

import java.util.HashMap;
import java.util.Scanner;

import static main.java.hospitalSystem.service.FileOperation.*;

/**
 * Add,Delete,Modify,View data
 */

public class SeverFunctions implements Manage {

    static HashMap<Integer,Patient> patients = new HashMap<Integer, Patient>();
    static HashMap<Integer,Nurse> nurses = new HashMap<Integer, Nurse>();
    static HashMap<Integer,Director> directors = new HashMap<Integer, Director>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void addObj(String str) {

        switch (str) {
            case "patient" -> {
                // Creat patient object
                System.out.println("Please input patient's information in order of: \n" +
                        "name gender age roomNumber bedNumber");
                patients.put(patients.size()+1,Patient.createPatient(getterS(), getterS(), getterI(), getterS(), getterS()));
                exportPatientToFile(patients,"Resource/Patient.txt");
            }
            case "nurse" -> {
                // Creat nurse object
                System.out.println("Please input nurse's information in order of: \n" +
                        "name gender age office department");
                nurses.put(nurses.size()+1,Nurse.createNurse(getterS(), getterS(), getterI(), getterS(), getterS()));
                exportNurseToFile(nurses,"Resource/Nurse.txt");
            }
            case "director" -> {
                // Creat director object
                System.out.println("Please input director's information in order of: \n" +
                        "name gender age office department");
                directors.put(directors.size()+1,Director.createDirector(getterS(), getterS(), getterI(), getterS(), getterS()));
                exportDirectorToFile(directors,"Resource/Director.txt");
            }
        }

    }
    @Override
    public void delete(String str) {
        switch (str) {
            case "patient" -> {
                // Creat patient object
                System.out.println("Please input choose the number of patient:");
                patients.remove(scanner.nextInt());
                exportPatientToFile(patients,"Resource/Patient.txt");
            }
            case "nurse" -> {
                // Creat nurse object
                System.out.println("Please input choose the number of nurse:");
                nurses.remove(scanner.nextInt());
                exportNurseToFile(nurses,"Resource/Nurse.txt");
            }
            case "director" -> {
                // Creat director object
                System.out.println("Please input choose the number of director:");
                directors.remove(scanner.nextInt());
                exportDirectorToFile(directors,"Resource/Director.txt");
            }
        }
    }
    public void view(String str) {
        switch (str) {
            case "patient" -> {
                for (Object i : patients.keySet()) {
                    System.out.println(i+" "+ patients.get(i));
                }

            }
            case "nurse" -> {
                for (Object i : nurses.keySet()) {
                    System.out.println(i+" "+ nurses.get(i));
                }

            }
            case "director" -> {
                for (Object i : directors.keySet()) {
                    System.out.println(i+" "+ directors.get(i));
                }

            }
        }
    }
    @Override
    public void modify(String str) {
        delete(str);
        addObj(str);
    }


    public String getterS() {
        return scanner.next();
    }
    public int getterI() {
        return scanner.nextInt();
    }
}
