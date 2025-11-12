
import java.util.Scanner;

/**
 * Realizar un programa en JAVA en el que le pidas al usuario las notas de las 6
 * asignaturas del Ciclo de DAW y te calcule la nota media del curso.
 *
 * @author KevinNS
 */
public class Principal {

    public static void main(String[] args) {

        //Creamos los objetos
        NotasDAW sistemasInformaticos = new NotasDAW("Sistemas Informaticos");
        NotasDAW baseDeDatos = new NotasDAW("Base De Datos");
        NotasDAW programacion = new NotasDAW("Programacion");
        NotasDAW entornoDeDesarrollo = new NotasDAW("Entorno De Desarollo");
        NotasDAW lenguajesDeMarca = new NotasDAW("Lenguajes De Marca");
        NotasDAW ingles = new NotasDAW("Inglés");

        //Pedimos las notas al usuario
        Scanner entrada = new Scanner(System.in);
        double nota = entrada.nextDouble();
        System.out.println("Introduce la nota de " + sistemasInformaticos.getNombre() + " : ");
        sistemasInformaticos.setNota(entrada.nextDouble());

        System.out.println("Introduce la nota de " + baseDeDatos.getNombre() + " : ");
        baseDeDatos.setNota(entrada.nextDouble());

        System.out.println("Introduce la nota de " + programacion.getNombre() + " : ");
        programacion.setNota(entrada.nextDouble());

        System.out.println("Introduce la nota de " + entornoDeDesarrollo.getNombre() + " : ");
        entornoDeDesarrollo.setNota(entrada.nextDouble());

        System.out.println("Introduce la nota de " + lenguajesDeMarca.getNombre() + " : ");
        lenguajesDeMarca.setNota(entrada.nextDouble());

        System.out.println("Introduce la nota de " + ingles.getNombre() + " : ");
        ingles.setNota(entrada.nextDouble());
        
        //Calculamos la media usando el método
        double media = NotasDAW.calcularMedia(
                sistemasInformaticos.getNota(),
                baseDeDatos.calcularMedia()
                
    }
}
