package programadonaciones;
/**
 * Crearemos la clase DonacionProducto con los atributos 
 * PRODUCTO, HORA, EMAIL, PUNTO(String)
 * @author KevinNS
 */
public class DonacionProducto {
    
    //Creamos los atributos
    private String producto;
    private String punto;
    private String emailprod; 
    private int hora;
    
    //Creamos los contructores por defecto
    public DonacionProducto(){
        this.producto = "";
        this.punto = "";
        this.emailprod = "";
        this.hora = 0;
    }
    
    //Creamos los contructores parametrizados
    public DonacionProducto(String producto, String punto, String emailprod, int hora){
        this.producto = producto;
        this.punto = punto;
        this.emailprod = emailprod;
        this.hora = hora;
        
    }
    
    //Creamos los getters y setters

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPunto() {
        return punto;
    }

    public void setPunto(String punto) {
        this.punto = punto;
    }

    public String getEmailprod() {
        return emailprod;
    }

    public void setEmailprod(String emailprod) {
        this.emailprod = emailprod;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "DonacionProducto{" + "producto=" + producto + ", punto=" + punto 
                + ", emailprod=" + emailprod + ", hora=" + hora + '}';
    }
    
    

}
