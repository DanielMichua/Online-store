import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class carrito extends JFrame implements  ActionListener, ChangeListener{
    public JLabel etiqueta1;
    public JLabel etiqueta2;
    public JLabel etiqueta3;
    public JLabel etiqueta4,agregado;
    public JRadioButton radio1,radio2,radio3,radio4;
    public JScrollPane scroll;
    public JPanel miPanel;
    public ButtonGroup grupoOpciones;
    public JButton botonIngresar;
    public JTextArea textArea;
    public String meto, pr, pr2, mostrar;
    public int total, totalarticulos, prov, prov2;
    public carrito(){

       miPanel = new JPanel();
       miPanel.setLayout(null);
       setTitle("Carrito");
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       

       grupoOpciones = new ButtonGroup();
 

       Font fuentet = new Font("Times New Roman", Font.PLAIN, 30);
       etiqueta1 = new JLabel("Carrito");
       etiqueta1.setBounds(150,15,350,80);
       etiqueta1.setFont(fuentet);
       etiqueta1.setForeground(Color.BLACK);
       miPanel.add(etiqueta1);

        
       Font fuentee = new Font("Times New Roman", Font.PLAIN, 25);
       etiqueta2 = new JLabel("Metodo de pago");
       etiqueta2.setBounds(50,10,600,200);
       etiqueta2.setFont(fuentee);
       etiqueta2.setForeground(Color.BLACK);
       miPanel.add(etiqueta2);
       
       radio1 = new JRadioButton("Tarjeta de credito/debito");
       radio1.setBounds(45,130,190,15);
       miPanel.add(radio1);
       grupoOpciones.add(radio1);

       radio2 = new JRadioButton("Efectivo");
       radio2.setBounds(45,150,100,15);
       miPanel.add(radio2);
       grupoOpciones.add(radio2);

       radio3 = new JRadioButton("Oxxo");
       radio3.setBounds(45,170,100,15);
       miPanel.add(radio3);
       grupoOpciones.add(radio3);

       radio4 = new JRadioButton("7-Eleven");
       radio4.setBounds(45,190,100,15);
       miPanel.add(radio4);
       grupoOpciones.add(radio4);
       
       textArea = new JTextArea("");
       textArea.setBounds(400, 25, 260, 750);
       textArea.setEditable(false);
       miPanel.add(textArea);

       Font agre = new Font("Times New Roman", Font.PLAIN,20);
       agregado = new JLabel("");
       agregado.setBounds(160,250,100,25);
       agregado.setFont(agre);
       agregado.setForeground(Color.BLACK);
       miPanel.add(agregado);

       scroll = new JScrollPane(miPanel);
       miPanel.setPreferredSize(new Dimension(600,800));
       scroll.getVerticalScrollBar().setUnitIncrement(16);
       add(scroll);
       
       botonIngresar = new JButton("Confirmar Pedido");
       botonIngresar.setBounds(50, 215, 315, 20);
       miPanel.add(botonIngresar);

       radio1.addChangeListener(this);
       radio2.addChangeListener(this);
       radio3.addChangeListener(this);
       radio4.addChangeListener(this);
       botonIngresar.addActionListener(this);
    }

public void stateChanged(ChangeEvent accion){
   
   if(radio1.isSelected() == true){
     agregado.setText("Tarjeta");
     meto = "Tarjeta";
   }
   if(radio2.isSelected() == true){
     agregado.setText("Efectivo");
     meto = "Efectivo";
   }
   if(radio3.isSelected() == true){
     agregado.setText("Oxxo");
     meto = "Oxoo";
   }
   if(radio4.isSelected() == true){
     agregado.setText("7-Eleven");
     meto = "7-Eleven";
   }
}

public void actionPerformed(ActionEvent accion){
      if(accion.getSource() == botonIngresar){       
         try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/tiendae","root","");
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM clientes");
            PreparedStatement query = cn.prepareStatement("INSERT INTO clientes(total,total_articulos,metodo_pago,articulos) VALUES(?, ?, ?, ?)");

            ResultSet rs = pst.executeQuery("SELECT * FROM clientes");                                        
              do{             
               if(rs.next()){
                  prov = rs.getInt("total");
                  prov2 = rs.getInt("total_articulos");
                  pr = rs.getString("metodo_pago");
                  pr2 = rs.getString("articulos");
               }
             }while(rs.next());

            total = prov;
            String total1 = Integer.toString(total);              

            totalarticulos = prov2;
            String total2 = Integer.toString(totalarticulos);                              

            pr = meto;
            String articulos = pr2;
            mostrar = "Articulos:" + "\n" + "\n" + articulos + "\n" + "Metodo de Pago:" + "\n" + pr + "\n" + "\n" + "Total de articulos:" + "\n" + total2 + "\n" + "\n" +  "Total a pagar:" + "\n" + total1 + "$";  
            textArea.setText(mostrar);
            query.setInt(1, prov);
            query.setInt(2, prov2);
            query.setString(3, pr);
            query.setString(4, pr2);
            query.executeUpdate();
    }catch (Exception e){}
    }
}
    public static void main(String args[]){
      carrito ven = new carrito();
      ven.setBounds(300,250,700,700);
      ven.setVisible(true);
      ven.setResizable(false);
    }
}