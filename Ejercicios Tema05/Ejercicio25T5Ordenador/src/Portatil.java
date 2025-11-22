/**
 *  La subclase Portátil contiene los siguientes atributos: marca, tamaño de
    pantalla y peso
 * 
 * @author KevinNS
 */
public class Portatil extends Ordenador {
    
    //Creamos los atributos
    private String marcaPortatil;
    private int pantallaPortatil;
    private int pesoPortatil;
    
    //Creamos los constructores por defecto
    public Portatil(){
        super();
        this.marcaPortatil = "";
        this.pantallaPortatil = 0;
        this.pesoPortatil = 0;
    }
    //Creamos los constructores con sus parámetros
    public Portatil(String marcaPortatil, int pantallaPortatil, int pedoPortatil){
        super();
        this.marcaPortatil = marcaPortatil;
        this.pantallaPortatil = pantallaPortatil;
        this.pesoPortatil = pesoPortatil;
    }
    
    //Creamos los getter y setter

    public String getMarcaPortatil() {
        return marcaPortatil;
    }

    public void setMarcaPortatil(String marcaPortatil) {
        this.marcaPortatil = marcaPortatil;
    }

    public int getPantallaPortatil() {
        return pantallaPortatil;
    }

    public void setPantallaPortatil(int pantallaPortatil) {
        this.pantallaPortatil = pantallaPortatil;
    }

    public int getPesoPortatil() {
        return pesoPortatil;
    }

    public void setPesoPortatil(int pesoPortatil) {
        this.pesoPortatil = pesoPortatil;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "El portatil es de la marca: " + this.marcaPortatil +
                ", el tamaño de su pantalla es: " + this.pantallaPortatil +
                " y el peso del portatil es: " + this.pesoPortatil;
    }
    
}
