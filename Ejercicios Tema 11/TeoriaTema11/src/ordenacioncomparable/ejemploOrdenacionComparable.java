package ordenacioncomparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author KevinNS
 */
public class ejemploOrdenacionComparable {

//Método que rellena un conjunto de objetos Alumno con 4 alumnos
    public static void rellenarSetAlumnos(Set<Alumno> conjunto) {    
        Alumno a1 = new Alumno("Juan", 3);
        conjunto.add(a1);      
        Alumno a2 = new Alumno("María", 1);
        conjunto.add(a2);
        Alumno a3 = new Alumno("Pedro", 4);
        conjunto.add(a3);
        Alumno a4 = new Alumno("Ana", 2);
        conjunto.add(a4);  
    }
    
    //Método que muestra un conjunto de objetos Alumno
    public static void mostrarSetAlumnos(Set<Alumno> conjunto) {
        Iterator<Alumno> it = conjunto.iterator();
        
        Alumno alumno;
        while(it.hasNext()) {
            alumno = it.next();
            System.out.println(alumno);
        }   
    }
    
    //Método que ordena un conjunto de alumnos utilizando TreeSet
    public static void ordenacionTreeSet(TreeSet<Alumno> conjunto) {    
        //Al implementar Comparable en la clase Alumno, TreeSet utiliza el método 
        //"compareTo" para insertar los objetos ya ordenados de manera ascendente
        rellenarSetAlumnos(conjunto);     
        //Mostramos el conjunto de alumnos ordenado
        mostrarSetAlumnos(conjunto);   
    }
    
    //Método que ordena un conjunto de alumnos utilizando Arrays.sort()
    public static void ordenacionHashSetConArrays(HashSet<Alumno> conjunto) {   
        //Creamos un vector de alumnos y volcamos los datos del conjunto
        Alumno[] vAlumnos = new Alumno[conjunto.size()];
        conjunto.toArray(vAlumnos);
        //Ordenamos el vector con Arrays.sort
        Arrays.sort(vAlumnos);     
        //Mostramos el array con los objetos ordenados
        for (Alumno a : vAlumnos) {
            System.out.println(a);
        }
    }
    
    //Método que ordena un conjunto de alumnos utilizando Collections.sort()
    public static void ordenacionHashSetConCollections(HashSet<Alumno> conjunto) {    
        //Creamos un ArrayList con los alumnos del conjunto
        List<Alumno> lAlumnos = new ArrayList<>(conjunto);
        //Ordenamos la lista con Collections.sort
        Collections.sort(lAlumnos);     
        //Mostramos la lista con los objetos ordenados
        lAlumnos.forEach(System.out::println);
    }
    
    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creación y ordenación de TreeSet
        /** TreeSet ordena de menor a mayor por defecto sin necesidad
         * de usar la interfaz Comparable y el método compareTo.
         * Pero si queremos ordenarlo de mayor a menor (orden descendente),
         * sí necesitamos implementar la interfaz Comparable y el método
         * compareTo().
         */        
        TreeSet<Alumno> treeSet = new TreeSet<>();
        System.out.println("*** TREE_SET ***");
        ordenacionTreeSet(treeSet);
        
        //Creación y ordenación de HashSet
        HashSet<Alumno> hashSet = new HashSet<>();
        rellenarSetAlumnos(hashSet);
        
        System.out.println("\n*** CONJUNTO + STREAM().SORTED() ***");
        hashSet.stream().sorted().forEach(System.out::println);
        
        System.out.println("\n*** COMPARABLE + ARRAYS.SORT() ***");
        ordenacionHashSetConArrays(hashSet);
        
        System.out.println("\n*** COMPARABLE + COLLECTIONS.SORT() ***");
        ordenacionHashSetConCollections(hashSet);
        
        Set<Alumno> linkedHashSet = new LinkedHashSet<>();
        rellenarSetAlumnos(linkedHashSet);                
    }

}
