package coreservices;

public class Doctor extends User {
    String hospitalName;
    String speciality;
    public Doctor(String firstNameInput, String lastNameInput, String userNameInput, String passwordInput, String hospitalNameInput, String specialityInput){
        super(firstNameInput, lastNameInput, userNameInput, passwordInput);
        hospitalName = hospitalNameInput;
        speciality = specialityInput;
    }//end constructor
}