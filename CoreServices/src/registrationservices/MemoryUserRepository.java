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
    public List<Doctor> doctorsSaved = new ArrayList<>();
    public List<Doctor> doctorsDeleted = new ArrayList<>();

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
    
    @Override
    public Boolean saveDoctor(Doctor doctor){
        doctorsSaved.add(doctor);
        return true;
    }
    
    @Override
    public Boolean deleteDoctor(Doctor doctor){
        doctorsDeleted.add(doctor);
        doctorsSaved.remove(doctor);
        return true;
    }

    @Override
    public int findUser(String emailInput, String passwordInput) {
        for ( int i = 0; i < usersSaved.size(); i++){
            if (emailInput.equals(usersSaved.get(i).userEmail) && passwordInput.equals(usersSaved.get(i).password))
                return i;
        }
        return -1;
        //Iterate through array to find the user info
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int findDoctor(String emailInput, String passwordInput) {
        for ( int i = 0; i < doctorsSaved.size(); i++){
            if (emailInput.equals(doctorsSaved.get(i).userEmail) && passwordInput.equals(doctorsSaved.get(i).password))
                return i;
        }
        return -1;
        //Iterate through array to find the user info
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int findDoctorForRating(String firstNameInput, String lastNameInput){
        for ( int i = 0; i < doctorsSaved.size(); i++){
            if (firstNameInput.equals(doctorsSaved.get(i).firstName) && lastNameInput.equals(doctorsSaved.get(i).lastName))
                return i;
        }
        return -1;
    }
    
}
