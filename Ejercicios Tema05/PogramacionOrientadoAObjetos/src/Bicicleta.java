
/**
 *
 * @author KevinNS
 */
public class Bicicleta {

    //ATRIBUTOS
    private int ruedas;
    private String manillar;
    private String pedales;
    private String frenos;
    private boolean estaPedaleando;
    
    private static int numBicicletas = 0;

    //CONSTRUCTORES por defecto
    public Bicicleta() {
        this.ruedas = 0;
        this.pedales = "";
        this.manillar = "";
        this.frenos = "";
        this.estaPedaleando = false;
        
        //Incrementamos el valor del atributo estático
        incrementarNumBicicleta();

    }

    public Bicicleta(int ruedas, String manillar, String frenos, String pedales, boolean estaPedaleando) {
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
        
        //incrementamos el valor del atributo estático
        incrementarNumBicicleta();
    } 

    //GETTERS Y SETTERS
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setManillar(String manillar) {
        this.manillar = manillar;
    }

    public String getManillar() {
        return this.manillar;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }

    public String getPedales() {
        return this.pedales;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getFrenos() {
        return this.frenos;
    }

    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estaPedaleando = estaPedaleando;
    }

    public boolean getEstaPedaleando() {
        return this.estaPedaleando;
    }
    
    public int getNumBicicletas(){
        return this.numBicicletas;
    }

    //METODOS
    
    public void acelerar(){
        System.out.println("Acelerando...");
    }
    
    private static void incrementarNumBicicleta(){
        numBicicletas++;
    }
    //TO STRING
    @Override
    public String toString() {
        return "Mi bicicleta tiene " + this.ruedas + " ruedas " + " , un manillar "
                + this.manillar + " , unos pedales " + this.pedales
                + " , unos frenos " + this.frenos + " y ahora ¿estoy pedaleando? "
                + this.estaPedaleando;
    }
}
