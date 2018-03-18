package registrationservices;

public class Doctor extends User {
    String hospitalName;
    String speciality;
    public Doctor(String firstNameInput, String lastNameInput, String emailInput, String passwordInput, String hospitalNameInput, String specialityInput){
        super(firstNameInput, lastNameInput, emailInput, passwordInput);
        hospitalName = hospitalNameInput;
        speciality = specialityInput;
    }//end constructor
    private String getHospital(){
        return hospitalName;
    }
    private String getSpecialty(){
        return speciality;
    }
}