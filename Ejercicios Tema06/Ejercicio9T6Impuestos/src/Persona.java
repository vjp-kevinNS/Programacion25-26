
/**
 * Persona tiene como atributos dni e ingresosAnuales. El
 * impuesto que pagan las personas es el IRPF, de acuerdo a esta
 * tabla:
 * 
 * • Hasta 12.450 € un 19%.
 * • De 12.450 € a 20.200 € un 24 %.
 * • De 20.200 € a 35.200 € un 30 %.
 * • De 35.200 € a 60.000 € un 37 %.
 * • De 60.000 € a 300.000 € un 45 %.
 * • Más de 300.000 € un 47 %.
 *
 * @author KevinNS
 */
public class Persona implements Gravable{
    
    //Creamos los atributos
    private String dni;
    private double ingresosAnuales;
    
    //Creamos los constructores por defecto
    public Persona(){
        this.dni = "";
        this.ingresosAnuales = 0;
    }
    
    //Creamos los constructores parametrizados
    public Persona(String dni, double ingresosAnuales){
        this.dni = dni;
        this.ingresosAnuales = ingresosAnuales;
    }
    
    //Creamos los getter y setter

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    
    //Creamos el método que nos manda la interfaz
    
    /**
     * Método que calcula el impuesto en función de los ingresos anuales
     * @return el impuesto
     */
    public double calcularImpuesto(){
        
        double impuesto = 0.0;
        double ingresos = this.ingresosAnuales;
        
        System.out.println("Calculando IRPF para DNI: " + this.dni);
        System.out.println("Ingresos anuales: " + ingresos + " €");
        
        if (ingresos <= 12450) {
            impuesto = ingresos * 0.19;    
        } else if (ingresos <= 20200){
            impuesto = ingresos * 0.24;
        }else if (ingresos <= 35200){
            impuesto = ingresos * 0.30;
        }else if (ingresos <= 60000){
            impuesto = ingresos * 0.37;
        }else if (ingresos <= 300000){
            impuesto = ingresos * 0.45;
        }else{
            impuesto = ingresos * 0.47;
        }
        return impuesto;
    }
    
    //Creamos el To String
    @Override
    public String toString() {
        return "Persona con dni: " + dni + " , tiene estos ingresos anuales: " 
                + ingresosAnuales;
    }
    
}
