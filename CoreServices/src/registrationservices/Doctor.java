package registrationservices;

public class Doctor {
    protected String firstName;
    protected String lastName;
    protected String userEmail;
    protected String password;
    protected Boolean loggedInCurrently;
    protected String hospitalName;
    protected String specialtyName;
    
    public Doctor(){
        firstName = null;
        lastName = null;
        userEmail = null;
        password = null;
        loggedInCurrently = null;
        hospitalName = null;
        specialtyName = null;
    }

    public Doctor(String firstNameInput, String lastNameInput, String emailInput, String passwordInput, String hospitalInput, String specialityInput){

        firstName = firstNameInput;
        lastName = lastNameInput;
        userEmail = emailInput;
        password = passwordInput;
        hospitalName = hospitalInput;
        specialtyName = specialityInput;
}//end constructor
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return userEmail;
    }
    public String getPassword(){
        return password;
    }
    
     public String getHospital(){
        return hospitalName;
    }
    public String getSpecialty(){
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