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
    
    //public abstract Boolean findUser(User user);
}
