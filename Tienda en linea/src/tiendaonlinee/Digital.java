import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Digital extends JFrame implements ItemListener, ActionListener, MouseListener{
    
    public JLabel etiqueta, portada, titulo,dig1,dig2,dig3,digi1,digi2,digi3,digit2,digit3;
    public JLabel p1,p2,p3,eventor;
    public JScrollPane scroll;
    public JPanel miPanel;
    public JButton carrito,agregar;
    public JComboBox <String> digita1;
    public JComboBox <String> digita2;
    public JComboBox <String> digita3;
    public String seleccion, pr,pr2;
    public JTextArea textArea;
    public int totalarticulos;
    public int total, prov, prov2,num1,num2,num3;
    public Digital(){
       miPanel = new JPanel();
       miPanel.setLayout(null);
       setTitle("Digital");
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       miPanel.setBackground(new Color(95,61,183));

       Font fuentet = new Font("Edwardian Script ITC", Font.PLAIN, 60);
       titulo = new JLabel("Nuestros vinos");
       titulo.setBounds(220,15,350,80);
       titulo.setFont(fuentet);
       titulo.setForeground(Color.WHITE);
       miPanel.add(titulo);

       digita1 = new JComboBox<String>();
       digita1.setBounds(240,390,60,30);
       miPanel.add(digita1);
   
       digita1.addItem("0");
       digita1.addItem("1");
       digita1.addItem("2");
       digita1.addItem("3");
       digita1.addItem("4");
       digita1.addItem("5");
       digita1.addItem("6");
       digita1.addItem("7");
       digita1.addItem("8");
       digita1.addItem("9");
       digita1.addItem("10");

       digita1.addItemListener(this); 

       digita2 = new JComboBox<String>();
       digita2.setBounds(240,650,60,30);
       miPanel.add(digita2);
   
       digita2.addItem("0");
       digita2.addItem("1");
       digita2.addItem("2");
       digita2.addItem("3");
       digita2.addItem("4");
       digita2.addItem("5");
       digita2.addItem("6");
       digita2.addItem("7");
       digita2.addItem("8");
       digita2.addItem("9");
       digita2.addItem("10");

       digita2.addItemListener(this);

       digita3 = new JComboBox<String>();
       digita3.setBounds(240,875,60,30);
       miPanel.add(digita3);
   
       digita3.addItem("0");
       digita3.addItem("1");
       digita3.addItem("2");
       digita3.addItem("3");
       digita3.addItem("4");
       digita3.addItem("5");
       digita3.addItem("6");
       digita3.addItem("7");
       digita3.addItem("8");
       digita3.addItem("9");
       digita3.addItem("10");

       digita3.addItemListener(this);

       ImageIcon imagen = new ImageIcon("Digital1.jpg");
       portada = new JLabel(imagen);
       portada.setBounds(0,0,700,150);
       Icon icono = new ImageIcon(imagen.getImage() .getScaledInstance(portada.getWidth(),portada.getHeight(),Image.SCALE_DEFAULT));
       portada.setIcon(icono);
       miPanel.add(portada);

       Font fuentee = new Font("Times New Roman", Font.PLAIN, 20);
       etiqueta = new JLabel("<html>Arduino Uno<html>");
       etiqueta.setBounds(230,100,600,200);
       etiqueta.setFont(fuentee);
       etiqueta.setForeground(Color.WHITE);
       miPanel.add(etiqueta);

       ImageIcon imagen1 = new ImageIcon("arduino.jpg");
       dig1 = new JLabel(imagen1);
       dig1.setBounds(20,200,200,200);
       Icon icono2 = new ImageIcon(imagen1.getImage() .getScaledInstance(dig1.getWidth(),dig1.getHeight(),Image.SCALE_DEFAULT));
       dig1.setIcon(icono2);
       miPanel.add(dig1);

       Font fuentev1 = new Font("Times New Roman", Font.PLAIN, 20);

       digi1 = new JLabel("<html>La placa Arduino UNO es la mejor placa para iniciar<p> con la programacion y la electronica. <p>Si es tu primera experiencia con la plataforma <p>Arduino,la Arduino UNO es la opcion mas robusta, <p>mas usada y con mayor cantidad de documentacion<p>de toda la familia Arduino.<html>");
       digi1.setBounds(240,200,600,200);
       digi1.setFont(fuentev1);
       digi1.setForeground(Color.WHITE);
       miPanel.add(digi1);

       Font fuentetv2 = new Font("Times New Roman", Font.PLAIN, 20);
       digit2 = new JLabel("<html>Arduino Mega<html>");
       digit2.setBounds(230,360,600,200);
       digit2.setFont(fuentetv2);
       digit2.setForeground(Color.WHITE);
       miPanel.add(digit2);

       Font fuentedv2 = new Font("Times New Roman", Font.PLAIN, 20);

       digi2 = new JLabel("<html>El Arduino Mega 2560 es una placa de desarrollo <p>basada en el microcontrolador ATmega2560.<p>Tiene 54 entradas/salidas digitales <p>de las cuales 15 pueden ser usadas como salidas <p>PWM, 16 entradas analógicas, 4 UARTs, un cristal <p>de 16Mhz, conexion USB, jack para alimentacion DC,<p> conector ICSP, y un boton de reseteo<html>");
       digi2.setBounds(240,460,600,200);
       digi2.setFont(fuentedv2);
       digi2.setForeground(Color.WHITE);
       miPanel.add(digi2);

       ImageIcon imagen2 = new ImageIcon("ArduinoMega.jpg");
       dig2 = new JLabel(imagen2);
       dig2.setBounds(20,450,200,200);
       Icon icono3 = new ImageIcon(imagen2.getImage() .getScaledInstance(dig2.getWidth(),dig2.getHeight(),Image.SCALE_DEFAULT));
       dig2.setIcon(icono3);
       miPanel.add(dig2);

       ImageIcon imagen3 = new ImageIcon("Atmega.jpg");
       dig3 = new JLabel(imagen3);
       dig3.setBounds(20,700,200,200);
       Icon icono4 = new ImageIcon(imagen3.getImage() .getScaledInstance(dig3.getWidth(),dig3.getHeight(),Image.SCALE_DEFAULT));
       dig3.setIcon(icono4);
       miPanel.add(dig3);

       Font fuentetv3 = new Font("Times New Roman", Font.PLAIN, 20);
       digit3 = new JLabel("<html>Atmega 328p<html>");
       digit3.setBounds(230,610,600,200);
       digit3.setFont(fuentetv3);
       digit3.setForeground(Color.WHITE);
       miPanel.add(digit3);

       Font fuentedv3 = new Font("Times New Roman", Font.PLAIN, 20);
       digi3 = new JLabel("<html>El microcontrolador de alto rendimiento<p> Microchip picoPower de 8 bits basado en AVR<p> RISC combina una memoria Flash ISP<p> de 32 KB con capacidades de lectura y<p> escritura, EEPROM 1024B, SRAM de 2 KB, 23 <p>lineas de E/S de proposito general.<html>");
       digi3.setBounds(240,700,600,200);
       digi3.setFont(fuentedv3);
       digi3.setForeground(Color.WHITE);
       miPanel.add(digi3);

       Font fuentep1 = new Font("Times New Roman", Font.PLAIN, 20);
       p1 = new JLabel("110$");
       p1.setBounds(300,305,600,200);
       p1.setFont(fuentep1);
       p1.setForeground(Color.WHITE);
       miPanel.add(p1);

       Font fuentep2 = new Font("Times New Roman", Font.PLAIN, 20);
       p2 = new JLabel("200$");
       p2.setBounds(305,565,600,200);
       p2.setFont(fuentep1);
       p2.setForeground(Color.WHITE);
       miPanel.add(p2);

       Font fuentep3 = new Font("Times New Roman", Font.PLAIN, 20);
       p3 = new JLabel("40$");
       p3.setBounds(305,790,600,200);
       p3.setFont(fuentep2);
       p3.setForeground(Color.WHITE);
       miPanel.add(p3);

       carrito = new JButton("Carrito");
       carrito.setBounds(20,1050,120,20);
       carrito.setBackground(new Color(190,200,200));
       miPanel.add(carrito);

       agregar = new JButton("Agregar al carrito");
       agregar.setBounds(500,1050,150,20);
       agregar.setBackground(new Color(190,200,200));
       miPanel.add(agregar);

       scroll = new JScrollPane(miPanel);
       miPanel.setPreferredSize(new Dimension(600,1100));
       scroll.getVerticalScrollBar().setUnitIncrement(16);
       add(scroll);

       textArea = new JTextArea("");
       textArea.setBounds(160, 925, 300, 165);
       textArea.setEditable(false);
       miPanel.add(textArea);

       Font fuenteev = new Font("Times New Roman", Font.PLAIN, 20);
       eventor = new JLabel("");
       eventor.setBounds(470,950,210,100);
       eventor.setFont(fuenteev);
       eventor.setForeground(Color.WHITE);
       miPanel.add(eventor);

       agregar.addActionListener(this);
       miPanel.addMouseListener(this);
       carrito.addActionListener(this);
       digita2.addItemListener(this);
       digita3.addItemListener(this);
}

public void itemStateChanged(ItemEvent accion){
        
       String seleccion ="Digitales:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" +  "Arduino Uno:" + "\n" +
                 digita1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Arduino Mega:" + "\n" +
                 digita2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Atemega 328p" + "\n" + digita3.getSelectedItem().toString();

         num1 = Integer.parseInt((String) digita1.getSelectedItem());
         num2 = Integer.parseInt((String) digita2.getSelectedItem());
         num3 = Integer.parseInt((String) digita3.getSelectedItem());
        totalarticulos = num1+num2+num3;
        total = (num1*1100) + (num2*900) + (num3*750);
        String mostrar = Integer.toString(total);
        if(totalarticulos<=10){
           textArea.setText(seleccion);
        }
}
   
  public void actionPerformed(ActionEvent accion){
   if(accion.getSource() == carrito){
     try{
       Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/tiendae","root","");
         }catch (Exception e){}
     carrito  venc = new carrito();
     venc.setBounds(300,250,700,700);
     venc.setVisible(true);
     venc.setResizable(false);
   }
   if(accion.getSource() == agregar){
    if(totalarticulos<=10){
     String metodopago = "nulo";
     String articulos = "Digitales:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" +  "Arduino Uno:" + "\n" +
                 digita1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Arduino Mega:" + "\n" +
                 digita2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Atmega 328p" + "\n" + digita3.getSelectedItem().toString();
    try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/tiendae","root","");
      PreparedStatement pst = cn.prepareStatement("SELECT * FROM clientes");
      PreparedStatement query = cn.prepareStatement("INSERT INTO clientes(total,total_articulos,metodo_pago,articulos) VALUES(?, ?, ?, ?)");

 
      ResultSet rs = pst.executeQuery();
  
      while(rs.next()){
         prov = rs.getInt("total");
         prov2 = rs.getInt("total_articulos");
         pr = rs.getString("metodo_pago");
         pr2 = rs.getString("articulos");
      }
       prov = prov+total;
       prov2 = prov2+totalarticulos;
       pr = "nulo";
       pr2 = pr2+articulos;
       if(prov2<=10 && totalarticulos<=10){
       query.setInt(1, prov);
       query.setInt(2, prov2);
       query.setString(3, pr);
       query.setString(4, pr2);
       query.executeUpdate(); 
       }
    }catch (Exception e){}
    }else{
     eventor.setText("Solo puedes agregar 10");
     }
   }
}
public void mouseReleased(MouseEvent e){
     if(totalarticulos>10){
        eventor.setText("Solo puedes agregar 10");
     }else{
        eventor.setText("Agregado exitosamente");
      }
 }
public void mouseExited(MouseEvent e){
}
public void mouseEntered(MouseEvent e){
}
public void mousePressed(MouseEvent e){
}
public void mouseClicked(MouseEvent e){
}
    public static void main(String args[]){
      Digital ven = new Digital();
      ven.setBounds(300,250,700,700);
      ven.setVisible(true);
      ven.setResizable(false);
    }
}