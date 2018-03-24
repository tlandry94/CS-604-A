/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginservices;
import java.util.Scanner;
/**
 *
 * @author Christina Terradista
 */
public class LoginService implements LoginInterface {
    
    @Override
    public Boolean EnterLoginCredentials(String emailInput, String passwordInput) {
        Scanner input = new Scanner(System.in);
        System.out.print("Email: ");
        emailInput = input.next();
        System.out.print("\nPassword: ");
        passwordInput = input.next();
        input.close();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean LoginValidator(String emailInput, String passwordInput, String retrievedEmail, String retriedPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean UpdateUserStatus(String emailInput) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
