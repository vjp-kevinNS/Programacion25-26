package ejercicio8t8tiendadeporte;
import java.util.Scanner; // Importamos Scanner
/**
 * Realiza un programa en JAVA en el que se creen los objetos que desee el
 * usuario y que los vaya metiendo en un array. 
 * Cada objeto contiene como atributos el nombre de un producto de una tienda de
 * deportes, su precio y su stock. 
 * 
 * • Un método estático le mostrará al usuario un menú de Administración,
 * que le preguntará al usuario cuantos productos desea introducir en la tienda,
 * y luego, mediante métodos estáticos, le irá pidiendo el nombre, el precio y
 * el stock de cada uno. 
 * 
 * • Realiza un método estático que le muestre al usuario un menú de Venta para 
 * que elija que producto comprar, y otro método estático que le pregunte cuantas 
 * unidades desea de él. Luego, en otro método estático se le preguntará si desea 
 * comprar otro producto o salir. Por último se le mostrará el importe total de 
 * la compra. 
 * 
 * • Realiza otro método para actualizar el valor del stock de un producto cuando
 * el usuario lo compre. En caso de que el usuario pida más unidades de las que 
 * quedan se le avisará por pantalla del error, se le comunicarán las unidades 
 * restantes y le preguntará si desea comprar otro producto.
 *
 * @author KevinNS
 */
public class Ejercicio8T8TiendaDeporte {
    
    /**
     * Método para dar de alta uno o varios productos
     * @param menuProd 
     */
    public static Producto[] menuAdministracion(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---- BIENVENIDO A LA TIENDA DE DEPORTES ----");
        System.out.println("¿Cuántos productos quieres dar de alta?");
        int cantidad = entrada.nextInt();
        entrada.nextLine(); // Limpiamos el buffer
        
        // Creamos el array
        Producto[]inventario = new Producto[cantidad];
        
        for (int i = 0; i < inventario.length; i++) {
            System.out.println("PRODUCTO " + (i + 1) + ": ");
            System.out.println("Introduzca el nombre del producto:");
            String nombreProd = entrada.nextLine();
            System.out.println("Introduzca el precio: ");
            double precioProd = entrada.nextDouble();
            System.out.println("Introduzca el stock: ");
            int stockProd = entrada.nextInt();
            entrada.nextLine(); // Limpiamos el buffer
            
            // Creamos el objeto y lo metemos en el array
            inventario[i] = new Producto(nombreProd, precioProd, stockProd);
            System.out.println("---- PRODUCTO ALMACENADO CON EXITO ----");
        }
        return inventario;
    }
    
    /**
     * Método que se encarga del menú de ventas
     * @param venta 
     */
    public static void procesoVenta(Producto[]venta){
        Scanner entrada = new Scanner(System.in);
        double importeTotalAcumulado = 0;
        String respuesContinuar; // (Para cuando le pidamos la opcion de continuar o no al usuario)
        
        // Creamos un bucle do while para repetir la compra si el usuario quiere
        do {
            System.out.println("---- MENU DE VENTAS -----");
            for (int i = 0; i < venta.length; i++) {
                System.out.println("Pulse " + (i + 1) + " para comprar " 
                        + venta[i].getNombreProducto() + "(Precio: )" + venta[i].getPrecioProducto() 
                        + " Euros | Stock " + venta[i].getCantidadStock() + " uds");
            }
            
            System.out.println("Elija una opción: ");
            int opcion = entrada.nextInt() - 1; // Restamos 1 para que empiece por el índice 0
            
            System.out.println("Ha elegido: " + venta[opcion].getNombreProducto());
            System.out.println("¿Cuántas unidades desea?");
            int cantidadDeseada = entrada.nextInt();
            entrada.nextLine();
            
            // Usamos los métodos que hemos creado en la clase Producto
            if (venta[opcion].hayStockSuficiente(cantidadDeseada)) {
                // Si hay Stock el producto se resta
                venta[opcion].reducirStock(cantidadDeseada);
                importeTotalAcumulado += (venta[opcion].getPrecioProducto() * cantidadDeseada);
                System.out.println("Venta realizada con éxito");         
                
            }else{ // Si no hay lo informamos
                System.out.println("Lo sentimos, sólo hay disponibles " 
                        + venta[opcion].getCantidadStock() + " unidades");
            }
            
            System.out.println("¿Desea comprar otro producto (si/no)?");
            respuesContinuar = entrada.nextLine();
            
        } while (respuesContinuar.equalsIgnoreCase("si"));
        System.out.println("El total de su compra es: " + importeTotalAcumulado 
                + " Euros");
        System.out.println("Muchas gracias, vuelva cuándo quiera");
        
    }

    public static void main(String[] args) {
        
        // Creamos el array de Producto llámando al método del menú para darlos de alta 
        Producto[]productoCliente = menuAdministracion();
        
        // Ahora usamos los métodos creados para el menú de ventas
        if (productoCliente != null) {
            procesoVenta(productoCliente);
        }

    }

}
