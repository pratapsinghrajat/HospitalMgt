import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
class D  implements ActionListener
{
JFrame jf1;
JPanel jp,jp2,jp3,jp6;
JButton jb1,jb2;
JLabel jl1,jl2;
JTextField jtf1,jtf2;

D()
{
jf1=new JFrame("REMOVE DOCTOR");
jf1.setSize(380,160);
jf1.setLocationRelativeTo(null);
//jf1.setBackground(Color.CYAN);

jp=new JPanel(new GridLayout(2,2));
jl1=new JLabel("Doctor Id");
jtf1=new JTextField(15);
jp2=new JPanel();
jp2.setBackground(Color.CYAN);
jp2.add(jtf1);
jp.add(jl1);
jp.add(jp2);

jl2=new JLabel("Doctor Name");
jtf2=new JTextField(15);
jp3=new JPanel();
jp3.setBackground(Color.CYAN);
jp3.add(jtf2);
jp.add(jl2);
jp.add(jp3);

 jb1=new JButton("REMOVE");
 jb2=new JButton("EXIT");
jb1.addActionListener(this);
jb2.addActionListener(this);
 jp6=new JPanel();
jp6.setBackground(Color.CYAN);
jp6.add(jb1);
jp6.add(jb2);


jp.setBackground(Color.CYAN);

jf1.add(jp, BorderLayout.CENTER);
jf1.add(jp6, BorderLayout.SOUTH);

jf1.setResizable(false);
jf1.setBackground(Color.CYAN);
jf1.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == jb1)
{
                 int a = Integer.parseInt(jtf1.getText());
                 String s1= jtf2.getText();
                try
                 {
   Class.forName("com.mysql.jdbc.Driver");
   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_Management" , "root", "ktdf");
   Statement statement = connection.createStatement();
   statement.executeUpdate("Delete from Add_Doctor where  User_id =("+a+")");
   JOptionPane.showMessageDialog(jtf1,jtf2.getText()+"  is Deleted successfully");
   connection.close();
   //reset();
  }
 catch(Exception e)
 { 
   JOptionPane.showMessageDialog(jtf2, "User Already Deleted or appointed", "Error", JOptionPane.ERROR_MESSAGE);
 }
               
}
else 
{
jf1.setVisible(false);
new MyGridLayout();
}
}





public static void main(String [] ar)
{
new D();
}
}