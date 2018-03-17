public class DoctorRate extends User, Doctor {
    private Date rateDate;
    private int rate;
    
    public Doctor(String emailUser, String emailDoctor, Date rateDateInput, int rateInput){
        super(email);
        rateDate = rateDateInput;
        rate = rateInput;
    }
    
    public Date getRateDate(){
      return rateDate;
    }
    public int getRate(){
      return rate;
    }
    public Date setRateDate(Date rateD){
      rateDate = rateD;
    }
    public int setRate(int rateValue){
      rate = rateValue;
    }
    
    
    public int submitRate(int rating){
        //submit to db
    }
        
}
