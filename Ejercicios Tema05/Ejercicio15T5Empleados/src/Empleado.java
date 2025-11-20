/**
 * Diseñar una clase Empleado con los atributos nombre (de tipo String), salario (de tipo
   int) y dirección (de tipo Dirección).
 * 
 * @author KevinNS
 */
public class Empleado {
    
    //Creamos los atributos
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //Creamos los constructores por defecto
    public Empleado(){
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion();
    }
    
    //Creamos los constructores con sus parámetros
    public Empleado(String nombre, int salario, Direccion direccion){
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    //Creamos los getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    //Creamos To String
    @Override
    public String toString(){
        return "El empleado se llama " + this.nombre + " cobra " + this.salario +
                " y vive en " + this.direccion;
}
}
