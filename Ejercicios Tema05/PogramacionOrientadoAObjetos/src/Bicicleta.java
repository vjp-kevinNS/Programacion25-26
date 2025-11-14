
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

    //1.2 ATRIBUTO STATIC(ESTATICO) QUE PERTENECE A LA CLASE
    private static int numBicicletas = 0;

    //1.3 ATRIBUTO DE OTRA CLASE (Composición de clases)
    private Ciclista ciclista;

    //CONSTRUCTORES por defecto
    public Bicicleta() {
        this.ruedas = 0;
        this.pedales = "";
        this.manillar = "";
        this.frenos = "";
        this.estaPedaleando = false;

        //Incrementamos el valor del atributo estático
        incrementarNumBicicleta();
        
        //Inicializamos un ciclista por defecto (con el constructor por defecto)
        this.ciclista = new Ciclista();

    }

    //CONSTRUCTORES PARAMETRIZADOS
    public Bicicleta(int ruedas, String manillar, String frenos, String pedales, boolean estaPedaleando, Ciclista ciclista) {
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;

        //incrementamos el valor del atributo estático
        incrementarNumBicicleta();
        
        //Inicializamos un ciclista con los valores pasados por parámetro
        this.ciclista = ciclista;
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

    public int getNumBicicletas() {
        return this.numBicicletas;
    }

    public Ciclista getCiclista() {
        return ciclista;
    }

    public void setCiclista(Ciclista ciclista) {
        this.ciclista = ciclista;
    }
    

    //METODOS
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    private static void incrementarNumBicicleta() {
        numBicicletas++;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Mi bicicleta tiene " + this.ruedas + " ruedas " + " , un manillar "
                + this.manillar + " , unos pedales " + this.pedales
                + " , unos frenos " + this.frenos + " y ahora ¿estoy pedaleando? "
                + this.estaPedaleando + 
                
                //Imprimimos la informacioón del ciclista
                this.ciclista.toString();
    }
}
