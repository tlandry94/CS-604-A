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
public class LoginValidator {
    private Boolean loginValidator(String emailInput, String passwordInput){
        if(emailInput == userName.getEmail() && passwordInput == userName.getPassword() && userName.isLoggedIn() == false){
            return true;
        }
        else return false;
    }
}
