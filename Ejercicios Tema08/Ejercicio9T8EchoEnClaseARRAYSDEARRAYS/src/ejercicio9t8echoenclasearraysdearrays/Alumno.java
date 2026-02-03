package ejercicio9t8echoenclasearraysdearrays;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author KevinNS
 */
public class Alumno {
    
    // Creamos los atributos
    private String nombre;
    private Asignatura[] notas;
    private final String[] NOMBRES_ASIGNATURAS = {"Lengua", "Mates", "Historia", "Física"};
    
    // Creamos los contructores por defecto
    public Alumno(){
        this.nombre = "";
        this.notas = new Asignatura[4];
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }
    
    // Creamos el constructor individual
    public Alumno(String nombre){
        this.nombre = nombre;
        this.notas = new Asignatura[4];
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }
    
    // Creamos los constructores parametrizados
    public Alumno(String nombre, Asignatura[]notas){
        this.nombre = nombre;
        this.notas = notas;
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }
    
    // Creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    } 
    
    // Métodos
    public int pedirNota(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota: ");
        return entrada.nextInt();
    }
    
    public void rellenarNotas(){
        for (int i = 0; i < notas.length; i++) {
            notas[i].setNota(pedirNota());
        }
    }
    
    public void mostrar(){
        for (Asignatura nota : notas) {
            System.out.println(nota);
        }
    }
    
    public float calcularMedia(){
        float media = 0;
        
        for (Asignatura asignatura : notas) {
            media += asignatura.getNota();
        }
        return media / notas.length;
}
    // Creamos To String

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + ", NOMBRES_ASIGNATURAS=" + NOMBRES_ASIGNATURAS + '}';
    }
}
