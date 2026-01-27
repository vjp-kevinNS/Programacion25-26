package tema08arraysdeobjetos;

import java.util.Scanner;

/**
 *
 * @author KevinNS
 */
public class Tema08ArraysDeObjetos {

    public static void main(String[] args) {
        // 1. Crear un array de objetos
        Marcador[] marcadores = new Marcador[3];

        // 2. Instanciar un objeto -> Creamos la clase
        Marcador marcadorAzul = new Marcador("Azul", 0.50f);

        // 3. Asignar un objeto a una posición del array
        marcadores[2] = marcadorAzul;
        marcadores[0] = new Marcador("Verde", 0.3f);

//        // 4. Recorrer un array       
//            // 4.1. Con for:
//        for (int i = 0; i < marcadores.length; i++) {
//            System.out.println(marcadores[i]);
//        }
//            // 4.2. Con for-each:
//        for (Marcador marcador : marcadores) {
//            System.out.println(marcador);
//        }
//
//        
//        
//        // 5. ¡IMPORTANTE! Manejar ArrayIndexOutOfBoundsException
//        try {
//            for (int i = 0; i <= marcadores.length; i++) {
//                System.out.println(marcadores[i]);
//            }
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Estás intentando acceder a un índice del array que no existe");
//        }
//
//        
//        
//        // 6. ¡IMPORTANTE! Manejar NullPointerException
//        try{
//        System.out.println(marcadores[1].getColor());
//        }catch(NullPointerException e){
//            System.out.println("La posición actual no contiene ningún objeto");
//        }
//               
//        
//
//        // 7. Rellenar un array
//        for (int i = 0; i < marcadores.length; i++) {
//            marcadores[i] = new Marcador();
//        }
//        
//        for (int i = 0; i < marcadores.length; i++) {
//            System.out.println(marcadores[i]);
//        }
        
        
        
        /**
         * 8. EJEMPLO
         * 
         */
        
            // 8.1. Rellenar un array con array auxiliar + datos del usuario
        String[]coloresMarcadores = {"Verde", "Rosa", "Azul" };
        
        for (int i = 0; i < marcadores.length; i++) {
            marcadores[i] = new Marcador(coloresMarcadores[i], pedirPrecio());
        }
               
            // 8.2. Mostrar array
            for(Marcador marcador : marcadores){
                System.out.println(marcador);
            }
            
        /**
         * Muestra el marcador más caro
         * 
         * Muestra el precio total de todos los marcadores
         */
        
            // 8.3. Marcador mmás caro
            float mayor = -1;
            Marcador aux = new Marcador();
            
            for (int i = 0; i < marcadores.length; i++) {
                aux = marcadores[i];
                
                if (marcadores[i].getPrecio() > mayor) {
                    mayor = marcadores[i].getPrecio();
                    aux = marcadores[i];
                }
            }
            System.out.println("El marcador con mayor precio es: " + aux);
            
            // 8.4. Precio total de todos los marcadores
            float total = 0;
            
            for (int i = 0; i < marcadores.length; i++) {
                total += marcadores[i].getPrecio();
        }
            
            System.out.println("El precio total de los marcadores es: " + total + "€");
            
            
            
    }
    
    /**
     * Método que pide el precio del marcador al usuario (poner scanner siempre dentro)
     * @return 
     */
    public static float pedirPrecio(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio ");
        return entrada.nextFloat();
    }

}
