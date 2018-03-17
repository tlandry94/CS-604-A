package coreservices;

public class RegisterService{

    public static void main(String[] args){
        Boolean isPatient;
        Boolean isDoctor;
        Boolean isMedicalProfessional;
        int userType = 1;//0 for patient, 1 for doctor, 2 for medical professional
        String firstName = "Bob";
        String lastName = "Smith";
        String userName = "CreativeUserName";
        String password = "lolsecurity";
        String hospitalName = "Fun place";
        String specialty = "Healing over time";

        if (userType == 0)
            isPatient = true;
        if (userType == 1)
            isDoctor = true;
        if (userType == 2)
            isMedicalProfessional = true;

        if(isPatient){
            Patient patient = new Patient(firstName, lastName, userName, password);
        }
        if(isDoctor){
            Doctor doctor = new Doctor(firstName, lastName, userName, password, hospitalName, specialty);
        }
        if(isMedicalProfessional){
            MedicalProfessional medicalProfessional = new MedicalProfessional(firstName, lastName, userName, password, hospitalName);
        }

        //test
        assert patient.getFirstName() == "Bob";
        assert patient.getLastName() == "Smith";
        assert patient.getUserName() == "CreativeUserName";
        assert patient.getPassword() == "lolsecurity";
        assert patient.getHospitalName == "Fun Place";
        assert patient.getSpecialty == "Healing over time";
    }
}