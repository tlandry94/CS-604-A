package registrationservices;

import java.util.Date;

public class DoctorRating {
    private int rateDate;
    private int rating;
    private String userRatingEmail;
    private String doctorRatingEmail;
    
    public void DoctorRating(String userEmailInput, String doctorEmailInput, int rateDateInput, int rateInput, User newUser, Doctor newDoctor){
        rateDate = rateDateInput;
        rating = rateInput;
        userRatingEmail = newUser.getEmail();
        doctorRatingEmail = newDoctor.getEmail();
    }
    
    public int getRateDate(){
      return rateDate;
    }
    public int getRating(){
      return rating;
    }       
}
