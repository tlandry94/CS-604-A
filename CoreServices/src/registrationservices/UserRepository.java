/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationservices;

/**
 *
 * @author Christina Terradista
 */
public interface UserRepository {
    public abstract Boolean saveUser(User user);
    
    public abstract Boolean deleteUser(User user);
    
    public abstract Boolean saveDoctor(Doctor doctor);
    
    public abstract Boolean deleteDoctor(Doctor doctor);
    
    public abstract int findUser(String emailInput, String passwordInpu);
    
    public abstract int findDoctor(String emailInput, String passwordInput);
    
    public abstract int findDoctorForRating(String firstNameInput, String lastNameInput);
}
