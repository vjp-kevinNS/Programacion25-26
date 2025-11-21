import java.util.Scanner; //Importamos Scanner

/**
 * Desarrolle una aplicación en Java que determine el sueldo bruto para cada uno
 * de los tres empleados de una empresa. La empresa paga la tarifa normal en las
 * primeras 40 horas de trabajo de cada empleado, y paga tarifa y media en todas
 * las horas trabajadas que excedan de 40. • El programa creará 3 objetos (uno
 * para cada empleado) y se le pedirá al usuario que rellene la información para
 * cada empleado en el constructor. • Por cada empleado se almacenará su nombre,
 * el número de horas que trabajó, y la tarifa que cobra por una hora de
 * trabajo.
 *
 * @author KevinNS
 */
public class Test {

    public static void main(String[] args) {

        //Pedimos los datos de los 3 empleados y creamos los objetos en cada uno
        //de ellos
        Scanner entrada = new Scanner(System.in);

        System.out.println("EMPLEADO 1");
        System.out.println("Nombre: ");
        String nombre1 = entrada.nextLine();
        System.out.println("Horas trabajadas: ");
        int horas1 = entrada.nextInt();
        System.out.println("Tarifa por hora (€): ");
        double tarifa1 = entrada.nextDouble();
        entrada.nextLine();
        Empleado empleado1 = new Empleado(nombre1, horas1, tarifa1);

        System.out.println("EMPLEADO 2");
        System.out.println("Nombre: ");
        String nombre2 = entrada.nextLine();
        System.out.println("Horas trabajadas: ");
        int horas2 = entrada.nextInt();
        System.out.println("Tarifa por hora (€): ");
        double tarifa2 = entrada.nextDouble();
        entrada.nextLine();
        Empleado empleado2 = new Empleado(nombre2, horas2, tarifa2);

        System.out.println("EMPLEADO 3");
        System.out.println("Nombre: ");
        String nombre3 = entrada.nextLine();
        System.out.println("Horas trabajadas: ");
        int horas3 = entrada.nextInt();
        System.out.println("Tarifa por hora (€): ");
        double tarifa3 = entrada.nextDouble();
        entrada.nextLine();
        Empleado empleado3 = new Empleado(nombre3, horas3, tarifa3);
        
        //Mostramos los sueldos
        System.out.println(empleado1.getNombre() + " : " + empleado1.calcularSueldo() + " € ");
        System.out.println(empleado2.getNombre() + " : " + empleado2.calcularSueldo() + " € ");
        System.out.println(empleado3.getNombre() + " : " + empleado1.calcularSueldo() + " € ");

    }

}


