/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginservices;

/**
 *
 * @author Christina Terradista
 */
public interface LoginInterface {
    public abstract Boolean EnterLoginCredentials(String emailInput, String passwordInput); //Returns true if successful
    
    public abstract Boolean LoginValidator(String emailInput, String passwordInput, String retrievedEmail, String retriedPassword); //Returns true if successful
    
    public abstract Boolean UpdateUserStatus(String emailInput); //Returns true if successful
}
