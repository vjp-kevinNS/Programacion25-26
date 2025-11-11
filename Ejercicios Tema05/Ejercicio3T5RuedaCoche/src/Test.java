/**
 * Para probar el funcionamiento de las clases creadas, crear clase
 * llamada Test que contenga el método main, donde:
    • Se creen 2 objetos de la clase Rueda: rueda1 y rueda2.
    • Establece el material y el tamaño, primero en el objeto rueda1 y luego en rueda2.
    • Muestra los datos (material y tamaño) de las dos ruedas creados.
    • Crea 3 objetos de la clase Coche: coche1, coche2 y coche3.
    • Establece la marca y el modelo de los 3 coches.
    • Establece las ruedas1 para el coche1 y el coche2, y ruedas2 para el coche3.
    • Muestra los datos de los coches creados (marca, modelo, material de su rueda y
     tamaño de su rueda.
 * @author KevinNS
 */
public class Test {


    public static void main(String[] args) {
        
        //Creamos los objetos rueda1 y rueda2
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        
        //Establecemos el material y el tamaño de las ruedas 1 y 2
        rueda1.establecerMaterial("Caucho");
        rueda1.establecerPulgadas(18);
        
        rueda2.establecerMaterial("Madera");
        rueda2.establecerPulgadas(16);
        
        //Mostramos los datos (material y tamaño) de las ruedas creadas
        System.out.println("Datos rueda1: " + rueda1);
        System.out.println("Datos rueda2: " + rueda2);
        
        //Creamos los objetos coche1, coche2 y coche3
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        //Establecemos la marca y el modelo de los 3 coches
        coche1.establecerMarca("Peugeot");
        coche1.establecerModelo("308");
        
        coche2.establecerMarca("Audi");
        coche2.establecerModelo("A3");
        
        coche3.establecerMarca("Seat");
        coche3.establecerModelo("León");
        
        //Establecemos las ruedas1 para coche 1 y 2 y ruedas2 para coche3
        coche1.establecerRueda(rueda1);
        coche2.establecerRueda(rueda1);
        coche3.establecerRueda(rueda2);
        
        //Mostramos los datos de los coches creados
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
    }
    
}
