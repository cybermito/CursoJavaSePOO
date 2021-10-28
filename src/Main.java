import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;
import ui.UIMenu;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        
/*
        model.Doctor myDoctor = new model.Doctor();
        myDoctor.name = "model.Doctor Who"; //Asignamos datos al atributo name
        myDoctor.showName(); //Llamada al método shoName()
        myDoctor.showId(); //Vemos el contenido de la variable static id de la clase model.Doctor.
        //System.out.println(model.Doctor.id);

        model.Doctor myDoctor2 = new model.Doctor();
        myDoctor2.showId();
        //System.out.println(model.Doctor.id);

 */
        // showMenu(); //Es un método de la clase ui que hemos importado al inicio del programa. Al importar la clase no
        //es necesario referenciar ni instanciar la clase general.

        Doctor myDoctor = new Doctor("Who", "del tiempo");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "2pm");
        System.out.println(myDoctor); //Carga el objeto myDoctor con el método toString() implícitamente.

        /*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Nuria Mariella", "numar@numilu.com");
        patient.setWeight(52.5);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
        System.out.println();

        System.out.println("Sacando información de una clase con el uso de toString(), clase sobreescrita en la clase model.User");
        System.out.println(patient);
        System.out.println();
        /*
        System.out.println(patient.name);
        System.out.println(patient.email);

        patient.weight = 52.5; //Kg. Este tipo de asignación de información en este momento es inconsistente porque
                               //Nosotros no sabemos si son Kg, mts, et. De echo podríamos asignar el valor 600 y seguiría funcionando.
                               //Lo mismo ocurriría con el nombre y algún otro dato, que podríamos modificarlo en cualquier punto del programa
                               //Generando incosistencia. Para evitar esto tenemos que usar encapsulamiento. Es cuando decidimos el nivel de acceso de una variable
                               //especifica. No permitir ningún otro cambio de dicha variable. Usaremos los modificadores de acceso dentro de la clase correspondiente.
                               //Al encapsular la variable, todos estos comando que tenemos aquí puestos darían error por que no pueden acceder a estos datos.
                               //Ver las modificaciones hechas en la clase patient.
        patient.height = 1.63; //Mts.
        System.out.println(patient.weight);
        System.out.println(patient.height);
        */

        System.out.println("Utilizamos las clases y métodos abstractos");
        User user = new Doctor("Antonio", "cybermito@gmail.com");
        user.showDataUser();

        User userPatient = new Patient("Paciente", "email@correo.com");
        userPatient.showDataUser();

        /*
            Clases Anónimas: Las Clases Anónimas son una forma de instanciar clases abstractas sin necesidad de usar sus clases hijas. Pero este tipo de instanciación
            tiene algunas restricciones: el ciclo de vida de estas instancias NO es duradero, no las tendremos disponibles durante toda la ejecución del programa.

            // Clase Abstracta:
                public abstract class Figura {
                    abstract void dibujar();
                }

            // Clase Anónima:
                User user = new User() {
                  @Override
                  public void showDataUser() {
                    // Instrucciones...
                  }
                };
         */
        User user1 = new User("UserAnonimo", "email@mio.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();
    }


}
