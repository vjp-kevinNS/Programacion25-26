
package tema07arraystipossimples;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author KevinNS
 */
public class Tema07ArraysTiposSimples {


    public static void main(String[] args) {
        // 1. DECLARAR E INICIALIZAR UNA ARRAY
        
        float [] notas = new float [6];
        String [] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        //Por defecto, un array de tipos simples se inicializa con todos sus valores por defecto
        System.out.println(Arrays.toString(notas));
        
        // 2. ACCEDER A UN ELEMENTO
        System.out.println(diasSemana[2]);
        
        // 3. INSERTAR UN ELEMENTO
        notas [1] = 3.2f;
        System.out.println(Arrays.toString(notas));
        
        // 4. RECORRER Y MOSTRAR UN ARRAY
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.print(diasSemana[i] + " - ");
        }
        
        System.out.println("");
        
        //Bucle for it 
        for (String dia : diasSemana){
            System.out.println(dia);
        }
        
        // 5. RELLENAR UN ARRAY
                for (int i = 0; i < notas.length; i++) {
            notas[i] = (float)(Math.random() * 10);
        }
                
        for (float nota : notas){
            System.out.println(nota);
        }        
        
        
    }
    
}
