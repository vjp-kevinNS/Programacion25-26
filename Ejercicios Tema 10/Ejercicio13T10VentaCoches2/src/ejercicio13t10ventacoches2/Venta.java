package ejercicio13t10ventacoches2;

/**
 * Clase VENTA cuyos atributos son 2: 
 * 
 * • Nombre de Mes. 
 * • Ventas de coches del mes.
 *
 * @author KevinNS
 */
public class Venta {
    
    // Creamos los atributos
    private String nombreMes;
    private int ventasCochesMes;
    
    // Creamos los constructores por defecto
    public Venta() {
        this.nombreMes = "";
        this.ventasCochesMes = 0;
    }
    
    // Creamos los constructores parametrizados
    public Venta(String nombreMes, int ventasCochesMes) {
        this.nombreMes = nombreMes;
        this.ventasCochesMes = ventasCochesMes;
    }
    
    // Creamos los getters y setters

    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getVentasCochesMes() {
        return ventasCochesMes;
    }

    public void setVentasCochesMes(int ventasCochesMes) {
        this.ventasCochesMes = ventasCochesMes;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Venta |  Mes: " + nombreMes + " | Ventas de coches al mes: " 
                + ventasCochesMes;
    }
    
    
    

}
