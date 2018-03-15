package coreservices;

public class User {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    

    public User(String firstNameInput, String lastNameInput, String emailInput, String passwordInput){

        firstName = firstNameInput;
        lastName = lastNameInput;
        email = emailInput;
        password = passwordInput;
}//end constructor
    private String getFirstName(){
        return firstName;
    }
    private String getLastName(){
        return lastName;
    }
    private String getEmail(){
        return userName;
    }
    private String getPassword(){
        return password;
    }
    
    private String setFirstName(String fName){
        firstName=fName;
    }
    private String setLastName(String lName){
        lastName=lName;
    }
    private String setEmail(String e-mail){
        email=e-mail;
    }
    private String setPassword(String passwd){
        password=passwd;
    }
    
    
}
