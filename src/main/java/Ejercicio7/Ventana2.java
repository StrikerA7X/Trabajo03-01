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
public class Ventana2 extends JFrame{ 
    public JPanel panel;

    /**
     *
     */
    public Ventana2(){
        
       setSize(380,200);
        setTitle("GridLayout"); //Titulo
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
       
        
        //Etiqueta 2
        JLabel etiqueta2 = new JLabel("Button1",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta2.setBounds(40, 10, 80, 40);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true); //Establecer el fondo para pintar
        etiqueta2.setBackground(Color.GRAY);//Color de fondo
        etiqueta2.setOpaque(true); //Establecer el fondo para pintar
        etiqueta2.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta2); //Agregar la etiqueta al panel
        
        //Etiqueta 3
         JLabel etiqueta3 = new JLabel("Button3",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta3.setBounds(40, 60, 80, 40);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setBackground(Color.GRAY);//Color de fondo
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta3); //Agregar la etiqueta al panel
        
        //Etiqueta 4
          JLabel etiqueta4 = new JLabel("Button5",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta4.setBounds(40, 110, 80, 40);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setBackground(Color.GRAY);//Color de fondo
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta4); //Agregar la etiqueta al panel
        
        
              //Etiqueta 11
        JLabel etiqueta11 = new JLabel("2",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta11.setBounds(130, 10, 200,40);
        etiqueta11.setForeground(Color.BLACK);
        etiqueta11.setOpaque(true); //Establecer el fondo para pintar
        etiqueta11.setBackground(Color.GRAY);//Color de fondo
        etiqueta11.setOpaque(true); //Establecer el fondo para pintar
        etiqueta11.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta11); //Agregar la etiqueta al panel
        
        //Etiqueta 12
         JLabel etiqueta12 = new JLabel("Long-Named Button 4",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta12.setBounds(130, 60, 200, 40);
        etiqueta12.setForeground(Color.BLACK);
        etiqueta12.setOpaque(true); //Establecer el fondo para pintar
        etiqueta12.setOpaque(true); //Establecer el fondo para pintar
        etiqueta12.setBackground(Color.GRAY);//Color de fondo
        etiqueta12.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta12); //Agregar la etiqueta al panel
        
        }
}
      

