import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    //Atributos de la clase Doctor.
    //He comentado estos atributos para utilizar la herencia de clases.
    //Cómo los atributos son comunes tanto a Paciente como a Doctor, se ha creado una clase superior con dichos atributos comunes, de la cuál heredaremos con extends.
    //static int id = 0; //Valor que debe ser siempre autoincrementado, por eso la declaramos static.
    //private String name;
    //private String email;
    //private String address;
    //private String phoneNumber;

    //Atributo único que diferencia al usuario Doctor.
    private String speciality;

    //Método constructor, cada vez que instanciamos la clase Doctor este es el primer método que se ejecuta.
    //Doctor(){System.out.println("Construyendo el objeto Doctor"); } //El constructor está en la clase padre.
    //De este modo le pasamos parametros al método constructor, pero habría que asignarlos a una variable
    //por que si no se perdería la información.
    //Esto se llama sobrecarga de constructores / métodos.
    Doctor(String name, String email){
        super(name, email );
        System.out.println("El nombre del Doctor asignado es: " + name);
        //id++; //Lo quitamos ya que el identificador se usaría directamente con una base de datos.
        //this.name = name; //Al igual que en la clase Patient esta parte del constructor ya no la necesitamos.
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos - Métodos de la clase Doctor.
    /* Eliminamos estos dos métodos puesto que no los vamos a usar/necesitar
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    } */

    //Contenido agregado en la clase 16 del Curso - Clases Anidadas.
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
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
    }
}
