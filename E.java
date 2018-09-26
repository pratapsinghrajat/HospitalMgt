import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
class E implements ActionListener
{
JFrame jf1;
JPanel jp,jp2,jp3,jp4,jp5;
JButton jb1,jb2;
JLabel jl1,jl2,jl3,jl4;
JTextField jtf1,jtf2,jtf3,jtf4;
E()
{
 jf1=new JFrame("Appointment Registation");
jf1.setSize(380,260);
jf1.setLocationRelativeTo(null);
//jf1.setBackground(Color.CYAN);

jp=new JPanel(new GridLayout(5,2));
jl1=new JLabel("Doctor Id");
 jtf1=new JTextField(15);
jp2=new JPanel();
jp2.setBackground(Color.CYAN);
jp2.add(jtf1);
jp.add(jl1);
jp.add(jp2);
jl2=new JLabel("Patient Name");
 jtf2=new JTextField(15);
JPanel jp3=new JPanel();
jp3.setBackground(Color.CYAN);
jp3.add(jtf2);
jp.add(jl2);
jp.add(jp3);
jl3=new JLabel("Doctor Department");
jtf3=new JTextField(15);
jp4=new JPanel();
jp4.setBackground(Color.CYAN);
jp4.add(jtf3);
jp.add(jl3);

jp.add(jp4);


 jl4=new JLabel("Date & Time");
jtf4=new JTextField(15);
 jp5=new JPanel();
jp5.setBackground(Color.CYAN);
jp5.add(jtf4);
jp.add(jl4);
jp.add(jp5); 

/*JLabel jl5=new JLabel("Time");
jtf5=new JTextField(15);
 j7=new JPanel();
jp5.setBackground(Color.CYAN);
jp5.add(jtf5);
jp.add(jl5);
jp.add(jp5);*/

 jb1=new JButton("SUBMIT");
 jb2=new JButton("EXIT");
jb1.addActionListener(this);
jb2.addActionListener(this);
JPanel jp6=new JPanel();
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
{                int a = Integer.parseInt(jtf1.getText());
                 String s1= jtf2.getText();
                 String s2= jtf3.getText(); 
                 String s3= jtf4.getText();
                 
                try
                 {
   Class.forName("com.mysql.jdbc.Driver");
   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Hospital_Management" , "root", "Lucknow@11");
   Statement statement = connection.createStatement();
   statement.executeUpdate("insert into Appointment_Registration(User_id,Patient_name, Doctor_department,Date_And_Time) values("+a+",'"+s1+"','"+s2+"','"+s3+"')");
   JOptionPane.showMessageDialog(jtf1,jtf2.getText()+"  is registered successfully");

   connection.close();
   //reset();
  }
 catch(Exception e)
 { 
   JOptionPane.showMessageDialog(jtf1, "Please check Doctor id", "Error", JOptionPane.ERROR_MESSAGE);
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
new E();
}
}