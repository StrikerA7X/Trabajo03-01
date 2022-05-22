/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 *
 * @author TUF GAMING
 */
public class BorderLayout extends JFrame{ 
    public JPanel panel;

    /**
     *
     */
    public BorderLayout(){
        
       setSize(300,200);
       setTitle("BorderLayout"); //Titulo
       setLocationRelativeTo(null);
       iniciarComponentes();
       setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        
    }
    private void iniciarComponentes(){
        
        colocarPaneles();
    
        colocarEtiquetas(); 
        
    }
        
        private void colocarPaneles(){
        panel = new JPanel(); //Creacion panel
        panel.setLayout(null);//Desactivar el diseño del panel
        this.getContentPane().add(panel);//Agregar panel
        }
        private void colocarEtiquetas(){
        //Etiqueta 1
        JLabel etiqueta = new JLabel("Button 3",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta.setBounds(40, 50, 80, 50);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setOpaque(true); //Establecer el fondo para pintar
        etiqueta.setBackground(Color.GRAY);//Color de fondo
        etiqueta.setOpaque(true); //Establecer el fondo para pintar
        etiqueta.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta); //Agregar la etiqueta al panel
        
        //Etiqueta 2
        JLabel etiqueta2 = new JLabel("2",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta2.setBounds(125, 50, 40, 50);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true); //Establecer el fondo para pintar
        etiqueta2.setBackground(Color.GRAY);//Color de fondo
        etiqueta2.setOpaque(true); //Establecer el fondo para pintar
        etiqueta2.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta2); //Agregar la etiqueta al panel
        
        //Etiqueta 3
         JLabel etiqueta3 = new JLabel("Button5",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta3.setBounds(170, 50, 80, 50);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setBackground(Color.GRAY);//Color de fondo
        etiqueta3.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta3); //Agregar la etiqueta al panel
        
        //Etiqueta 4
        JLabel etiqueta4 = new JLabel("Long-Named Button 4",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta4.setBounds(40, 110, 210, 50);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setBackground(Color.GRAY);//Color de fondo
        etiqueta4.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta4); //Agregar la etiqueta al panel
        
        //Etiqueta 7
        JLabel etiqueta7 = new JLabel("Button1",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta7.setBounds(40, 10, 210, 35);
        etiqueta7.setForeground(Color.BLACK);
        etiqueta7.setOpaque(true); //Establecer el fondo para pintar
        etiqueta7.setBackground(Color.GRAY);//Color de fondo
        etiqueta7.setOpaque(true); //Establecer el fondo para pintar
        etiqueta7.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta7); //Agregar la etiqueta al panel
        
        
    }
        
          
}
