package main.java.hospitalSystem.service;

import java.util.Scanner;

import static main.java.hospitalSystem.service.FileOperation.*;
import static main.java.hospitalSystem.service.SeverFunctions.*;

/**
 * The main interface
 */

public class UserInterface {
    public static void runApp() {
        new LoginSever().Login();
        SeverFunctions sever = new SeverFunctions();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=====================================================================================================");
            System.out.println("------------------------------Patient------------------------------");
            importPatientToFile("Resource/Patient.txt",patients);
            sever.view("patient");
            System.out.println("-------------------------------Nurse-------------------------------");
            importNurseToFile("Resource/Nurse.txt",nurses);
            sever.view("nurse");
            System.out.println("------------------------------Director-----------------------------");
            importDirectorToFile("Resource/Director.txt",directors);
            sever.view("director");


            System.out.println("Please choose the order ('add' or 'modify' or 'delete'):");
            String va = scanner.next();
            System.out.println();

            switch (va) {
                case "add" -> {
                    System.out.println("Please choose the Object class to add ('patient' or 'nurse' or 'director'):");
                    String str = scanner.next();
                    if (str.equals("patient") | str.equals("nurse") | str.equals("director"))
                        sever.addObj(str);
                    else
                        System.out.println("Error Input! Please input one of ('patient', 'nurse', 'director')");
                    break;
                }
                case "delete" -> {
                    System.out.println("Please choose the Object class to delete ('patient' or 'nurse' or 'director'):");
                    String str = scanner.next();
                    if (str.equals("patient") | str.equals("nurse") | str.equals("director"))
                        sever.delete(str);
                    else
                        System.out.println("Error Input! Please input one of ('patient', 'nurse', 'director')");
                    break;
                }
                case "modify" -> {
                    System.out.println("Please choose the Object class to modify ('patient' or 'nurse' or 'director'):");
                    String str = scanner.next();
                    if (str.equals("patient") | str.equals("nurse") | str.equals("director"))
                        sever.modify(str);
                    else
                        System.out.println("Error Input! Please input one of ('patient', 'nurse', 'director')");
                    break;
                }
            }


        }
    }
}
