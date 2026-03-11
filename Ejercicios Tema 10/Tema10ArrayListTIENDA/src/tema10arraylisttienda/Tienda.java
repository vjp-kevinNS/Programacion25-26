package tema10arraylisttienda;

import java.util.ArrayList;

/**
 *
 * @author KevinNS
 */
public class Tienda {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(String nombre, float precio, int stock) {
        // IMPLEMENTAR
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public String comprarProducto(int indice, int cantidad) {
        /*
         Debe:
         - Verificar stock
         - Reducir stock si es posible
         - Devolver mensaje de éxito o error
         */
        return "";
    }


    public static void main(String[] args) {
        
    }

}
