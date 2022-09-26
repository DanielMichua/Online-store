import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Tiendaonlinee extends JFrame implements ActionListener{
    public JLabel portada, historia, thistoria, imhistoria,thistoria1,thistoria2,thistoria3;
    public JLabel imag, dig, k, ana, digi, ki,anal,digit,kit;
    public JPanel miPanel;
    public JScrollPane scroll;
    public JButton historiab, analogico,digital,kits,salir,carrito;

  public Tiendaonlinee(){
     
    miPanel = new JPanel();
    miPanel.setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido!");
    //miPanel.setBackground(new Color(105,105,105));
    miPanel.setBackground(new Color(0,134,197));

    ImageIcon imagen = new ImageIcon("Portadaprincipal.jpg");
    portada = new JLabel(imagen);
    portada.setBounds(0,0,600,170);
    Icon icono = new ImageIcon(imagen.getImage() .getScaledInstance(portada.getWidth(),portada.getHeight(),Image.SCALE_DEFAULT));
    portada.setIcon(icono);
    miPanel.add(portada);

    historia = new JLabel("Quienes somos?");
    historia.setBounds(50,200,300,80);
    Font fuente2 = new Font("Times New Roman", Font.PLAIN, 40);
    historia.setFont(fuente2);
    historia.setForeground(Color.WHITE);
    miPanel.add(historia);

    thistoria = new JLabel("Somos una tienda de electronica en linea creada desde");
    thistoria.setBounds(90,230,600,100);
    Font fuente3 = new Font("Times New Roman", Font.PLAIN,20);
    thistoria.setFont(fuente3);
    thistoria.setForeground(Color.WHITE);
    miPanel.add(thistoria);

    thistoria1 = new JLabel("el ano de 1999 y ha estado abierta al publico desde entonces");
    thistoria1.setBounds(90,250,600,100);
    Font fuente4 = new Font("Times New Roman", Font.PLAIN,20);
    thistoria1.setFont(fuente4);
    thistoria1.setForeground(Color.WHITE);
    miPanel.add(thistoria1);

    thistoria2 = new JLabel("contamos con las mas grandes ofertas y avances actuales ");
    thistoria2.setBounds(90,270,600,100);
    Font fuente5 = new Font("Times New Roman", Font.PLAIN,20);
    thistoria2.setFont(fuente5);
    thistoria2.setForeground(Color.WHITE);
    miPanel.add(thistoria2);


    thistoria3 = new JLabel("del mercado, si quieres conocer mas, da click en el boton.");
    thistoria3.setBounds(90,290,600,100);
    Font fuente6 = new Font("Times New Roman", Font.PLAIN,20);
    thistoria3.setFont(fuente6);
    thistoria3.setForeground(Color.WHITE);
    miPanel.add(thistoria3);

    historiab = new JButton("Conocer mas");
    historiab.setBounds(430,360,120,20);
    historiab.setBackground(new Color(190,200,200));
    miPanel.add(historiab);

    ImageIcon imagenh = new ImageIcon("analo.jpg");
    imag = new JLabel(imagenh);
    imag.setBounds(40,430,190,90);
    Icon iconoo = new ImageIcon(imagenh.getImage() .getScaledInstance(imag.getWidth(),imag.getHeight(),Image.SCALE_DEFAULT));
    imag.setIcon(iconoo);
    miPanel.add(imag);

    ana = new JLabel("Analogicos");
    Font fuentep = new Font("Times New Roman", Font.PLAIN, 40);
    ana.setBounds(50,350,300,100);
    ana.setFont(fuentep);
    ana.setForeground(new Color(220,220,220));
    miPanel.add(ana);

    anal = new JLabel("Los mejores componentes analogicos!");
    anal.setBounds(240,390,600,100);
    Font fuentedp = new Font("Times New Roman", Font.PLAIN,20);
    anal.setFont(fuentedp);
    anal.setForeground(Color.WHITE);
    miPanel.add(anal);

    analogico = new JButton("Ver componentes");
    analogico.setBounds(420,490,120,20);
    analogico.setBackground(new Color(190,200,200));    
    miPanel.add(analogico);

    ImageIcon imagenv = new ImageIcon("Digital.jpg");
    dig = new JLabel(imagenv);
    dig.setBounds(40,600,190,110);
    Icon iconooo = new ImageIcon(imagenv.getImage() .getScaledInstance(dig.getWidth(),dig.getHeight(),Image.SCALE_DEFAULT));
    dig.setIcon(iconooo);
    miPanel.add(dig);

    digi = new JLabel("Digitales");
    Font fuentevv = new Font("Times New Roman", Font.PLAIN, 40);
    digi.setBounds(60,520,300,100);
    digi.setFont(fuentevv);
    digi.setForeground(new Color(220,220,220));
    miPanel.add(digi);

    digit = new JLabel("Los mayores avances tecnologicos!");
    digit.setBounds(240,570,600,100);
    Font fuentedv = new Font("Times New Roman", Font.PLAIN,20);
    digit.setFont(fuentedv);
    digit.setForeground(Color.WHITE);
    miPanel.add(digit);
    
    digital = new JButton("Ver mas");
    digital.setBounds(420,670,120,20);
    digital.setBackground(new Color(190,200,200));
    miPanel.add(digital);

    ki = new JLabel("Kits");
    Font fuentevvv = new Font("Times New Roman", Font.PLAIN, 40);
    ki.setBounds(80,720,300,100);
    ki.setFont(fuentevvv);
    ki.setForeground(new Color(220,220,220));
    miPanel.add(ki);

    kit = new JLabel("Lo necesario para comenzar!");
    kit.setBounds(250,770,600,100);
    Font fuentedpp = new Font("Times New Roman", Font.PLAIN,20);
    kit.setFont(fuentedpp);
    kit.setForeground(Color.WHITE);
    miPanel.add(kit);

    ImageIcon imagenp = new ImageIcon("kit.jpg");
    k = new JLabel(imagenp);
    k.setBounds(40,800,190,110);
    Icon iconoooop = new ImageIcon(imagenp.getImage() .getScaledInstance(k.getWidth(),k.getHeight(),Image.SCALE_DEFAULT));
    k.setIcon(iconoooop);
    miPanel.add(k);

    kits = new JButton("Ver kits");
    kits.setBounds(420,870,120,20);
    kits.setBackground(new Color(190,200,200));
    miPanel.add(kits);
 
    salir = new JButton("Salir");
    salir.setBounds(420,1050,120,20);
    salir.setBackground(new Color(190,200,200));
    miPanel.add(salir);

    carrito = new JButton("Carrito");
    carrito.setBounds(20,1050,120,20);
    carrito.setBackground(new Color(190,200,200));
    miPanel.add(carrito);

    scroll = new JScrollPane(miPanel);
    miPanel.setPreferredSize(new Dimension(550,1100));
    scroll.getVerticalScrollBar().setUnitIncrement(16);
    add(scroll);

    historiab.addActionListener(this);
    analogico.addActionListener(this);
    kits.addActionListener(this);
    digital.addActionListener(this);
    salir.addActionListener(this);
    carrito.addActionListener(this);
  }

  public void actionPerformed(ActionEvent accion){
   if(accion.getSource() == historiab){
     historia  ven = new historia();
     ven.setBounds(400,400,500,600);
     ven.setVisible(true);
     ven.setResizable(false);
   }
    if(accion.getSource() == analogico){
      try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/tiendae","root","");
        }catch(Exception e){}   
     Analogica venp = new Analogica();
     venp.setBounds(300,250,700,700);
     venp.setVisible(true);
     venp.setResizable(false);
   }
    if(accion.getSource() == kits){
     try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/tiendae","root","");
        }catch(Exception e){}
     kits  venpo = new kits();
     venpo.setBounds(300,250,700,700);
     venpo.setVisible(true);
     venpo.setResizable(false);
   }
    if(accion.getSource() == salir){
     System.exit(0);
   }
    if(accion.getSource() == digital){
     try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/tiendae","root","");
        }catch(Exception e){}
     Digital venv = new Digital();
     venv.setBounds(300,250,700,700);
     venv.setVisible(true);
     venv.setResizable(false);
   }    
    if(accion.getSource() == carrito){
     try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/tiendae","root","");
        }catch(Exception e){}
     carrito venc = new carrito();
     venc.setBounds(300,250,700,700);
     venc.setVisible(true);
     venc.setResizable(false);
   }
  }
  public static void main(String args[]){

     Tiendaonlinee ventanamain = new Tiendaonlinee();
     ventanamain.setBounds(100,100,600,800);
     ventanamain.setVisible(true);
     ventanamain.setResizable(false);

  }
}