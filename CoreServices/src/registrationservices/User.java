package registrationservices;

public class User {
    protected String firstName;
    protected String lastName;
    protected String userEmail;
    protected String password;
    protected Boolean loggedInCurrently;

    public User(String firstNameInput, String lastNameInput, String emailInput, String passwordInput){

        firstName = firstNameInput;
        lastName = lastNameInput;
        userEmail = emailInput;
        password = passwordInput;
}//end constructor
    private String getFirstName(){
        return firstName;
    }
    private String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return userEmail;
    }
    public String getPassword(){
        return password;
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