import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class historia extends JFrame{
    public JLabel etiqueta, portada, titulo;
    public historia(){
       setLayout(null);
       setTitle("Nos alegra que quieras conocer mas de nosotros!!");
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       getContentPane().setBackground(new Color(105,105,105));

       Font fuentet = new Font("Times New Roman", Font.PLAIN, 60);
       titulo = new JLabel("Quienes somos?");
       titulo.setBounds(70,10,600,80);
       titulo.setFont(fuentet);
       titulo.setForeground(Color.WHITE);
       add(titulo);

       ImageIcon imagen = new ImageIcon("somos.jpg");
       portada = new JLabel(imagen);
       portada.setBounds(0,0,490,150);
       Icon icono = new ImageIcon(imagen.getImage() .getScaledInstance(portada.getWidth(),portada.getHeight(),Image.SCALE_DEFAULT));
       portada.setIcon(icono);
       add(portada);

       Font fuentee = new Font("Times New Roman", Font.PLAIN, 20);    
       etiqueta = new JLabel("<html>Somos una tienda de electronica en linea creada desde<p>el ano de 1999 y a estado abierta al publico desde <p>entonces contamos con las mas grandes ofertas y avances <p>tecnologicos del mercado, con la mayor velocidad y <p>el mejor precio del mercado, brindando un mejor <p>emprendimiento y ayudas a nuestros futuros ingenieros <p>que crucen por la carrera de electronica y tengan un <p>mejor desempeno con materiales de calidad<html>");
  
       etiqueta.setBounds(30,200,600,200);
       etiqueta.setFont(fuentee);
       etiqueta.setForeground(Color.WHITE);
       add(etiqueta);
}
    public static void main(String args[]){
      historia ven = new historia();
      ven.setBounds(300,250,500,700);
      ven.setVisible(true);
      ven.setResizable(false);
    }
}