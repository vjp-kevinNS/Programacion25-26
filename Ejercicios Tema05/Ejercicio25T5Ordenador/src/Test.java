
import java.util.Scanner; //Importamos Scanner

/**
 * La clase Test contendrá los métodos estáticos necesarios para controlar que
 * el usuario introduzca los datos correctos. Además, contiene el método main
 * donde se crearán 2 objetos de la clase Servidor y 2 de la clase Portátil
 * mediante un constructor que reciba los parámetros. También se crearán 1
 * objetos de la clase Servidor y 1 de la clase Portátil mediante el constructor
 * por defecto, por lo que necesitarás llamar posteriormente a los métodos
 * “establecer…” para asignar los valores que te indique el usuario a los
 * atributos del objeto. Por último, muestra los datos de los 6 objetos creados.
 *
 * @author KevinNS
 */
public class Test {

    //Creamos los métodos
    /**
     * Método que le pide al usuario que introduzca la capacidad de DD y si no
     * es múltiplo de 5 da error y vuelve a pedirlo
     *
     * @return la capacidad del DD
     */
    public static int pedirCapacidadDD() {
        int capacidad;

        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduzca la capacidad del Disco Duro (múltiplo de 5)");
            capacidad = entrada.nextInt();

            if (capacidad % 5 != 0) {
                System.out.println("ERROR. Debe ser múltiplo de 5");

            }
        } while (capacidad % 5 != 0); //Repetimos si no es múltiplo de 5

        return capacidad;
    }

    /**
     * Método que pide el precio al usuario y si introduce 0 0 menos de 0
     * saltará el error y volverá a pedirlo
     *
     * @return el precio del equipo
     */
    public static double pedirPrecio() {
        double precio;

        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduzca el precio del equipo (mayor que 0)");
            precio = entrada.nextDouble();
            if (precio <= 0) {
                System.out.println("ERROR. El precio no puede ser 0 o negativo");

            }

        } while (precio <= 0); //Repetimos si es 0 o negativo
        return precio;
    }

    /**
     * Método que permite elegir el modelo de procesador entre los 3 que he
     * elegido y si no elije ninguno dará error
     *
     * @return el modelo de procesador
     */
    public static String elegirModeloProcesador() {
        int opcion;
        String modelo = "";
        boolean eleccionCorrecta = false;

        //Creamos un bucle para que se elija una opción valida en el menú
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Elije el modelo de procesador:");
            System.out.println("1.- Intel Core i7");
            System.out.println("2.- AMD Ryzen 7");
            System.out.println("3.- M3 Pro");
            opcion = entrada.nextInt();
            entrada.nextLine();

            //Creamos un switch para manejar el menú
            switch (opcion) {
                case 1:
                    modelo = "Intel Core i7";
                    eleccionCorrecta = true;
                    break;
                case 2:
                    modelo = "AMD Ryzen 7";
                    eleccionCorrecta = true;
                    break;
                case 3:
                    modelo = "M3 Pro";
                    eleccionCorrecta = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intentelo de nuevo");
            }
        } while (!eleccionCorrecta);
        return modelo;
    }

    /**
     * Método para pedir al usuario el tamaño del monitor y si es menor de 14
     * pulgadas dará un error y volverá a pedirlo
     *
     * @return el tamaño del monitor
     */
    public static int pedirTamañoMonitor() {
        int tamaño;

        //Creamos un do while por que queremos que se repita al menos una vez
        //y se repita si el tamaño es 14 o menos
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduzca el tamaño del monitor (Debe ser mayor de 14 pulgadas)");
            tamaño = entrada.nextInt();

            if (tamaño <= 14) {
                System.out.println("ERROR. El tamaño del monitor debe ser mayor que 14 pulgadas");

            }

        } while (tamaño <= 14);
        return tamaño;
    }

    public static void main(String[] args) {

        //Creamos los objetos con los datos. Primero haremos 4 con sus 
        //constructores con parámetros. 2 servidores y 2 portátiles
        
        //SERVIDOR 1
        
        System.out.println("Datos del SERVIDOR 1: ");
        Servidor servidor1 = new Servidor(
                16, //RAM
                pedirCapacidadDD(),
                elegirModeloProcesador(),
                "Nvidia Gforce GTX", //tarjeta gráfica
                pedirPrecio(),
                pedirTamañoMonitor(),
                "Teclado Mecánico", //Modelo teclado
                "Raton óptico"); //Modelo ratón
        
        //SERVIDOR 2
        
        System.out.println("Datos del SERVIDOR 2: ");
        Servidor servidor2 = new Servidor(
                32, //RAM
                pedirCapacidadDD(),
                elegirModeloProcesador(),
                "Nvidia RTX",
                pedirPrecio(),
                pedirTamañoMonitor(),
                "Teclado membrana", //Modelo teclado
                "Ratón Laser");  //Modelo ratón
        
        //PORTATIL 1
        
        System.out.println("Datos del PORTATIL 1: ");
        Portatil portatil1 = new Portatil(
                8, //RAM
                pedirCapacidadDD(),
                elegirModeloProcesador(),
                "Integrada", //tarjeta gráfica
                pedirPrecio(),
                "HP", //Marca
                pedirTamañoMonitor(),
                2); //peso en kg
        
        //PORTATIL 2 con valores fijos
        
        System.out.println("Datos del PORTATIL 2: ");
        Portatil portatil2 = new Portatil(
                8, //RAM
                500, //Capacidad DD
                "Intel Core i7", //Modelo procesador
                "RTX Mobile", //Tarjeta gráfica
                1.300, //Precio
                "Lenovo", //Marca
                17, //Tamaño monitor
                3); //Peso
        
        //SERVIDOR 3 con constructor por defecto
        
        System.out.println("Datos del SERVIDOR 3: ");
        Servidor servidor3 = new Servidor();
            servidor3.setMemoriaRam(64);
            servidor3.setDiscoDuro(1000);
            servidor3.setModeloProcesador("AMD Ryzen 7");
            servidor3.setModeloGrafica("Nvidia Quadro");
            servidor3.setPrecio(2500);
            servidor3.setTamañoMonitor(24);
            servidor3.setModeloTeclado("Mecánico pro");
            servidor3.setModeloRaton("Optico pro");
            
       //PORTATIL 3 con constructor por defecto
       
        System.out.println("Datos del PORTATIL 3: ");
        Portatil portatil3 = new Portatil();
            portatil3.setMemoriaRam(4);
            portatil3.setDiscoDuro(500);
            portatil3.setModeloProcesador("M3 Pro");
            portatil3.setModeloGrafica("Integrada");
            portatil3.setPrecio(899);
            portatil3.setMarcaPortatil("Acer");
            portatil3.setPantallaPortatil(15);
            portatil3.setPesoPortatil(2);
            
      //Mostramos los objetos creados
        System.out.println(servidor1);
        System.out.println(servidor2);
        System.out.println(servidor3);
        System.out.println(portatil1);
        System.out.println(portatil2);
        System.out.println(portatil3);


    }

}
