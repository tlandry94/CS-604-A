package coreservices;

public class RegisterService {
    //Determine what kind of user the new user will be (doctor, medical professional, patient)
    private bool isPatient;
    private bool isDoctor;
    private bool isMedicalProfessional;

    private void determineUserType(int input){
        if (input == 0)
            isPatient = true;
        if (input == 1)
            isDoctor = true;
        if (input == 2)
            isMedicalProfessional = true;
    }
    private void patientRegistration(String firstName, String lastName, String userName, String password){
        Patient patient = new Patient(firstName, lastName, userName, password);
    }
    private void doctorRegistration(String firstName, String lastName, String userName, String password, String hospitalName, String specialty){
        Doctor doctor = new Doctor(firstName, lastName, userName, password, hospitalName, specialty);
    }
    private void medicalProfessionalRegistration(String firstName, String lastName, String userName, String password, String hospitalName){
        MedicalProfessional medicalProfessional = new MedicalProfessional(firstName, lastName, userName, password, hospitalName);
    }

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