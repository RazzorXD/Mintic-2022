/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author kevin
 */
public class Productos extends JFrame implements ActionListener {
    //Definicion de variables de la interfaz

    JLabel referenciaLabel, nombreLabel, cantidadLabel,
            tituloVisualizacion, referenciaProducto, nombreProducto, cantidadProducto;
    JTextField referenciaField, nombreField, cantidadField;
    JButton btnGuardarProductos, btnSalirProductos;

    public Productos() {

        //Inicializacion de la ventana
        setLayout(null);
        setBounds(700, 300, 300, 400);
        setVisible(true);
        setTitle("Productos");

        //Constructor para vizaulizar las variables en la ventana
        referenciaLabel = new JLabel("Referencia Producto: ");
        referenciaLabel.setBounds(20, 20, 150, 20);
        add(referenciaLabel);

        referenciaField = new JTextField(0);
        referenciaField.setBounds(150, 20, 100, 20);
        add(referenciaField);

        nombreLabel = new JLabel("Nombre Producto: ");
        nombreLabel.setBounds(20, 50, 150, 20);
        add(nombreLabel);

        nombreField = new JTextField(0);
        nombreField.setBounds(150, 50, 100, 20);
        add(nombreField);

        cantidadLabel = new JLabel("Cantidad Producto: ");
        cantidadLabel.setBounds(20, 80, 150, 20);
        add(cantidadLabel);

        cantidadField = new JTextField(0);
        cantidadField.setBounds(150, 80, 100, 20);
        add(cantidadField);

        ////////////////////////////////////////////////////////////
        tituloVisualizacion = new JLabel();
        tituloVisualizacion.setBounds(20, 110, 150, 30);
        add(tituloVisualizacion);

        referenciaProducto = new JLabel();
        referenciaProducto.setBounds(20, 140, 150, 20);
        add(referenciaProducto);

        nombreProducto = new JLabel();
        nombreProducto.setBounds(20, 170, 150, 20);
        add(nombreProducto);

        cantidadProducto = new JLabel();
        cantidadProducto.setBounds(20, 200, 150, 20);
        add(cantidadProducto);

        /////////////////////////////////////////////////////////////
        btnGuardarProductos = new JButton("Guardar");
        btnGuardarProductos.setBounds(40, 250, 80, 20);
        add(btnGuardarProductos);
        btnGuardarProductos.addActionListener(this);

        btnSalirProductos = new JButton("Salir");
        btnSalirProductos.setBounds(150, 250, 80, 20);
        add(btnSalirProductos);
        btnSalirProductos.addActionListener(this);

        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent clic) {
        if (clic.getSource() == btnSalirProductos) {
            System.exit(0);
        }
        if (clic.getSource() == btnGuardarProductos) {
            int referenciaLabel = Integer.parseInt(referenciaField.getText());
            String nombreLabel = nombreField.getText();
            int cantidadLabel = Integer.parseInt(cantidadField.getText());

            //Mostramos la info capturada
            tituloVisualizacion.setText("Visualizacion");
            tituloVisualizacion.setForeground(Color.red);
            referenciaProducto.setText("Referencia de Producto: " + referenciaLabel);
            nombreProducto.setText("Nombre de Producto: " + nombreLabel);
            cantidadProducto.setText("Cantidad de Producto: " + cantidadLabel);
        }
    }
}
