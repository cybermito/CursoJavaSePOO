public class User {
    //Esta clase nos permitirá definir que tipo de usuario se va a loguear: Doctor o Paciente.
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
        return "User: " + name + "\nEmail: " + email + "\nAddress: " + address + "\nPhone: " + phoneNumber;
    }
}
