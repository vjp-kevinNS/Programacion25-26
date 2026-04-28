package ejercicio21t12asignaturasdaw;

import java.util.Scanner;

/**
 * Cada una de las asignaturas serán un objeto cuyos atributos serán el nombre y
 * la nota.
 *
 * @author KevinNS
 */
public class Asignatura {

    // Creamos los atributos
    private String nombre;
    private double nota;

    // Creamos los contructores por defecto
    public Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }

    // Creamos los contructores parametrizados
    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Creamos los getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Creamos To String
    @Override
    public String toString() {
        return "Asignatura | " + " Nombre: " + nombre + " | Nota: " + nota;
    }

    /**
     * Método para pedir nota
     */
    public void introducirNota() {
        Scanner entrada = new Scanner(System.in);

        boolean valida = false;

        do {
            System.out.println("Introduce la nota de " + this.nombre + ": ");

            //Leemos como String y convertimos
            this.nota = Double.parseDouble(entrada.nextLine());

            // Creamos un if else
            if (this.nota >= 0 && this.nota <= 10) {
                valida = true;
            } else {
                System.out.println("Error. la nota debe estar entre 0 y 10");
            }

        } while (!valida);
    }

}
