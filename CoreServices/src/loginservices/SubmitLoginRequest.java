/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginservices;

import DoctorColosseum.registrationservices.*;

/**
 *
 * @author Christina Terradista
 */
public class SubmitLoginRequest{
    private void submitLoginRequest(String emailInput, String passwordInput, User userName){
        if(loginservices.LoginValidator(emailInput, passwordInput, userName) == true){
        System.out.print("Congrats you are logged in!");
        }
        else if(loginservices.LoginValidator(emailInput, passwordInput, userName) == false){
            System.out.print("Sorry the log in process failed!");
        }
    }
}
