package ejerciciorepaso2;

/**
 *
 * @author KevinNS
 */
public class Persona {

    // Creamos los atributos
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String correoElectronico;

    // Creamos los contructores por defecto
    public Persona() {
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.correoElectronico = "";
    }

    // Creamos los contructores parametrizados
    public Persona(int id, String nombre, String apellidos, int edad, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }

    // Creamos los getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // Creamos To String
    @Override
    public String toString() {
        return "Persona | " + " ID: " + id + " | Nombre: " + nombre + " | Apellidos: "
                + apellidos + " | Edad: " + edad + " | Correo Electronico: " + correoElectronico;
    }

}
