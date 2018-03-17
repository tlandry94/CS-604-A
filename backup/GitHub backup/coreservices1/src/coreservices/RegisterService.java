package coreservices;

public class RegisterService{

        private Boolean isPatient;
        private Boolean isDoctor;
        private Boolean isMedicalProfessional;
        private int userType = 1;//0 for patient, 1 for doctor, 2 for medical professional
        private String firstName = "Bob";
        private String lastName = "Smith";
        private String userName = "CreativeUserName";
        private String password = "lolsecurity";
        private String hospitalName = "Fun place";
        private String specialty = "Healing over time";

        if (userType == 0)
            isPatient = true;
        if (userType == 1)
            isDoctor = true};
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
