package repasoteatro;

/**
 *
 * @author KevinNS
 */
public class Teatro {

    private String nombreTeatro;
    private Persona[][] asientos;

    public Teatro(String nombreTeatro) {
        this.nombreTeatro = nombreTeatro;
        this.asientos = new Persona[3][3];

        int contador = 1;

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {

                String nombre = "Persona" + contador;
                int edad = 18 + (int) (Math.random() * 50);
                String sexo = (Math.random() < 0.5) ? "H" : "M";

                asientos[i][j] = new Persona(nombre, edad, sexo);

                contador++;
            }
        }
    }

    public String getNombreTeatro() {
        return nombreTeatro;
    }

    public Persona[][] getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        String resultado = "Teatro: " + nombreTeatro + "\n";

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                resultado += asientos[i][j] + "\n";
            }
        }

        return resultado;
    }
}
