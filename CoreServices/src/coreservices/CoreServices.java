
package coreservices;

import java.util.Scanner;
import registrationservices.*;
import loginservices.*;

public class CoreServices {

    public static void main(String[] args) {
        int decision = 0;
        Scanner input = new Scanner(System.in);
        DriverMethods methods = new DriverMethods();
    
        while(decision != 6){
            System.out.print("Welcome to the Doctor Colosseum! Please determine what you would like to do. "
                    + "\n1: Register as a patient."
                    + "\n2: Register as a doctor."
                    + "\n3: Log in as a patient."
                    + "\n4: Log in as a doctor."
                    + "\n5: Doctor rating."
                    + "\n6: Quit the program.");
            decision = input.nextInt();

            if(decision == 1){
                methods.regiserAsUserText();
            }
            if(decision == 2){
                methods.registerAsDoctorText();
            }
            if(decision == 3){
                //log in as a patient
                methods.logInAsUserText();
            }
            if(decision == 4){
                //log in as a doctor
                methods.logInAsDoctorText();
            }
             if(decision == 5){
                //doctor rating
                methods.doctorRateText();
            }
        }
        
    }
    
}
