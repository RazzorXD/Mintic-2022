/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
        
/**
 *
 * @author kevin
 */
public class Productos extends JFrame{
    public Productos(){
        //Definicion de variables de la interfaz
        JLabel referenciaLabel, nombreLabel, cantidadLabel;
        JTextField referenciaField, nombreField, cantidadField;
        JButton btnGuardarProductos, btnSalirProductos;
        
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
        
        btnGuardarProductos = new JButton("Guardar");
        btnGuardarProductos.setBounds(40, 120, 80, 20);
        add(btnGuardarProductos);
        
        btnSalirProductos = new JButton("Salir");
        btnSalirProductos.setBounds(150, 120, 80, 20);
        add(btnSalirProductos);
        btnSalirProductos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                dispose();
            }
        });
        
        repaint();
	//
    }
}
