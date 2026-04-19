package ejerciciorepaso9;

import java.util.ArrayList;

/**
 * ID, nombre, teléfono y una lista de reparaciones
 *
 * @author KevinNS
 */
public class Cliente implements Comparable<Cliente> {

    // Creamos los atributos
    private int id;
    private String nombre;
    private int telefono;
    private ArrayList<Reparacion> listaReparaciones;

    // Creamos los constructores por defecto
    public Cliente() {
        this.id = 0;
        this.nombre = "";
        this.telefono = 0;
        this.listaReparaciones = new ArrayList<>();
    }

    // Creamos los constructores parametrizados
    public Cliente(int id, String nombre, int telefono, ArrayList<Reparacion> listaReparaciones) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.listaReparaciones = listaReparaciones;
    }

    // Creamos los getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Reparacion> getListaReparaciones() {
        return listaReparaciones;
    }

    public void setListaReparaciones(ArrayList<Reparacion> listaReparaciones) {
        this.listaReparaciones = listaReparaciones;
    }

    // Creamos To String
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", telefono="
                + telefono + ", listaReparaciones=" + listaReparaciones + '}';
    }

    // Creamos el método CompareTo para ordenar por ID
    @Override
    public int compareTo(Cliente otro) {
        return this.id - otro.id;
    }

}
