package tema10arraylisttienda;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author KevinNS
 */
public class TiendaGUI {

    private Tienda tienda = new Tienda();
    private DefaultListModel<Producto> modeloLista = new DefaultListModel<>();
    private JList<Producto> listaProductos = new JList<>(modeloLista);

    public TiendaGUI() {
        JFrame frame = new JFrame("EXTREME SPORTS SHOP 3000");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JButton botonAñadir = new JButton("Añadir Producto");
        JButton botonComprar = new JButton("Comprar Producto");

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonAñadir);
        panelBotones.add(botonComprar);

        frame.add(panelBotones, BorderLayout.NORTH);
        frame.add(new JScrollPane(listaProductos), BorderLayout.CENTER);

        botonAñadir.addActionListener(e -> {
            String nombre = JOptionPane.showInputDialog("Nombre:");
            float precio = Float.parseFloat(
                    JOptionPane.showInputDialog("Precio:")
            );
            int stock = Integer.parseInt(
                    JOptionPane.showInputDialog("Stock:")
            );

            tienda.agregarProducto(nombre, precio, stock);
            actualizarLista();
        });

        botonComprar.addActionListener(e -> {
            int indice = listaProductos.getSelectedIndex();

            if (indice == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione un producto");
                return;
            }

            int cantidad = Integer.parseInt(
                    JOptionPane.showInputDialog("Cantidad:")
            );

            String resultado = tienda.comprarProducto(indice, cantidad);
            JOptionPane.showMessageDialog(null, resultado);

            actualizarLista();
        });

        frame.setVisible(true);
    }

    private void actualizarLista() {
        modeloLista.clear();
        for (Producto p : tienda.getProductos()) {
            modeloLista.addElement(p);
        }
    }

    public static void main(String[] args) {
        new TiendaGUI();
    }

}
