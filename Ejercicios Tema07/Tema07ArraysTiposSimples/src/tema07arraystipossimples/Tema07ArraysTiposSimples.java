
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
        String [] diasSemana = {"Lunes", "Martes", "Jueves","Miércoles", "Sábado", "Viernes", "Domingo"};
        
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
        System.out.println("¿diasSemana contiene Jueves?");
        System.out.println(buscar(diasSemana));
        
        System.out.println("ORDENANDO ARRAY DE NOTAS");
        burbuja(notas);
        for(float nota : notas){
            System.out.println(nota);
        }
    }
    
    // BUSCAR UN VALOR EN UN ARRAY
    
    public static boolean buscar(String[] diasSemana){
        int  i = 0;
        boolean encontrado = false;
        
        while(i < diasSemana.length && !encontrado){
            if(diasSemana[i].equalsIgnoreCase("Jueves")){
                encontrado = true;
                System.out.println("¡Encontrado!");  
            }else {
                i++;
            }
        }
        
        return encontrado;
    }
    
    // METODO DE LA BURBUJA PARA ORDENAR UN ARRAY (hemos desordenado los días)
    
    public static void burbuja(float[]notas){
        float aux;
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length - 1; j++) {
                if(notas[j] > notas[j + 1]){
                    aux = notas[j];
                    notas[j] = notas[j +1];
                    notas[j + 1] = aux;
                    
                }
            } 
        }
    }
    
}
