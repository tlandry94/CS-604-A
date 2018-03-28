/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationservices;

/**
 *
 * @author Admin
 */
public interface RatingRepository {
    
    public abstract Boolean saveRating(DoctorRating rating);
    
    public abstract Boolean deleteRating(DoctorRating rating);

}
