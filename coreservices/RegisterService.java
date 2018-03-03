package coreservices;

public class RegisterService implements RegistrationFunctions{
    //Determine what kind of user the new user will be (doctor, medical professional, patient)
    public static void main(String[] args){
        bool isPatient;
        bool isDoctor;
        bool isMedicalProfessional;

//"Input" should come from the connector program that operates on a circle farther out than the core
        RegistrationFunctions.determineUserType(input);

        if(isPatient){
            patientRegistration(firstName, lastName, userName, password);
        }
        if(isDoctor){
            doctorRegistration(firstName, lastName, userName, password, hospitalName, specialty);
        }
        if(isMedicalProfessional){
            medicalProfessionalRegistration(firstName, lastName, userName, password, hospitalName);
        }
    }
}