package registrationservices;

public class User {
    protected String firstName;
    protected String lastName;
    protected String userEmail;
    protected String password;

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
    private String getEmail(){
        return userEmail;
    }
    private String getPassword(){
        return password;
    }
}