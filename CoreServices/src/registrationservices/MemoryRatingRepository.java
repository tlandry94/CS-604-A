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
 * @author Admin
 */
public class MemoryRatingRepository implements RatingRepository{
    public List<DoctorRating> ratingSaved = new ArrayList<>();
    public List<DoctorRating> ratingDeleted = new ArrayList<>();
 
    @Override
    public Boolean saveRating(DoctorRating rating) {
        ratingSaved.add(rating);
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteRating(DoctorRating rating) {
        ratingDeleted.add(rating);
        ratingSaved.remove(rating);
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
