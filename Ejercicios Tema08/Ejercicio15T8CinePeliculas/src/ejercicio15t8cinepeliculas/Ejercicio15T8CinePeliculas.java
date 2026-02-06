package ejercicio15t8cinepeliculas;
import java.util.Scanner; // Importamos Scanner
/**
 * La Asociación “Nos gusta el cine” nos ha pedido que desarrollemos un software
 * antes de final de mes. En un principio desarrollaremos una primera versión
 * del software, donde la Asociación quiere almacenar las películas que
 * proyectan (utilizaremos un vector de películas) junto con los socios que
 * asisten a las proyecciones. 
 * 
 * De cada película almacenaremos su título, coste de la licencia y un vector de
 * socios, donde almacenaremos los socios que acuden a la proyección (en esa 
 * primera versión, vamos a suponer que el aforo de la sala de proyección es de 4). 
 * 
 * De los socios almacenaremos los siguientes datos: nombre y precio abonado 
 * (al ser una Asociación, los socios aportan “la voluntad”).
 * 
 * El menú del software tendrá las siguientes opciones:
 * 1. Rellenar las películas junto con los socios que han acudido a verla. 
 * 2. Mostrar las películas y los socios que la han visto. 
 * 3. Mostrar película más rentable (el beneficio neto de una película será la 
 * venta de entradas menos el coste de la licencia). 
 * 4. Mostrar película menos rentable. 
 * 5. Pedir el nombre de una película y mostrar el beneficio neto y toda la 
 * información de los socios que han asistido a verla. 
 * 6. Contar el número de socios que han abonado una cantidad mayor a la pedida 
 * por pantalla. 
 * 7. Salir del programa. Hasta que el usuario no pulse 7 no saldremos del programa 
 * y se volverá a mostrar el menú.
 * 
 * NOTA IMPORTANTE: El beneficio neto de una película será la venta de entradas
 * menos el coste de la licencia. Y RECUERDA: El programa principal debe ser un
 * "esquema" de lo que hace un programa
 *
 * @author KevinNS
 */
public class Ejercicio15T8CinePeliculas {
    
    public static void rellenarPeliculas(Pelicula[]rellenar){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < rellenar.length; i++) {
            System.out.println("---- DATOS DE LA PELICULA ----");
            System.out.println("Introduzca el título de la película: ");
            String tituloPeli = entrada.nextLine();
            System.out.println("Introduzca el coste de la licencia: ");
            double coste = entrada.nextDouble();
            
            // Controlamos que no esté el hueco vacío
            if (rellenar[i] != null) {
                
                for (int j = 0; j < 4; j++) {
                    
                }
            }
        }
        
    }

    public static void main(String[] args) {

    }

}
