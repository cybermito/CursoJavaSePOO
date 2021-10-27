package model;
/*
    Clases Abstractas: Es una combinación entre Interface y Herencia de Clases, no implementan todos los métodos, por su composición no es
    necesario instanciarlo, no se pueden crear instancias de una clase abstracta.

    Interface: Te obliga a implementar todos los métodos aunque no los vayamos a utilizar.
    Herencia: A veces no necesitamos crear instancias de una clase padre, porque esta es muy genérica.

    A veces NO necesitamos implementar todos los métodos de una clase heredada o interfaz. No siempre necesitamos
    crear instancias o implementar todos los métodos heredados de una clase padre, así como tampoco podremos necesitamos algún método
    de nuestras interfaces, pero estas nos obligan a escribir el código de todos los métodos que definimos genéricamente.

    Afortunadamente, las Clases Abstractas resuelven todos estos problemas. Son una combinación entre interfaces y herencia donde
    no implementaremos todos los métodos ni tampoco crearemos instancias.
 */
public abstract class User {
    //Esta clase nos permitirá definir que tipo de usuario se va a loguear: model.Doctor o Paciente.
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El número de teléfono debe ser de 8 dígitos máximo.");
        }else if (phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }
    //Aquí estamos sobreescribiendo el método toString() de la clase Object.
    //Lo que hacemos es declararla e indicarle dentro del método lo que queremos que ejecute.
    //La clase Object está por defecto definida, todas las clases heredan de esta superclase.
    //En definitiva le estamos dando otro comportamiento dentro de esta clase.
    @Override
    public String toString() {
        return "model.User: " + name + "\nEmail: " + email + "\nAddress: " + address + "\nPhone: " + phoneNumber;
    }

    /*
        Los Métodos Abstractos son los métodos que debemos implementar obligatoriamente cada vez
        que usemos nuestras clases abstractas, mientras que los métodos que no sean abstractos van a ser opcionales.

        public abstract class Figura {
            abstract void dibujar(); // obligatorio
            void dibujar3D(); // no es obligatorio
        }

        class Triangulo extends Figura {
            void dibujar() {
                // Instrucciones para dibujar el triángulo...
            }
        }
        Recuerda los métodos abstractos solo se pueden implementar en clases abstractas.
        Y las clases abstractas no necesitan ser instanciadas para ser implementadas.
     */
    public abstract void showDataUser();

}
