package registrationservices;

public class User {
    protected String userEmail;
    protected String password;
    protected Boolean loggedInCurrently;

    public User(String emailInput, String passwordInput){

        userEmail = emailInput;
        password = passwordInput;
}//end constructor
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