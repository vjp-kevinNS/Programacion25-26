package tema10arraylist;

import java.util.ArrayList;

/**
 * Los ArrayList son estructuras de datos dinámicas en las que podemos añadir,
 * quitar, modificar elementos durante la ejecución del programa, por tanto su
 * tamaño es dinámico.
 *
 * Para añdir un elemento, se crea el objeto, se encapsula en un nodo y se crea
 * un puntero desde la lista hacia él.
 *
 * Las estructuras de datos dinámicas SOLAMENTE trabajan con OBJETOS, NO
 * TRABAJAN CON TIPOS DE DATOS SIMPLES. Por ello, tenemos que conocer un
 * concepto nuevo: la encapsulación.
 *
 * Las listas son muy eficientes para insertar y eliminar elementos, pero no lo
 * son tanto para acceder a ellos (son más óptimos los arrays).
 *
 * @author KevinNS
 */
public class Tema10ArrayList {

    public static void main(String[] args) {

        // 0. CLASES ENVOLTORIO (WRAPPER): envulven un tipo de dato simple en un objeto         
//        int edad = 20;
//        Integer edadObjeto = edad;  // AutoBoxing: java convierte automáticamente el tipos simple int en objeto Integer
//        System.out.println(edadObjeto);
//        System.out.println(edadObjeto.getClass());
//        
//        int edad2 = edadObjeto;
//        System.out.println(edad2);  // AutoUnboxing: java convierte automáticamente el objeto Integer a tipo simple int
//        
//        // Podemos hacer conversiones de tipo
//        String pass = "1234";
//        int passInt = Integer.parseInt(pass);   // Convierte a int con Integer.parseInt(valor)
//        String passString = Integer.toString(passInt);  // Convierte a String con Integer.toString(valor) == Hace lo mismo que String.valueOf(valor)
//        
//        int velocidad = 120;
//        String velocidadString = String.valueOf(velocidad); // Convierte a String con String.valueOf(valor)

        // 1. ARRAYLIST
        // 1.1. Crear un array
        ArrayList<Integer> edades = new ArrayList<>();

        // 1.2. Insertar
        // 1.2.1. Insertar un elemento al final
        edades.add(1);
        edades.add(8);
        edades.add(7);
        edades.add(3);

        // 1.2.2. Insertar un elemento en un índice
        edades.add(1, 5);

        // 1.3. Obtener
        System.out.println(edades.get(1));
        System.out.println(edades.get(0));

        for (Integer edad : edades) {
            System.out.print(edad);
        }
        System.out.println("");

        // 1.4. Modificar un elemento
        edades.set(0, 3);

        // 1.5. Eliminar
        // 1.5.1. Eliminar 1 elemento por su índice
//        edades.remove(0);

        // 1.5.2. Eliminar un objeto concreto
//        edades.remove(new Integer(3));

        // 1.5.3. Eliminar todos los elementos
//        edades.clear();

        // 1.6. Saber si está vacía
        if (edades.isEmpty()) {
            System.out.println("El ArrayList está vacío");
        } else {
            for (Integer edad : edades) {
                System.out.print(edad);
            }
        }
        System.out.println("");

        // 1.7. Saber su tamaño
        System.out.println("El tamaño del ArrayList es: " + edades.size());

        // 1.9. Contiene
        System.out.println(edades.contains(0));

        // 1.10. Obtener el índice de un elemento
        // 1.10.1. Obtener el primer índice
        System.out.println("El índice del número 3 es: " + edades.indexOf(3));
        System.out.println("El índice del número 3000 es: " + edades.indexOf(3000));

        // 1.10.2. Obtener el último índice
        System.out.println("El último índice de 3 es: " + edades.lastIndexOf(3));

        // Saber si un elemento está repetido
        if (edades.indexOf(5) == edades.lastIndexOf(5)) {
            System.out.println("El número no está repetido");
        } else {
            System.out.println("El número está repetido");
        }

        // 1.11. Clonar
        ArrayList<Integer> numeros = (ArrayList) edades.clone();
        numeros.forEach(numero -> System.out.println(numero));
        numeros.forEach(System.out::println);

        // 1.12. Convertir en array
        Object[] edadesArray = edades.toArray();
        System.out.println("El primer elemento del array es: " + edadesArray[0]);

    }

}

