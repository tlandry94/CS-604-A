package coreservices;

public class MedicalProfessional extends User {
    String hospitalName;
    String speciality;
    public MedicalProfessional(String firstNameInput, String lastNameInput, String userNameInput, String passwordInput, String hospitalNameInput){
        super(firstNameInput, lastNameInput, userNameInput, passwordInput);
        hospitalName = hospitalNameInput;
    }//end constructor
}