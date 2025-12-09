import java.util.Scanner; //Importamos Scanner
/**
 * Implementa una clase Test en la que realices las siguientes operaciones:
 * 
 * ○ Crea una revista con los datos que introduzca el usuario por pantalla y 
 * muestra los datos del objeto creado por pantalla.
 * ○ Crea un libro con los datos que introduzca el usuario por pantalla excepto
 * el valor de prestado, que inicialmente será false. Después, muestra los datos
 * del objeto por pantalla.
 * ○ Presta el libro, muestra los datos por pantalla, devuelve el libro y 
 * muestra los datos nuevamente.
 * ○ Para probar el polimorfismo, crea una revista a partir de la superclase 
 * Publicación y un libro a partir de la interfaz Prestable. Posteriormente, 
 * realiza las operaciones de la misma forma que lo hiciste anteriormente.
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {
        
        //Creamos los objetos, primero sin polimofismo y pidiendoselo al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Crear Revista---");
        System.out.println("Código: ");
        String codigoR = entrada.nextLine();
        System.out.println("Título: ");
        String tituloR = entrada.nextLine();
        System.out.println("Año: ");
        int añoR = entrada.nextInt();
        System.out.println("Número: ");
        int numeroR = entrada.nextInt();
        entrada.nextLine();
        
        Revistas revista = new Revistas(numeroR, codigoR, tituloR, añoR);
        System.out.println("Revista creada");
        System.out.println(revista);
        
        System.out.println("---Crear Libro---");
        System.out.println("Código: ");
        String codigoL = entrada.nextLine();
        System.out.println("Título: ");
        String tituloL = entrada.nextLine();
        System.out.println("Año: ");
        int añoL = entrada.nextInt();
        entrada.nextLine();
        
        Libros libro = new Libros(false, codigoL, tituloL, añoL);
        System.out.println("Libro creado");
        System.out.println(libro);
        
        System.out.println("---Prestando y devolviendo Libro---");
        libro.prestar();
        System.out.println(libro);
        libro.devolver();
        System.out.println(libro);
        entrada.nextLine();
        
        //Creamos los objetos usando polimorfismo
        Revistas pubRevistas = new Revistas(236, "112345", "Marca", 2025);
        System.out.println("Revista creada desde Publicación");
        System.out.println(pubRevistas);
        
        Prestable presLibro = new Libros(true, "234644", "Drizz´t Do Urden", 2000);
        System.out.println("Libro creado desde Prestable");
        System.out.println(presLibro);
        presLibro.mostrarPrestado();
        presLibro.prestar();
        presLibro.mostrarPrestado();
        presLibro.devolver();     

    }

}
