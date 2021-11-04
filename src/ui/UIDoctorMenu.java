package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static  ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

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
                    showAddAvailableAppointmentsMenu();
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
            System.out.println(":: Select a Month");
            for(int i = 0; i < 3; i++){ //Recorremos los meses por trimestre
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner((System.in));
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4){
                //trabajamos con los meses. Opciones 1,2,3
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected-1]);

                System.out.println("Insert the Date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: " +  date + "\n1. Correct \n2. Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time available for date: " + date + " [16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: " +  time + "\n1. Correct \n2. Change Date");
                    responseTime = Integer.valueOf(sc.nextLine());

                    if(responseTime == 2) continue;
                }while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);


            }else if (response == 0){
                showDoctorMenu();
            }

        }while (response != 0);
    }
    //En este método comprobamos si el doctor que estamos pasando tiene citas y además no existe en la lista es cuando lo agregamos al array creado al inicio de la clase.
    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
