package main.java.hospitalSystem.service;

import java.util.ArrayList;
import java.util.Scanner;
import main.java.hospitalSystem.cache.*;

/**
 * Check weather the user is existed
 */

public class LoginSever {

    static String username;
    static String password;

    static ArrayList<String> usernameList = new ArrayList<String>();
    static ArrayList<String> passwordList = new ArrayList<String>();

    public LoginSever(String username,String password){
        LoginSever.usernameList.add(username);
        LoginSever.passwordList.add(password);
    }

    public LoginSever() {

    }

    public  void Login() {
        UserMem.userInstallation();
        System.out.println("======================================Welcome to Hospital System!======================================");
        Scanner scanner = new Scanner(System.in);
        SeverFunctions sever = new SeverFunctions();
        while (true) {
            System.out.println("Please enter your username and password to login or keydown 'EXIT' to exit this system any time: ");
            System.out.print("username: ");
            username = scanner.next();
            System.out.print("password: ");
            password = scanner.next();
            if (usernameList.contains(username) && passwordList.contains(password)) {

                if (usernameList.indexOf(username) == passwordList.indexOf(password)) {
                    System.out.println("Login Success!");
                    break;
                }
            } else {
                System.out.println("No such user! Login Failed");
            }
        }

    }

}
