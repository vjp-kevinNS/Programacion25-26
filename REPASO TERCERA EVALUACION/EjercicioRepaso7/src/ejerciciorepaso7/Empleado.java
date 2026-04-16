
package ejerciciorepaso7;

import java.util.ArrayList;

/**
 * ID-DNI-NOMBRE-APELLIDO-EDAD-SALARIO-ARRAYLIST DE TAREA
 * @author KevinNS
 */
public class Empleado {
    
    // Creamos los atributos
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private float salario;
    private ArrayList<Tarea>listaTarea;
    
    // Creamos los constructores por defecto

    public Empleado() {
        this.id = 0;
        this.dni = "";
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.salario = 0.0f;
        this.listaTarea = new ArrayList<>();
    }
    
    // Creamos los constructores parametriazados

    public Empleado(int id, String dni, String nombre, String apellido, int edad, float salario, ArrayList<Tarea> listaTarea) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.listaTarea = listaTarea;
    }
    
    // Creamos los getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public ArrayList<Tarea> getListaTarea() {
        return listaTarea;
    }

    public void setListaTarea(ArrayList<Tarea> listaTarea) {
        this.listaTarea = listaTarea;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Empleado | " + " ID: " + id + " | DNI: " + dni + " | Nombre: " 
                + nombre + " | Apellido: " + apellido + " | Edad: " + edad 
                + " | Salario: " + salario + " | Lista Tarea: " + listaTarea;
    }
    
}
