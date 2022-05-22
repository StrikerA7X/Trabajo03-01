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

    


/**
 *
 * @author TUF GAMING
 */
public class Ventana1 extends JFrame{ 
    public JPanel panel;

    /**
     *
     */
    public Ventana1(){
        
       setSize(700,100);
       setTitle("FlowLayout"); //Titulo
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
        JLabel etiqueta = new JLabel("Button 1",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta.setBounds(40, 10, 80, 50);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setOpaque(true); //Establecer el fondo para pintar
        etiqueta.setBackground(Color.GRAY);//Color de fondo
        etiqueta.setOpaque(true); //Establecer el fondo para pintar
        etiqueta.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta); //Agregar la etiqueta al panel
        
        //Etiqueta 2
        JLabel etiqueta2 = new JLabel("2",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta2.setBounds(125, 10, 40, 50);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true); //Establecer el fondo para pintar
        etiqueta2.setBackground(Color.GRAY);//Color de fondo
        etiqueta2.setOpaque(true); //Establecer el fondo para pintar
        etiqueta2.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta2); //Agregar la etiqueta al panel
        
        //Etiqueta 3
         JLabel etiqueta3 = new JLabel("Button3",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta3.setBounds(170, 10, 80, 50);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setBackground(Color.GRAY);//Color de fondo
        etiqueta3.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta3); //Agregar la etiqueta al panel
        
        //Etiqueta 4
        JLabel etiqueta4 = new JLabel("Long-Named Button 4",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta4.setBounds(255, 10, 200, 50);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setBackground(Color.GRAY);//Color de fondo
        etiqueta4.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta4); //Agregar la etiqueta al panel
        
        //Etiqueta 5 
           JLabel etiqueta5 = new JLabel("Button 5",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta5.setBounds(460, 10, 150, 50);
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setOpaque(true); //Establecer el fondo para pintar
        etiqueta5.setOpaque(true); //Establecer el fondo para pintar
        etiqueta5.setBackground(Color.GRAY);//Color de fondo
        etiqueta5.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta5); //Agregar la etiqueta al panel
        
        
        
    }
        
          
}

