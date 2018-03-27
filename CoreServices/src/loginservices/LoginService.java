/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginservices;

import registrationservices.*;
import java.util.Scanner;
/**
 *
 * @author Christina Terradista
 */
public class LoginService implements LoginInterface {
    
    @Override
    public Boolean EnterLoginCredentials(String emailInput, String passwordInput) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Email: ");
            emailInput = input.next();
            System.out.print("\nPassword: ");
            passwordInput = input.next();
        }
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean LoginValidator(User returningUser, String emailInput, String passwordInput) {
        return returningUser.getEmail().equals(emailInput) && returningUser.getPassword().equals(passwordInput); //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean UpdateUserStatus(String emailInput) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
