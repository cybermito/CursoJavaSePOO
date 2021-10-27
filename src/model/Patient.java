package model;

public class Patient extends User{
    /*
    static int id = 0;
    private String name; //Encapsulamos la variable para que no se pueda modificar. Lo hacemos con el modificador de acceso private.
                         //private hace que la variable solamente sea accesible desde la propia clase y no desde fuera.
    private String email;
    private String address;
    private String phoneNumber;

     */
    //Atributos que diferencia al usario Paciente.
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        //Llámamos al método constructor de la clase padre.
        super(name, email);
        //id++; Comentado por la misma razón que lo hemos comentado en al clase model.Doctor.
        //this.name = name; //Ya no hace falta esta construcción puesto que estos atributos están en la clase padre.
        //this.email = email;
    }
    //Para poder acceder a los datos private de la clase debemos usar los getters y los setters.
    //Esto nos permite modificar dichas variables desde fuera de la clase. Con crtl + ins podémos
    //hacerlo de manera automática.

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + " Kg.";
    }
/*  Al crear la clase model.User estos getters y setter no hacen falta puesto que están creado en la clase padre model.User.
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        model.Patient.id = id;
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
    //En los setters podemos usar expresiones regulares para validar los datos, o, para que se cumplan unas reglas de validación de entrada de información.
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El número de teléfono debe ser de 8 dígitos máximo.");
        }else if (phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }

 */

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    //Sobreescribiendo el método toString() para presentar todos los datos del objeto model.Patient
    @Override
    public String toString(){
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nBlood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde el nacimiento");
    }
}
