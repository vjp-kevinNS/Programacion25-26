package repasoteatro;

import java.util.Scanner;

/**
 *
 * @author KevinNS
 */
public class RepasoTeatro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Teatro teatro = new Teatro("El tinkky");

        System.out.println("Nombre del teatro: " + teatro.getNombreTeatro());

        for (int i = 0; i < teatro.getAsientos().length; i++) {
            for (int j = 0; j < teatro.getAsientos()[i].length; j++){
                                            
                teatro.getAsientos()[i][j] = null;
                
            }
            
        }
        int fila = 0;
        int columna = 0;
        System.out.println("Indica la fila: ");
        fila = entrada.nextInt();
        System.out.println("Indica la columna: ");
        columna = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Indica los datos de la persona: ");
        System.out.println("");
        System.out.println("Indica su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Introduce su edad: ");
        int edad = entrada.nextInt();
        System.out.println("Introduce el sexo: ");
        String sexo = entrada.nextLine();
        
        Persona persona = new Persona(nombre, edad, sexo);
        
        teatro.getAsientos()[fila][columna] = persona; 
        
        for (int i = 0; i < teatro.getAsientos().length; i++) {
            for (int j = 0; j < teatro.getAsientos()[i].length; j++){                                           
                
                if (teatro.getAsientos()[i][j] != null) {
                    
                    System.out.println("Fila: " + i + " columna: " + j 
                            + " persona: " + teatro.getAsientos()[i][j].getNombre());
                }else{
                    System.out.println("Este asiento está vacío-> " + " la fila: " 
                            + i + " y la columna: " + j);
                }
                
            }
            
        }
        
        
    }

}
