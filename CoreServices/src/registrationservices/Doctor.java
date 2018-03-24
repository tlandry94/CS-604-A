package registrationservices;

public class Doctor {
    protected String firstName;
    protected String lastName;
    protected String userEmail;
    protected String password;
    protected Boolean loggedInCurrently;
    protected String hospitalName;
    protected String specialtyName;

    public Doctor(String firstNameInput, String lastNameInput, String emailInput, String passwordInput, String hospitalInput, String specialityInput){

        firstName = firstNameInput;
        lastName = lastNameInput;
        userEmail = emailInput;
        password = passwordInput;
        hospitalName = hospitalInput;
        specialtyName = specialityInput;
}//end constructor
    private String getFirstName(){
        return firstName;
    }
    private String getLastName(){
        return lastName;
    }
    private String getEmail(){
        return userEmail;
    }
    private String getPassword(){
        return password;
    }
    
     private String getHospital(){
        return hospitalName;
    }
    private String getSpecialty(){
        return specialtyName;
    }
    private void logIn(){
        loggedInCurrently = true;
    }
    private void logOut(){
        loggedInCurrently = false;
    }
    private Boolean isLoggedIn(){
        return loggedInCurrently;
    }
    private Boolean isAHuman(){
        return true;
    }
}