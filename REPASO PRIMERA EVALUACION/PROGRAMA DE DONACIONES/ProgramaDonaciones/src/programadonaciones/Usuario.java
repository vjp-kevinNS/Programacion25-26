package programadonaciones;
/**
 * Crearemos la clase Usuario con los atributos email y contraseña
 * 
 * @author KevinNS
 */
public class Usuario {

    //Creamos los atributos
    private String email;
    private int contrasenia;

    //Creamos los constructores por defecto
    public Usuario() {
        this.email = "";
        this.contrasenia = 0;
    }

    //Creamos los contructores parametrizados
    public Usuario(String email, int contraseña) {
        this.email = email;
        this.contrasenia = contrasenia;
    }

    //Creamos los getters y setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    //Creamos To String
    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", contraseña=" + contrasenia + '}';
    }

}
