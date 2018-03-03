package coreservices;

public class User {
    private String firstName, lastName, userName, password;

    private void setFirstName(String firstNameInput){
        firstName = firstNameInput;
    }
    private void setLastName(String lastNameInput){
        lastName = lastNameInput;
    }
    private void setUserName(String userNameInput){
        userName = userNameInput;
    }
    private void setPassword(String passwordInput){
        password = passwordInput;
    }
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