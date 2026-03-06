package repasoteatro;

import java.util.Scanner;

/**
 *
 * @author KevinNS
 */
public class RepasoTeatro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Creamos un objeto de teatro
        Teatro teatro = new Teatro("El tinkky");
        
        // Mostramos el nombre del teatro
        System.out.println("Nombre del teatro: " + teatro.getNombreTeatro());
        
        // Recorremos la matriz
        for (int i = 0; i < teatro.getAsientos().length; i++) {
            for (int j = 0; j < teatro.getAsientos()[i].length; j++){
                
                // Borramos un asiento
                teatro.getAsientos()[i][j] = null;
                
            }
            
        }
        
        // Pedimos al usuario que introduzca la posición
        int fila = 0;
        int columna = 0;
        System.out.println("Indica la fila: ");
        fila = entrada.nextInt();
        System.out.println("Indica la columna: ");
        columna = entrada.nextInt();
        entrada.nextLine();
        
        // Pedimos al usuario que introduzca los datos de la persona
        System.out.println("Indica los datos de la persona: ");
        System.out.println("");
        System.out.println("Indica su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Introduce su edad: ");
        int edad = entrada.nextInt();
        System.out.println("Introduce el sexo: ");
        String sexo = entrada.nextLine();
        
        // Creamos un objeto de persona con los datos introducidos
        Persona persona = new Persona(nombre, edad, sexo);
        
        // Añadimos la persona a la matriz de teatro
        teatro.getAsientos()[fila][columna] = persona; 
        
        //  Recorremos la matriz
        for (int i = 0; i < teatro.getAsientos().length; i++) {
            for (int j = 0; j < teatro.getAsientos()[i].length; j++){                                           
                
                // Controlamos que esté vacío
                if (teatro.getAsientos()[i][j] != null) {
                    
                    // Imprimimos la fila, la columna y el nombre de la persona que ahi se sienta
                    System.out.println("Fila: " + i + " columna: " + j 
                            + " persona: " + teatro.getAsientos()[i][j].getNombre());
                    // Mostramos si el asiento está vacío
                }else{
                    System.out.println("Este asiento está vacío-> " + " la fila: " 
                            + i + " y la columna: " + j);
                }
                
            }
            
        }
        
        
    }

}
