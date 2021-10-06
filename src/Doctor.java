public class Doctor {
    //Atributos de la clase Doctor.
    static int id = 0; //Valor que debe ser siempre autoincrementado, por eso la declaramos static.
    String name;
    String email;
    String speciality;

    //Método constructor, cada vez que instanciamos la clase Doctor este es el primer método que se ejecuta.
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }
    //De este modo le pasamos parametros al método constructor, pero habría que asignarlos a una variable
    //por que si no se perdería la información.
    //Esto se llama sobrecarga de constructores / métodos.
    Doctor(String name, String speciality){
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
}
