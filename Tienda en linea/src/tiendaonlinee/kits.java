import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class kits extends JFrame implements ItemListener, ActionListener, MouseListener{
    
    public JLabel etiqueta, portada, titulo,k1,k2,k3,ki1,ki2,ki3,kit2,kit3;
    public JLabel p1,p2,p3,eventor;
    public JScrollPane scroll;
    public JPanel miPanel;
    public JButton carrito,agregar;
    public JComboBox <String> kitt1;
    public JComboBox <String> kitt2;
    public JComboBox <String> kitt3;
    public String seleccion,pr,pr2;
    public JTextArea textArea;
    public int totalarticulos;
    public int total, prov, prov2,num1,num2,num3;
    public kits(){
       miPanel = new JPanel();
       miPanel.setLayout(null);
       setTitle("Kits");
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       miPanel.setBackground(new Color(0,0,0));

       kitt1 = new JComboBox<String>();
       kitt1.setBounds(240,220,60,30);
       miPanel.add(kitt1);
   
       kitt1.addItem("0");
       kitt1.addItem("1");
       kitt1.addItem("2");
       kitt1.addItem("3");
       kitt1.addItem("4");
       kitt1.addItem("5");
       kitt1.addItem("6");
       kitt1.addItem("7");
       kitt1.addItem("8");
       kitt1.addItem("9");
       kitt1.addItem("10");

       kitt1.addItemListener(this); 

       kitt2 = new JComboBox<String>();
       kitt2.setBounds(240,475,60,30);
       miPanel.add(kitt2);
   
       kitt2.addItem("0");
       kitt2.addItem("1");
       kitt2.addItem("2");
       kitt2.addItem("3");
       kitt2.addItem("4");
       kitt2.addItem("5");
       kitt2.addItem("6");
       kitt2.addItem("7");
       kitt2.addItem("8");
       kitt2.addItem("9");
       kitt2.addItem("10");

       kitt2.addItemListener(this);

       kitt3 = new JComboBox<String>();
       kitt3.setBounds(240,730,60,30);
       miPanel.add(kitt3);
   
       kitt3.addItem("0");
       kitt3.addItem("1");
       kitt3.addItem("2");
       kitt3.addItem("3");
       kitt3.addItem("4");
       kitt3.addItem("5");
       kitt3.addItem("6");
       kitt3.addItem("7");
       kitt3.addItem("8");
       kitt3.addItem("9");
       kitt3.addItem("10");


       kitt3.addItemListener(this);

       ImageIcon imagen = new ImageIcon("portadakits.jpg");
       portada = new JLabel(imagen);
       portada.setBounds(0,0,700,150);
       Icon icono = new ImageIcon(imagen.getImage() .getScaledInstance(portada.getWidth(),portada.getHeight(),Image.SCALE_DEFAULT));
       portada.setIcon(icono);
       miPanel.add(portada);

       Font fuentee = new Font("Times New Roman", Font.PLAIN, 20);
       etiqueta = new JLabel("<html>Kit carrito para armar<html>");
       etiqueta.setBounds(230,100,600,200);
       etiqueta.setFont(fuentee);
       etiqueta.setForeground(Color.WHITE);
       miPanel.add(etiqueta);

       ImageIcon imagen1 = new ImageIcon("kitcarrito.jpg");
       k1 = new JLabel(imagen1);
       k1.setBounds(20,200,200,200);
       Icon icono2 = new ImageIcon(imagen1.getImage() .getScaledInstance(k1.getWidth(),k1.getHeight(),Image.SCALE_DEFAULT));
       k1.setIcon(icono2);
       miPanel.add(k1);

       Font fuentetv2 = new Font("Times New Roman", Font.PLAIN, 20);
       kit2 = new JLabel("<html>Kit brazo mecanico para armar<html>");
       kit2.setBounds(230,360,600,200);
       kit2.setFont(fuentetv2);
       kit2.setForeground(Color.WHITE);
       miPanel.add(kit2);

       ImageIcon imagen2 = new ImageIcon("kitmano.jpg");
       k2 = new JLabel(imagen2);
       k2.setBounds(20,450,200,200);
       Icon icono3 = new ImageIcon(imagen2.getImage() .getScaledInstance(k2.getWidth(),k2.getHeight(),Image.SCALE_DEFAULT));
       k2.setIcon(icono3);
       miPanel.add(k2);

       ImageIcon imagen3 = new ImageIcon("kitrobot.jpg");
       k3 = new JLabel(imagen3);
       k3.setBounds(20,700,200,200);
       Icon icono4 = new ImageIcon(imagen3.getImage() .getScaledInstance(k3.getWidth(),k3.getHeight(),Image.SCALE_DEFAULT));
       k3.setIcon(icono4);
       miPanel.add(k3);

       Font fuentetv3 = new Font("Times New Roman", Font.PLAIN, 20);
       kit3 = new JLabel("<html>Kit robot para armar<html>");
       kit3.setBounds(230,610,600,200);
       kit3.setFont(fuentetv3);
       kit3.setForeground(Color.WHITE);
       miPanel.add(kit3);

       Font fuentep1 = new Font("Times New Roman", Font.PLAIN, 20);
       p1 = new JLabel("260$");
       p1.setBounds(310,135,600,200);
       p1.setFont(fuentep1);
       p1.setForeground(Color.WHITE);
       miPanel.add(p1);

       Font fuentep2 = new Font("Times New Roman", Font.PLAIN, 20);
       p2 = new JLabel("300$ c/u");
       p2.setBounds(310,390,600,200);
       p2.setFont(fuentep1);
       p2.setForeground(Color.WHITE);
       miPanel.add(p2);

       Font fuentep3 = new Font("Times New Roman", Font.PLAIN, 20);
       p3 = new JLabel("350$");
       p3.setBounds(310,645,600,200);
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
}

public void itemStateChanged(ItemEvent accion){

        String seleccion = "Kits:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" + "Kit carrito para armar:" + "\n" +
                 kitt1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Kit brazo mecanico para armar:" + "\n" +
                 kitt2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Kit robot para armar:" + "\n" + kitt3.getSelectedItem().toString() + "\n";

        num1 = Integer.parseInt((String) kitt1.getSelectedItem());
        num2 = Integer.parseInt((String) kitt2.getSelectedItem());
        num3 = Integer.parseInt((String) kitt3.getSelectedItem());
        totalarticulos = num1+num2+num3;
        total = (num1*60) + (num2*10) + (num3*80);
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
     carrito venc = new carrito();
     venc.setBounds(300,250,700,700);
     venc.setVisible(true);
     venc.setResizable(false);
   }
   if(accion.getSource() == agregar){
     if(totalarticulos<=10){ 
      String metodopago = "nulo";
      String articulos = "Kits:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" + "Kit carrito para armar:" + "\n" +
                 kitt1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Kit brazo mecanico para armar:" + "\n" +
                 kitt2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Kit robot para armar:" + "\n" + kitt3.getSelectedItem().toString() + "\n";

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
       pr2 = pr2 + articulos;
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
      kits ven = new kits();
      ven.setBounds(300,250,700,700);
      ven.setVisible(true);
      ven.setResizable(false);
    }
}