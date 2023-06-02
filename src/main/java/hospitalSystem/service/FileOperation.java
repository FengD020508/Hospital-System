package main.java.hospitalSystem.service;

import main.java.hospitalSystem.entities.Director;
import main.java.hospitalSystem.entities.Nurse;
import main.java.hospitalSystem.entities.Patient;

import java.io.*;
import java.util.HashMap;

/**
 * Control the File input and export
 */

public class FileOperation {

    public static void importPatientToFile(String fileName, HashMap<Integer, Patient> patients) {
        HashMap<Integer, Patient> tempHashMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 6) {
                    int key = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String gender = parts[2];
                    int age = Integer.parseInt(parts[3]);
                    String roomNumber = parts[4];
                    String bedNumber = parts[5];

                    Patient patient = new Patient(name, gender, age, roomNumber, bedNumber);
                    tempHashMap.put(key, patient);
                }
            }

            patients.putAll(tempHashMap);

        } catch (IOException e) {
            System.out.println("Filed to import!" + e.getMessage());
        }
    }
    public static void importNurseToFile(String fileName, HashMap<Integer, Nurse> nurses) {
        HashMap<Integer, Nurse> tempHashMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 6) {
                    int key = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String gender = parts[2];
                    int age = Integer.parseInt(parts[3]);
                    String office = parts[4];
                    String department = parts[5];

                    Nurse nurse = new Nurse(name, gender, age, office, department);
                    tempHashMap.put(key, nurse);
                }
            }

            nurses.putAll(tempHashMap);

        } catch (IOException e) {
            System.out.println("Filed to import!" + e.getMessage());
        }
    }
    public static void importDirectorToFile(String fileName, HashMap<Integer, Director> directors) {
        HashMap<Integer, Director> tempHashMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 6) {
                    int key = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String gender = parts[2];
                    int age = Integer.parseInt(parts[3]);
                    String office = parts[4];
                    String department = parts[5];

                    Director director = new Director(name, gender, age, office, department);
                    tempHashMap.put(key, director);
                }
            }

            directors.putAll(tempHashMap);

        } catch (IOException e) {
            System.out.println("Filed to import!" + e.getMessage());
        }
    }


    public static void exportPatientToFile(HashMap<Integer, Patient> hashMap, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer key : hashMap.keySet()) {
                Patient patient = hashMap.get(key);
                String line = key + " " + patient.getName() + " " + patient.getGender() + " " +
                        patient.getAge() + " " + patient.getRoomNumber() + " " + patient.getBedNumber();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File change success!");
        } catch (IOException e) {
            System.out.println("File change error" + e.getMessage());
        }
    }
    public static void exportNurseToFile(HashMap<Integer, Nurse> hashMap, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer key : hashMap.keySet()) {
                Nurse nurse = hashMap.get(key);
                String line = key + " " + nurse.getName() + " " + nurse.getGender() + " " +
                        nurse.getAge() + " " + nurse.getOffice() + " " + nurse.getDepartment();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File change success!");
        } catch (IOException e) {
            System.out.println("File change error" + e.getMessage());
        }
    }
    public static void exportDirectorToFile(HashMap<Integer, Director> hashMap, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer key : hashMap.keySet()) {
                Director director = hashMap.get(key);
                String line = key + " " + director.getName() + " " + director.getGender() + " " +
                        director.getAge() + " " + director.getOffice() + " " + director.getDepartment();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File change success!");
        } catch (IOException e) {
            System.out.println("File change error" + e.getMessage());
        }
    }


}
