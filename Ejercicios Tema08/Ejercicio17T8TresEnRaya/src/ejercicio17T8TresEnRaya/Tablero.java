package ejercicio17T8TresEnRaya;

/**
 * Clase Tablero, que contendrá un array de 3x3 de objetos de la clase Ficha.
 *
 * @author KevinNS
 */
public class Tablero {
    
    // Creamos los atributos
    private Casilla[][] cuadricula;
    
    // Creamos el constructor por defecto añadiendo las 9 casillas

    public Tablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadricula[i][j] = new Casilla();
            }
        }
    }
    
    // Creamos los getters y setters

    public Casilla[][] getCuadricula() {
        return cuadricula;
    }

    public void setCuadricula(Casilla[][] cuadricula) {
        this.cuadricula = cuadricula;
    }
    
    // Creamos To String

    @Override
    public String toString() {
        return "Tablero{" + "Cuadricula: " + cuadricula + '}';
    }
    
    // Creamos los métodos propios de ésta clase
    
    /**
     * Método que dibuja el tablero en la consola
     */
    public void dibujarTablero(){
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("| ");
            for (int j = 0; j < 3; j++) {
                System.out.println(cuadricula[i][j].getFicha() + " | ");                
            }
            System.out.println("-------------");
        }
    }
    
 public boolean comprobarGanador(String marca) {

 }
      
    
    

}
