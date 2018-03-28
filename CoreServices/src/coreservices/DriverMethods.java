/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coreservices;

import java.util.Scanner;
import loginservices.LoginService;
import registrationservices.Doctor;
import registrationservices.DoctorRating;
import registrationservices.MemoryRatingRepository;
import registrationservices.MemoryUserRepository;
import registrationservices.User;

/**
 *
 * @author Christina Terradista
 */
public class DriverMethods {
    int rateDateInput = 3282018;
        String currentSessionEmail = null;
        LoginService loginInput = new LoginService();
        MemoryUserRepository repositoryOfUsers = new MemoryUserRepository();
        MemoryRatingRepository repositoryOfRatings = new MemoryRatingRepository();
        User newUser = new User();
        Doctor newDoctor = new Doctor();
        Scanner input = new Scanner(System.in);
        
    public void regiserAsUserText(){
        String emailInput = null;
        String passwordInput = null;
        //register as patient
        System.out.print("\nWhat is your email address? ");
        emailInput = input.next();
        System.out.print("\nWhat is your password? ");
        passwordInput = input.next();
        registerAsUser(emailInput, passwordInput);
    }
    private void registerAsUser(String emailInput, String passwordInput){
        newUser = new User(emailInput, passwordInput);
        System.out.print("\nYou have successfully registered! You will now "
                + "return to the main prompt.");
        repositoryOfUsers.saveUser(newUser);
        }
    public void registerAsDoctorText(){
        String firstNameInput = null;
                String lastNameInput = null;
                String emailInput = null;
                String passwordInput = null;
                String hospitalInput = null;
                String specialtyInput = null;
                //register as doctor
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
                registerAsDoctor(firstNameInput, lastNameInput, emailInput, passwordInput, hospitalInput, specialtyInput);
    }
    private void registerAsDoctor(String firstNameInput, String lastNameInput, String emailInput, String passwordInput, String hospitalInput, String specialtyInput){
        newDoctor = new Doctor(firstNameInput, lastNameInput, emailInput,
                    passwordInput, hospitalInput, specialtyInput);
                System.out.print("\nYou have successfully registered! You will now "
                        + "return to the main prompt.");
                repositoryOfUsers.saveDoctor(newDoctor);
    }
    public void logInAsUserText(){
        String emailInput = null;
                String passwordInput = null;
                System.out.print("\nWhat is your email address? ");
                emailInput = input.next();
                System.out.print("\nWhat is your password? ");
                passwordInput = input.next();
                logInAsUser(emailInput, passwordInput);
    }
    private void logInAsUser(String emailInput, String passwordInput){
        int userIndex = repositoryOfUsers.findUser(emailInput, passwordInput);
                if (userIndex != -1){
                        System.out.print("\nYou have successfully logged in!"
                            + " However, our rating service is under construction. Sorry!\n");
                        currentSessionEmail = emailInput;
                }
                else System.out.print("\nYou failed to log in successfully. Please try again.");
    }
    public void logInAsDoctorText(){
        String emailInput = null;
        String passwordInput = null;
        System.out.print("\nWhat is your email address? ");
        emailInput = input.next();
        System.out.print("\nWhat is your password? ");
        passwordInput = input.next();
        logInAsDoctor(emailInput, passwordInput);
    }
    private void logInAsDoctor(String emailInput, String passwordInput){
        if(loginInput.DoctorLoginValidator(newDoctor, emailInput, passwordInput))
                    System.out.print("\nYou have successfully logged in!"
                            + " However, our rating service is under construction. Sorry!\n");
                else System.out.print("\nYou failed to log in successfully. Please try again.");
    }
    public void doctorRateText(){
        String firstNameInput = null;
                String lastNameInput = null;
                DoctorRating rating = new DoctorRating();
                int ratingInput;
                System.out.print("\nWhat is the first name of the doctor?");
                firstNameInput = input.next();
                System.out.print("\nWhat is the last name of the doctor?");
                lastNameInput = input.next();
                System.out.print("\nWhat rating (out of ten) would you give the doctor?");
                ratingInput = input.nextInt();
                doctorRate(firstNameInput, lastNameInput, rating, ratingInput);
    }
    public void doctorRate(String firstNameInput, String lastNameInput, DoctorRating rating, int ratingInput){
        int doctorIndex = repositoryOfUsers.findDoctorForRating(firstNameInput, lastNameInput);
                if(doctorIndex != -1){
                    rating = new DoctorRating(currentSessionEmail, repositoryOfUsers.doctorsSaved.get(doctorIndex).getEmail(), rateDateInput, ratingInput);
                    repositoryOfRatings.saveRating(rating);
                }
                else
                    System.out.print("\nSorry, something went wrong.");
    }
}
