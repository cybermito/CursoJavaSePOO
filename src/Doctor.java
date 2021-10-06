import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos de la clase Doctor.
    static int id = 0; //Valor que debe ser siempre autoincrementado, por eso la declaramos static.
    private String name;
    private String email;
    private String speciality;

    //Método constructor, cada vez que instanciamos la clase Doctor este es el primer método que se ejecuta.
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }
    //De este modo le pasamos parametros al método constructor, pero habría que asignarlos a una variable
    //por que si no se perdería la información.
    //Esto se llama sobrecarga de constructores / métodos.
    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos - Métodos de la clase Doctor.
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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
