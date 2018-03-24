/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationservices;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christina Terradista
 */
public class MemoryUserRepository implements UserRepository {
    
    public List<User> usersSaved = new ArrayList<>();
    public List<User> usersDeleted = new ArrayList<>();

    @Override
    public Boolean saveUser(User user) {
        usersSaved.add(user);
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteUser(User user) {
        usersDeleted.add(user);
        usersSaved.remove(user);
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*@Override
    public Boolean findUser(User user) {
        //Iterate through array to find the user info
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
