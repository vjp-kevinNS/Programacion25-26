package ejerciciorepaso8;

import java.util.ArrayList;

/**
 * PACIENTE: ID–DNI–NOMBRE–EDAD–ENFERMEDAD–ARRAYLIST DE CITAS
 *
 * @author KevinNS
 */
public class Paciente {
    
    // Creamos los atributos
    private int id;
    private String dni;
    private String nombre;
    private int edad;
    private String enfermedad;
    private ArrayList<Cita>listaCitas;
    
    // Creamos los constructores por defecto

    public Paciente() {
        this.id = 0;
        this.dni = "";
        this.nombre = "";
        this.edad = 0;
        this.enfermedad = "";
        this.listaCitas = new ArrayList<>();
    }
    
    // Creamos los constructores parametrizados

    public Paciente(int id, String dni, String nombre, int edad, String enfermedad, ArrayList<Cita> listaCitas) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.enfermedad = enfermedad;
        this.listaCitas = listaCitas;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public ArrayList<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(ArrayList<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Paciente | " + " ID: " + id + " | DNI: " + dni + " | Nombre: " 
                + nombre + " | Edad: " + edad + " | Enfermedad: " + enfermedad 
                + " | Lista Citas: " + listaCitas;
    }
    
    

}
