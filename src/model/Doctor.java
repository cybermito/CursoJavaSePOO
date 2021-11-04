package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    //Atributos de la clase model.Doctor.
    //He comentado estos atributos para utilizar la herencia de clases.
    //Cómo los atributos son comunes tanto a Paciente como a model.Doctor, se ha creado una clase superior con dichos atributos comunes, de la cuál heredaremos con extends.
    //static int id = 0; //Valor que debe ser siempre autoincrementado, por eso la declaramos static.
    //private String name;
    //private String email;
    //private String address;
    //private String phoneNumber;

    //Atributo único que diferencia al usuario model.Doctor.
    private String speciality;

    //Método constructor, cada vez que instanciamos la clase model.Doctor este es el primer método que se ejecuta.
    //model.Doctor(){System.out.println("Construyendo el objeto model.Doctor"); } //El constructor está en la clase padre.
    //De este modo le pasamos parametros al método constructor, pero habría que asignarlos a una variable
    //por que si no se perdería la información.
    //Esto se llama sobrecarga de constructores / métodos.
    public Doctor(String name, String email){
        super(name, email );
        System.out.println("El nombre del model.Doctor asignado es: " + name);
        //id++; //Lo quitamos ya que el identificador se usaría directamente con una base de datos.
        //this.name = name; //Al igual que en la clase model.Patient esta parte del constructor ya no la necesitamos.
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos - Métodos de la clase model.Doctor.
    /* Eliminamos estos dos métodos puesto que no los vamos a usar/necesitar
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID model.Doctor: " + id);
    } */

    //Contenido agregado en la clase 16 del Curso - Clases Anidadas.
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override //Esto sobreescribe el método toString para que se comporte como nosotros le digamos.
    //En este caso coge el funcionamiento ya sobreescrito en la clase padre model.User y le añadimos más datos.
    public String toString(){
        return super.toString() + "\nSpeciality: " +speciality+ "\nAvailable " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Oncología");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); //Esto es una clase que nos permite dar formato a fechas que provienen de un string.

        public AvailableAppointment(String date, String time){

            try {
                this.date = format.parse(date); //Convierte de formato String a formato date
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String DATE){
            return format.format(date); //Convierte de formato date a formato string
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }


        @Override
        public String toString() {
            return "Available Appointments \nDate: " +date+ "\nTime: " +time;

        }
    }
}
