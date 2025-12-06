
/**
 * Vehiculo tiene como atributos cc, matrícula y dni del
 * propietario. El impuesto que pagan los vehículos es el de
 * circulación, de acuerdo a esta tabla:
 * 
 * ○ Menos de 1.000 cc. Tarifa mínima de alrededor de 12 euros.
 * ○ 1.001 – 1.499 cc. Tarifa de 34 euros.
 * ○ 1.500 – 1.999 cc. Tarifa de 71 euros.
 * ○ 2.000 – 2.999 cc. Tarifa de 122 euros.
 * ○ Más de 3.000 cc. Tarifa de 152 euros.
 *
 * @author KevinNS
 */
public class Vehiculo implements Gravable{
    
    //Creamos los atributos
    private int cc;
    private String matricula;
    private String dniPropietario;
    
    //Creamos los constructores por defecto
    public Vehiculo(){
        this.cc = 0;
        this.matricula = "";
        this.dniPropietario = "";
    }
    
    //Creamos los constructores parametrizados
    public Vehiculo(int cc, String matricula, String dniPopietario){
        this.cc = cc;
        this.matricula = matricula;
        this.dniPropietario = dniPropietario;
    }
    
    //Creamos los getter y setter

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
    
    //Creamos el método que nos manda la interfaz
    
    /**
     * Método que calcula el impuesto en función de los ingresos anuales
     * @return el impuesto
     */
    public double calcularImpuesto(){
        
        double impuesto = 0.0;
        
        System.out.println("Impuesto de ciculación para la matricula: " 
                + this.matricula);
        System.out.println("Cilindrada: " + this.cc);
        if (this.cc <= 1000) {
            impuesto = 12;
        } else if (this.cc >= 1001 && this.cc <= 1499){
            impuesto = 34;
        } else if (this.cc >=1500 && this.cc <= 1999){
            impuesto = 71;
        } else if (this.cc >= 2000 && this.cc <= 2999){
            impuesto = 122;
        } else {
            impuesto = 152;
        }
        return impuesto;
    }
    
    //Creamos el TO String

    @Override
    public String toString() {
        return "Vehiculo con cilindrada: " + cc + " ,con matricula " + matricula 
                + " y el propietario es: " + dniPropietario;
    }
    

}
