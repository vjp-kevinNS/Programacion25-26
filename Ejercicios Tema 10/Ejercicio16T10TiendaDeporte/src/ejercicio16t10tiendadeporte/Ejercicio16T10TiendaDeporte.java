package ejercicio16t10tiendadeporte;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realizar un programa en JAVA en el realices la gestión de una pequeña tienda
 * de deportes. Para ello manejarás objetos que tendrán 3 atributos:
 *
 * • Nombre del producto: de tipo String.
 *
 * • Precio: de tipo float.
 *
 * • Stock: de tipo int.
 *
 * • Se le mostrarán al usuario un menú con 3 opciones:
 *
 * 1. MENU DEADMINISTRACIÓN
 *
 * 2. MENÚ DE COMPRA
 *
 * 3. SALIR
 *
 * MENU DE ADMINISTRACIÓN: Se visualizará el siguiente submenú:
 *
 * 1. Introducir productos en la lista: Pediremos los datos de un producto al
 * usuario y lo introducimos en la lista.
 *
 * 2. Visualizar la lista de productos.
 *
 * 3. Eliminar productos de la lista: Pediremos el nombre del producto y lo
 * eliminaremos.
 *
 * 4. Volver al menú principal. 
 * 
 * MENU DE COMPRA: 
 * 
 * 1. Comprar productos: 
 * 
 * • Mostramos una lista con los productos a comprar. 
 * 
 * • El usuario elegirá que producto comprar y luego le preguntemos cuantas 
 * unidades desea de él. Luego se le preguntará si desea comprar otro producto o 
 * salir. 
 * 
 * • Por último, se le mostrará el importe total de la compra.
 * 
 * • Date cuenta de que necesitarás actualizar el valor del stock de un producto 
 * cuando el usuario lo compre. En caso de que el usuario pida más unidades de 
 * las que quedan se le avisará por pantalla del error, se le comunicarán las 
 * unidades restantes y le preguntará si desea comprar otro producto.
 * 
 * 2. Volver al menú principal
 *
 * @author KevinNS
 */
public class Ejercicio16T10TiendaDeporte {
    
    
    /** ---- DEPARTAMENTO DE ADMINISTRACION -----
     * 
     * Método que tiene un submenú en el que se le piden al usuario los datos 
     * del producto, muestra la lista y si quiere elimina un producto
     * 
     * @param lista 
     */
    public static void menuAdmin(ArrayList<Producto>lista){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---BIENVENIDO AL DEPARTAMENTO DE ADMINISTRACIÓN----");
        
        int opcionAdmin = 0;
        // Creamos el submenú de gestión
        do {
            
        System.out.println("--------------------------------------------------");
        System.out.println("-------------------ADMINISTRACION-----------------");
        System.out.println("-----------------1.Añadir producto----------------");
        System.out.println("--------------------2.Ver lista-------------------");
        System.out.println("--------------------3.Eliminar--------------------");
        System.out.println("-----------------4.SALIR DEL MENU-----------------");
        System.out.println("--------------------------------------------------");
            
        opcionAdmin = entrada.nextInt();
        entrada.nextLine();
        
        // Pedimos los datos del producto
            if (opcionAdmin == 1) {
                System.out.println("Nombre: ");
                String nombre = entrada.nextLine();
                System.out.println("Precio: ");
                float precio = entrada.nextFloat();
                System.out.println("Stock: ");
                int stock = entrada.nextInt();
                
                // Añadimos el producto a la lista
                lista.add(new Producto (nombre, precio, stock));
            
                // Mostramos la lista
            }else if(opcionAdmin == 2){
                // Recorremos la lista
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(i + ". " + lista.get(i).getNombreProducto()
                            + " - " + lista.get(i).getPrecio() + "€ (Stock: " 
                            + lista.get(i).getStock() + ")");
                    
                }
                // Opción para borrar un producto
            }else if(opcionAdmin == 3){
                System.out.println("Nombre del producto a eliminar: ");
                String eliminar = entrada.nextLine();
                
                // Buscamos el producto que queremos eliminar con un while
                int j = 0;
                boolean encontrado = false; // Si encontramos el producto nos dará un true
                
                while (j < lista.size() && !encontrado) { 
                    if (lista.get(j).getNombreProducto().equalsIgnoreCase(eliminar)) {
                        lista.remove(j); // Borramos de la lista
                        System.out.println("Producto eliminado");
                        encontrado = true; // 
                    }
                    j++; // Avanzamos a loa siguiente posición
                }
            }
       
        } while (opcionAdmin != 4);
    }
    
    /** ----DEPARTAMENTO DE COMPRA----
     * 
     * Método que tiene un submenú en el que el usuario puede realizar su compra
     * 
     * @param lista 
     */
    public static void menuCompra(ArrayList<Producto>lista){
        Scanner entrada = new Scanner(System.in);
        System.out.println("----BIENVENIDO AL DEPARTAMENTO DE COMPRA----");
        
        if (lista.isEmpty()) { // Comprobamos si hay productos en la tienda
            System.out.println("La tienda está vacía ahora mismo"); // Si no hay se informa de que no hay productos
            return;
        }
        
        float totalCompra = 0;
        String continuar = "si"; // Por si el cliente quiere seguir comprando
        
        // Creamos un bucle while. Mientras el cliente quiera seguir comprando
        // se repetirá
        
        while (continuar.equalsIgnoreCase("si")) {            
            System.out.println("---PRODUCTOS DISPONIBLES---");
            // Recorremos la lista
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + ". " + lista.get(i).getNombreProducto()
                        + " [" + lista.get(i).getPrecio() + "€]");
            }
            
            System.out.println("Elige el número del producto: ");
            int indice = entrada.nextInt();
            
            if (indice >= 0 && indice < lista.size()) {
                Producto prod = lista.get(indice);
                
                System.out.println("¿Cuántas unidades de " + prod.getNombreProducto() 
                        + " quieres?" );
                int cantidad = entrada.nextInt();
                
                // Verificamos si tenemos stock
                if (cantidad <= prod.getStock()) {
                    totalCompra += (prod.getPrecio() * cantidad); // Sumamos al importe total
                    prod.setStock(prod.getStock() - cantidad); // Actualizamos el stock
                    System.out.println("Venta realizada con éxito");
                    
                }else{
                    System.out.println("Error. Solo quedan " + prod.getStock() 
                            + " unidades");
                }
            }
            
            // Preguntamos al usuario si quiere seguir comprando
            System.out.println("¿Deseas comprar otro producto? (si/no): ");
            continuar = entrada.next();
        }
        // Si ya ha finalizado la compra le mostramos el importe total
        System.out.println("El importe total de su compra es: " + totalCompra + "€");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Creamos la lista del inventario
        ArrayList<Producto>inventario = new ArrayList<>();
        
        // Creamos el menú controlando excepciones
        int opcionPrincipal = 0;
        
        do {
            try {
                System.out.println("Introduce una opción para empezar el proceso: ");
                System.out.println();
                System.out.println("------1.ENTRAR AL MENU DE ADMINISTRACION------");
                System.out.println("------2.ENTRAR AL MENU DE COMPRA--------------");
                System.out.println("------3-SALIR DEL PROGRAMA--------------------");
                opcionPrincipal = entrada.nextInt();
                
                switch (opcionPrincipal) {
                    case 1:
                        menuAdmin(inventario);
                        break;
                    case 2:
                        menuCompra(inventario);
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }
            
            
        } while (opcionPrincipal != 3);
      
    }

}
