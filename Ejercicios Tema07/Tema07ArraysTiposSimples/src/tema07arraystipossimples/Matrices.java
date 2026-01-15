package tema07arraystipossimples;

/**
 *
 * @author KevinNS
 */
public class Matrices {

    // Declaramos constantes para filas y columnas
    public final static int FILAS = 3;
    public final static int COLUMNAS = 6;

    public static void main(String[] args) {
        // 1. DECLARAR E INICIALIZAR UNA MATRIZ

        // Filas -> Alumnos
        // Columnas -> Notas
        /**
        |   |   |   P   L   B   I   E   S
        Alumno1 -> [3] [6] [7] [8] [9] [1] 
        Alumno2 -> [5] [7] [8] [3] [10][8] 
        Alumno3 -> [2] [6] [5] [9] [9] [6]
         */
        
        // Lo primero es declarar e inicializar la matriz
        int[][] notasAlumnos = new int[3][6];

        // Ver la longitud de la matriz
        System.out.println(notasAlumnos.length);
        // Ver el número de columnas
        System.out.println(notasAlumnos[0].length);

        // 2. RELLENAR UNA MATRIZ
        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.println("NOTAS DEL ALUMNO" + (i + 1) + ";");

            for (int j = 0; j < notasAlumnos[0].length; j++) {
                notasAlumnos[i][j] = (int)(Math.random() * 11);
            }
        }
        System.out.println("");

        // 3. MOSTRAR UNA MATRIZ
        
        /**
         * Creamos un array en el que en este caso sea el nombre de las 
         * asignaturas que se correspone con la posicion de las columnas 
        */
        System.out.println("NOTAS DE LOS ALUMNOS POR MODULOS");
        String[] nombresAsignaturas = {"Programación", "Lenguaje de Marcas", "Bases de datos", "IPE I", "Entornos de desarrollo", "Sistemas informáticos"};
        
        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.println("NOTAS DEL ALUMNO" + (i + 1) + ";");

            for (int j = 0; j < notasAlumnos[0].length; j++) {
                System.out.println(nombresAsignaturas[j] + ": ");
                System.out.println(notasAlumnos[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        // 4. MOSTRAR UNA MATRIZ "AL REVES"
        System.out.println("NOTAS DE LOS ALUMNOS POR MODULOS");
        for (int j = 0; j < notasAlumnos[0].length; j++) {
            System.out.println(nombresAsignaturas[j] + ": ");
            
            for (int i = 0; i < notasAlumnos.length; i++) {
                System.out.println("Alumno " + (i + 1) + ": " + notasAlumnos[i][j] + " ");
                
            }
            System.out.println("");
        }
        
        // USAR LAS CONSTANTES QUE HEMOS CREADO PREVIAMENTE. ES LO MISMO:
    
        // Rellenar una matriz usando las constantes, igual para los otros casos
        for (int i = 0; i < FILAS; i++) {
            System.out.println("NOTAS DEL ALUMNO" + (i + 1) + ";");

            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println(nombresAsignaturas[j] + ": ");
                System.out.println(notasAlumnos[i][j] + " ");
            }
            System.out.println("");
        }
    }   
}
