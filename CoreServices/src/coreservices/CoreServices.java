/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coreservices;

import java.util.Scanner;
import registrationservices.*;
import loginservices.*;
/**
 *
 * @author Christina Terradista
 */
public class CoreServices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int decision = 0;
        Scanner input = new Scanner(System.in);//
        String firstNameInput;
        String lastNameInput;
//        String emailInput = null;
//        String passwordInput;
        String hospitalInput;
        String specialtyInput;
        LoginService loginInput = new LoginService();
        
        while(decision != 5){
            System.out.print("Welcome to the Doctor Colosseum! Please determine what you would like to do. "
                    + "\n1: Register as a patient."
                    + "\n2: Register as a doctor."
                    + "\n3: Log in as a patient."
                    + "\n4: Log in as a doctor."
                    + "\n5: Quit the program.");
            decision = input.nextInt();

            if(decision == 1){
                //register as patient
                System.out.print("What is your first name? ");
                firstNameInput = input.next();
                System.out.print("\nWhat is your last name? ");
                lastNameInput = input.next();
                System.out.print("\nWhat is your email address? ");
                emailInput = input.next();
                System.out.print("\nWhat is your password? ");
                passwordInput = input.next();
                User newUser = new User(firstNameInput, lastNameInput, emailInput,
                    passwordInput);
                System.out.print("\nYou have successfully registered! You will now "
                        + "return to the main prompt.");
            }
            if(decision == 2){
                //register as patient
                System.out.print("What is your first name? ");
                firstNameInput = input.next();
                System.out.print("\nWhat is your last name? ");
                lastNameInput = input.next();
                System.out.print("\nWhat is your email address? ");
                emailInput = input.next();
                System.out.print("\nWhat is your password? ");
                passwordInput = input.next();
                System.out.print("\nWhat is your hospital? ");
                hospitalInput = input.next();
                System.out.print("\nWhat is your practice speciality? ");
                specialtyInput = input.next();
                Doctor newDoctor = new Doctor(firstNameInput, lastNameInput, emailInput,
                    passwordInput, hospitalInput, specialtyInput);
                System.out.print("\nYou have successfully registered! You will now "
                        + "return to the main prompt.");
            }
            if(decision == 3){
                //log in as a patient
                String emailInput = null;
                String passwordInput = null;
                loginInput.EnterLoginCredentials(emailInput, passwordInput);
                loginInput.LoginValidator(emailInput, passwordInput, emailInput, passwordInput);
            }
            if(decision == 4){
                //log in as a doctor
            }
        }
    }
    
}
