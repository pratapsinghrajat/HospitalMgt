import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
class A  implements ActionListener
{
JFrame jf1;
JButton jb,jb1;
JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9;

A()
{
jf1=new JFrame("ADD DOCTOR");
jf1.getContentPane().setBackground(Color.CYAN);
jf1.setLocation(200,200);
jf1.setSize(500,500);
jf1.setBackground(Color.black);
jf1.setLayout(null);

 j1 = new JLabel("USER ID\n ",JLabel.CENTER );
j1.setForeground(Color.black);
j1.setOpaque(true);
j1.setBounds(140,150,100,20);

 j2 = new JLabel("User name",JLabel.CENTER);
j2.setForeground(Color.black);
j2.setOpaque(true);
j2.setBounds(140,180,100,20);

jt1 = new JTextField(10);
jt1.setText("000");
jt1.setOpaque(true);
jt1.setBounds(280,150,100,20);

jt2 = new JTextField(10);
jt2.setText("");
jt2.setOpaque(true);
jt2.setBounds(280,180,100,20);

j3 = new JLabel("Address\n  ",JLabel.CENTER);
j3.setForeground(Color.black);
j3.setOpaque(true);
j3.setBounds(140,210,100,20);

jt3 = new JTextField(10);
jt3.setText("");
jt3.setOpaque(true);
jt3.setBounds(280,210,100,20);

j4 = new JLabel("Phone no.",JLabel.CENTER);
j4.setForeground(Color.black);
j4.setOpaque(true);
j4.setBounds(140,240,100,20);

jt4= new JTextField(10);
jt4.setText("");
jt4.setOpaque(true);
jt4.setBounds(280,240,100,20);

j5 = new JLabel("Qualifications",JLabel.CENTER);
j5.setForeground(Color.black);
j5.setOpaque(true);
j5.setBounds(140,270,100,20);

 jt5= new JTextField(10);
jt5.setText("");
jt5.setOpaque(true);
jt5.setBounds(280,270,100,20);


j6 = new JLabel("Department",JLabel.CENTER);
j6.setForeground(Color.black);
j6.setOpaque(true);
j6.setBounds(140,300,100,20);

jt6= new JTextField(10);
jt6.setText("");
jt6.setOpaque(true);
jt6.setBounds(280,300,100,20);

 j7 = new JLabel("Fees(in Rupees)",JLabel.CENTER);
j7.setForeground(Color.black);
j7.setOpaque(true);
j7.setBounds(140,330,100,20);

 jt7= new JTextField(10);
jt7.setText("");
jt7.setOpaque(true);
jt7.setBounds(280,330,100,20);

j8 = new JLabel("Date OF Joining",JLabel.CENTER);
j8.setForeground(Color.black);
j8.setOpaque(true);
j8.setBounds(140,360,100,20);

jt8= new JTextField(10);
jt8.setText("");
jt8.setOpaque(true);
jt8.setBounds(280,360,100,20);


j9 = new JLabel("Cabin no.",JLabel.CENTER);
j9.setForeground(Color.black);
j9.setOpaque(true);
j9.setBounds(140,390,100,20);

 jt9= new JTextField(10);
jt9.setText("");
jt9.setOpaque(true);
jt9.setBounds(280,390,100,20);

j10=new JLabel("ADD DOCTOR HERE!!!", JLabel.CENTER);
Font f=new Font("Serif", Font.BOLD, 30);
j10.setFont(f);
j10.setBounds(100,50,350,30);
j10.setBackground(Color.GRAY);
j10.setOpaque(true);


 jb = new JButton("SUBMIT");
jb.setOpaque(true);
jb.setBounds(140,420,80,30);

JButton jb1 = new JButton("EXIT");
jb1.setOpaque(true);
jb1.setBounds(280,420,80,30);

jf1.add(j1);
jf1.add(j2);
jf1.add(j3);
jf1.add(j4);
jf1.add(j5);
jf1.add(j6);
jf1.add(j7);
jf1.add(j8);
jf1.add(j9);
jf1.add(j10);
jf1.add(jt1);
jf1.add(jt2);
jf1.add(jt3);
jf1.add(jt4);
jf1.add(jt5);
jf1.add(jt6);
jf1.add(jt7);
jf1.add(jt8);
jf1.add(jt9);
jf1.add(jb);
jf1.add(jb1);
jf1.setResizable(false);
jf1.setBackground(Color.CYAN);
jb.addActionListener(this);
jb1.addActionListener(this);
jf1.setVisible(true);
jf1.setResizable(false);
}


public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == jb)
{               
                 int a = Integer.parseInt(jt1.getText());
                 String s1= jt2.getText();String s2= jt3.getText();String s3= jt4.getText();
                 String s4= jt5.getText();String s5= jt6.getText();String s6= jt7.getText();
                 String s7= jt8.getText();String s8= jt9.getText();
                 if (s1.equals(null))
                    {JOptionPane.showMessageDialog(j1,"User_id is empty", "Error", JOptionPane.ERROR_MESSAGE);
                    }
               else
{
 try
                 {
   Class.forName("com.mysql.jdbc.Driver");
   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Hospital_Management" , "root", "Lucknow@11");
   Statement statement = connection.createStatement();
   statement.executeUpdate("insert into Add_Doctor(User_id,User_name, Address,phone_no,Qualifications,Department,Fees,Date_of_Joining,Cabin_no) values('"+a+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')");
   JOptionPane.showMessageDialog(jt1,jt2.getText()+"  is registered successfully");

   connection.close();
   //reset();
  }
 catch(Exception e)
 { 
   JOptionPane.showMessageDialog(jt2, "User Already Registered", "Error", JOptionPane.ERROR_MESSAGE);
 }}
               
}

else 
{
jf1.setVisible(false);
new MyGridLayout();
}
}

public static void main(String [] ar)
{
new A();
}
}