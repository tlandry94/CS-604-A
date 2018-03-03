package coreservices;

public class User {
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String password;

    public User(String firstNameInput, String lastNameInput, String userNameInput, String passwordInput){

        firstName = firstNameInput;
        lastName = lastNameInput;
        userName = userNameInput;
        password = passwordInput;
}//end constructor
    private String getFirstName(){
        return firstName;
    }
    private String getLastName(){
        return lastName;
    }
    private String getUserName(){
        return userName;
    }
    private String getPassword(){
        return password;
    }
}