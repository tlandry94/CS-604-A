package coreservices;

import coreservices.User;

public class RegisterService {
    //Determine what kind of user the new user will be (doctor, medical professional, patient)
    private bool isPatient;
    private bool isDoctor;

    private void determineUserType(int input){
        if (input == 0)
            isPatient = true;
        if (input == 1)
            isDoctor = true;
    }
    //if patient == true, call on the patient class
    private void patientRegistration(String firstName, String lastName, String userName, String password){
      //insert logic here  
    }
    //if doctor == true, call on the doctor class
    private void doctorRegistration(String firstName, String lastName, String userName, String password, String hospitalName){
        //insert logic here
    }
    //if medical professional == true, call on the medical professional class
}