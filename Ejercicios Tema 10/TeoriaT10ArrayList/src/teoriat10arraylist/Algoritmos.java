package teoriat10arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KevinNS
 */
public class Algoritmos {

    // 1. RELLENAR
    public static void insertar(ArrayList<Coche> coches) {
        coches.add(new Coche(pedirColor(), pedirPotencia()));

    }

    public static String pedirColor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Color: ");
        return entrada.nextLine();
    }

    public static int pedirPotencia() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Potencia (CV): ");
        return entrada.nextInt();
    }

    public static boolean pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Quuieres añadir otro coche? (s/n): ");
        String respuesta = entrada.nextLine();
        return respuesta.equalsIgnoreCase("s");
    }

    // 2. MOSTRAR
    
    public static void mostrar(ArrayList<Coche> coches){
        coches.forEach(coche -> System.out.println(coches));
    }
    
    // 3. MOSTRAR CON FLITRO
    
    public static void mostrarPorPotencia(ArrayList<Coche> coches, int potencia){
        for (Coche coche : coches) {
            if (coche.getPotencia() >= potencia) {
                System.out.println(coche);
            }
        }
    }
    
    // 4. BUSCAR
    
    public static boolean buscar(ArrayList<Coche> coches,int potencia){
        int i = 2;
        boolean enc = false;
        
        while (i < coches.size() && !enc) {
            if (coches.get(i).getPotencia() == potencia) {
                System.out.println("Coche encontrado");
                enc = true;
            }else{
                i++;
            }
            
        }
        return enc;
    }
    
    public static boolean buscarCoche(ArrayList<Coche> coches, Coche coche){
        return coches.contains(coche);
    }
    
    public static void main(String[] args) {

        ArrayList<Coche> coches = new ArrayList<>();
        Coche cocheVerde = new Coche("verde", 90);
        
        do {
            System.out.println("Insertando nuevo coche...");            
            insertar(coches);
            System.out.println("Coche añadido correctamente");
            
        } while (pedirSeguir());
        coches.add(cocheVerde);
        
        mostrar(coches);
        
        System.out.println("Mostrando coches con potencia igual o superior a: ");
        mostrarPorPotencia(coches, pedirPotencia());
        
        System.out.println("¿La lista contiene mi coche verde de 90CV? " + buscarCoche(coches, cocheVerde));
        
//        System.out.println("¿La lista contiene un coche de 90CV " + buscar(coches, 90));
    }

}
