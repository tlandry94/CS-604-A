package coreservices;

public class Doctor extends User {
    String hospitalName;
    String speciality;
    public Doctor(String firstNameInput, String lastNameInput, String userNameInput, String passwordInput, String hospitalNameInput, String specialityInput){
        super(firstNameInput, lastNameInput, userNameInput, passwordInput);
        hospitalName = hospitalNameInput;
        speciality = specialityInput;
    }//end constructor
    private String getHospital(){
        return hospitalName;
    }
    private String getSpecialty(){
        return speciality;
    }
    
    private String setHospital(String hName){
        hospitalName=hName;
    }
    private String setSpecialty(String spec){
        speciality=spec;
    }
}
