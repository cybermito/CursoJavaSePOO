package ui;

import java.util.Scanner;

public class UIDoctorMenu {

    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName() + "\n");
            System.out.println("Menu");
            System.out.println("1. Add Available Appoinment");
            System.out.println("2. My Scheduled appoinment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){

                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while(response != 0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do{
            System.out.println("\n");
            System.out.println("::Add Available Appointment");
            for(int i = 0; i < 3; i++){
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner((System.in));
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4){
                //trabajamos con los meses. Opciones 1,2,3
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected]);

                System.out.println("Insert the Date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: " +  date + "\n1. Correct \n2. Change Date");



            }else if (response == 0){
                showDoctorMenu();
            }

        }while (response != 0);
    }
}
