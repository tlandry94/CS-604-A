package registrationservices;

public class DoctorRating {
    private int rateDate;
    private int rating;
    private String userRatingEmail;
    private String doctorRatingEmail;
    
    public void Doctor(String userEmailInput, String doctorEmailInput, int rateDateInput, int rateInput){
        rateDate = rateDateInput;
        rating = rateInput;
        userRatingEmail = userEmailInput;
        doctorRatingEmail = doctorEmailInput;
    }
    
    public int getRateDate(){
      return rateDate;
    }
    public int getRating(){
      return rating;
    }       
}
