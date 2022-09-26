import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Analogica extends JFrame implements ItemListener, ActionListener, MouseListener{
    
    public JLabel etiqueta, portada, titulo,anal1,anal2,anal3,anal4,analo1,analo2,analo3,analo4;
    public JLabel p1,p2,p3,p4,eventor;
    public JScrollPane scroll;
    public JPanel miPanel;
    public JButton carrito,agregar;
    public JComboBox <String> analog1;
    public JComboBox <String> analog2;
    public JComboBox <String> analog3;
    public JComboBox <String> analog4;
    public String seleccion, pr,pr2;
    public JTextArea textArea;
    public int totalarticulos;
    public int total, prov, prov2,num1,num2,num3,num4;
    public Analogica(){
       miPanel = new JPanel();
       miPanel.setLayout(null);
       setTitle("Analogica");
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       miPanel.setBackground(new Color(0,0,255));

       Font fuentet = new Font("Edwardian Script ITC", Font.PLAIN, 60);
       titulo = new JLabel("Analogica");
       titulo.setBounds(220,50,350,80);
       titulo.setFont(fuentet);
       titulo.setForeground(Color.WHITE);
       miPanel.add(titulo);

       analog1 = new JComboBox<String>();
       analog1.setBounds(240,220,60,30);
       miPanel.add(analog1);
   
       analog1.addItem("0");
       analog1.addItem("1");
       analog1.addItem("2");
       analog1.addItem("3");
       analog1.addItem("4");
       analog1.addItem("5");
       analog1.addItem("6");
       analog1.addItem("7");
       analog1.addItem("8");
       analog1.addItem("9");
       analog1.addItem("10");

       analog1.addItemListener(this); 

       analog2 = new JComboBox<String>();
       analog2.setBounds(240,475,60,30);
       miPanel.add(analog2);
   
       analog2.addItem("0");
       analog2.addItem("1");
       analog2.addItem("2");
       analog2.addItem("3");
       analog2.addItem("4");
       analog2.addItem("5");
       analog2.addItem("6");
       analog2.addItem("7");
       analog2.addItem("8");
       analog2.addItem("9");
       analog2.addItem("10");

       analog2.addItemListener(this);

       analog3 = new JComboBox<String>();
       analog3.setBounds(240,730,60,30);
       miPanel.add(analog3);
   
       analog3.addItem("0");
       analog3.addItem("1");
       analog3.addItem("2");
       analog3.addItem("3");
       analog3.addItem("4");
       analog3.addItem("5");
       analog3.addItem("6");
       analog3.addItem("7");
       analog3.addItem("8");
       analog3.addItem("9");
       analog3.addItem("10");

       analog3.addItemListener(this);


       analog4 = new JComboBox<String>();
       analog4.setBounds(240,995,60,30);
       miPanel.add(analog4);
   
       analog4.addItem("0");
       analog4.addItem("1");
       analog4.addItem("2");
       analog4.addItem("3");
       analog4.addItem("4");
       analog4.addItem("5");
       analog4.addItem("6");
       analog4.addItem("7");
       analog4.addItem("8");
       analog4.addItem("9");
       analog4.addItem("10");

       analog4.addItemListener(this);


       ImageIcon imagen = new ImageIcon("analogica.jpg");
       portada = new JLabel(imagen);
       portada.setBounds(0,0,700,150);
       Icon icono = new ImageIcon(imagen.getImage() .getScaledInstance(portada.getWidth(),portada.getHeight(),Image.SCALE_DEFAULT));
       portada.setIcon(icono);
       miPanel.add(portada);

       Font fuentee = new Font("Times New Roman", Font.PLAIN, 20);
       etiqueta = new JLabel("<html>Resistencia<html>");
       etiqueta.setBounds(230,100,600,200);
       etiqueta.setFont(fuentee);
       etiqueta.setForeground(Color.WHITE);
       miPanel.add(etiqueta);

       ImageIcon imagen1 = new ImageIcon("res.jpg");
       anal1 = new JLabel(imagen1);
       anal1.setBounds(20,200,200,200);
       Icon icono2 = new ImageIcon(imagen1.getImage() .getScaledInstance(anal1.getWidth(),anal1.getHeight(),Image.SCALE_DEFAULT));
       anal1.setIcon(icono2);
       miPanel.add(anal1);

       Font fuentetv2 = new Font("Times New Roman", Font.PLAIN, 20);
       analo2 = new JLabel("<html>Capacitor<html>");
       analo2.setBounds(230,360,600,200);
       analo2.setFont(fuentetv2);
       analo2.setForeground(Color.WHITE);
       miPanel.add(analo2);

       ImageIcon imagen2 = new ImageIcon("cap.jpg");
       anal2 = new JLabel(imagen2);
       anal2.setBounds(20,450,200,200);
       Icon icono3 = new ImageIcon(imagen2.getImage() .getScaledInstance(anal2.getWidth(),anal2.getHeight(),Image.SCALE_DEFAULT));
       anal2.setIcon(icono3);
       miPanel.add(anal2);

       ImageIcon imagen3 = new ImageIcon("rel.jpg");
       anal3 = new JLabel(imagen3);
       anal3.setBounds(20,710,200,200);
       Icon icono4 = new ImageIcon(imagen3.getImage() .getScaledInstance(anal3.getWidth(),anal3.getHeight(),Image.SCALE_DEFAULT));
       anal3.setIcon(icono4);
       miPanel.add(anal3);

       ImageIcon imagen4 = new ImageIcon("cai.jpg");
       anal4 = new JLabel(imagen4);
       anal4.setBounds(20,970,200,200);
       Icon icono5 = new ImageIcon(imagen4.getImage() .getScaledInstance(anal4.getWidth(),anal4.getHeight(),Image.SCALE_DEFAULT));
       anal4.setIcon(icono5);
       miPanel.add(anal4);

       Font fuentetv3 = new Font("Times New Roman", Font.PLAIN, 20);
       analo3 = new JLabel("<html>Kit caimanes<html>");
       analo3.setBounds(230,880,600,200);
       analo3.setFont(fuentetv3);
       analo3.setForeground(Color.WHITE);
       miPanel.add(analo3);

       Font fuentetv4 = new Font("Times New Roman", Font.PLAIN, 20);
       analo4 = new JLabel("<html>Reley<html>");
       analo4.setBounds(230,615,600,200);
       analo4.setFont(fuentetv4);
       analo4.setForeground(Color.WHITE);
       miPanel.add(analo4);

       Font fuentep1 = new Font("Times New Roman", Font.PLAIN, 20);
       p1 = new JLabel("1$");
       p1.setBounds(310,135,600,200);
       p1.setFont(fuentep1);
       p1.setForeground(Color.WHITE);
       miPanel.add(p1);

       Font fuentep2 = new Font("Times New Roman", Font.PLAIN, 20);
       p2 = new JLabel("5$");
       p2.setBounds(310,390,600,200);
       p2.setFont(fuentep1);
       p2.setForeground(Color.WHITE);
       miPanel.add(p2);

       Font fuentep3 = new Font("Times New Roman", Font.PLAIN, 20);
       p3 = new JLabel("7$");
       p3.setBounds(310,645,600,200);
       p3.setFont(fuentep2);
       p3.setForeground(Color.WHITE);
       miPanel.add(p3);

       Font fuentep4 = new Font("Times New Roman", Font.PLAIN, 20);
       p4 = new JLabel("20$");
       p4.setBounds(310,910,600,200);
       p4.setFont(fuentep4);
       p4.setForeground(Color.WHITE);
       miPanel.add(p4);

       carrito = new JButton("Carrito");
       carrito.setBounds(20,1460,120,20);
       carrito.setBackground(new Color(190,200,200));
       miPanel.add(carrito);

       agregar = new JButton("Agregar al carrito");
       agregar.setBounds(500,1460,150,20);
       agregar.setBackground(new Color(190,200,200));
       miPanel.add(agregar);

       scroll = new JScrollPane(miPanel);
       miPanel.setPreferredSize(new Dimension(600,1500));
       scroll.getVerticalScrollBar().setUnitIncrement(16);
       add(scroll);

       textArea = new JTextArea("");
       textArea.setBounds(160, 1240, 300, 230);
       textArea.setEditable(false);
       miPanel.add(textArea);

       Font fuenteev = new Font("Times New Roman", Font.PLAIN, 20);
       eventor = new JLabel("");
       eventor.setBounds(470,1300,210,100);
       eventor.setFont(fuenteev);
       eventor.setForeground(Color.WHITE);
       miPanel.add(eventor);

       agregar.addActionListener(this);
       miPanel.addMouseListener(this);
       carrito.addActionListener(this);
}

public void itemStateChanged(ItemEvent accion){
        
        String seleccion = "Analogos:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" + "Resistencia" + "\n" +
                 analog1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Capacitor" + "\n" +
                 analog2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Reley" + "\n" + 
                 analog3.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" + "\n" +
                 "Kit caimanes" + "\n" + analog4.getSelectedItem().toString();

         num1 = Integer.parseInt((String) analog1.getSelectedItem());
         num2 = Integer.parseInt((String) analog2.getSelectedItem());
         num3 = Integer.parseInt((String) analog3.getSelectedItem());
         num4 = Integer.parseInt((String) analog4.getSelectedItem());
        totalarticulos = num1+num2+num3+num4;
         total = (num1*1) + (num2*5) + (num3*7) + (num4*20);
        String mostrar = Integer.toString(total);
        if(totalarticulos<=10){
           textArea.setText(seleccion);
        }
}
   
  public void actionPerformed(ActionEvent accion){
   if(accion.getSource() == carrito){
     try{
     Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/tiendae","root","");
     }catch(Exception e){}
     carrito  ven = new carrito();
      ven.setBounds(300,250,700,700);
      ven.setVisible(true);
      ven.setResizable(false);
   }
   if(accion.getSource() == agregar){
     if(totalarticulos<=10){
     String metodopago = "nulo";
     String articulos ="Analogos:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" + "Resistencia" + "\n" +
                 analog1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Capacitor" + "\n" +
                 analog2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Reley" + "\n" + 
                 analog3.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" + "\n" +
                 "Kit caimanes" + "\n" + analog4.getSelectedItem().toString() + "\n";

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
      Analogica ven = new Analogica();
      ven.setBounds(300,250,700,700);
      ven.setVisible(true);
      ven.setResizable(false);
    }
}