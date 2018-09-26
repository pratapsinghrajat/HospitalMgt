import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class F implements ActionListener
{
JFrame jf1;
JButton jb1;
JLabel j3,j4,j7,j8;
F()
{
 jf1 = new JFrame("ABOUT US");
  jf1.setSize(550,400);
  jf1.getContentPane().setBackground(Color.GRAY);
  jf1.setLocation(200,200);
  jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  jf1.setLayout(null);
  j3 = new JLabel(); 
  j3.setText("ABOUT HOSPITAL MANAGEMENT SYSTEM:");
  j3.setForeground(Color.BLACK);
  j3.setBounds(20,20,300,80);      

  
  j4 = new JLabel(); 
  j4.setText("This Hospital Management System has been developed With an Aim to");
  j4.setForeground(Color.BLACK);
  j4.setBounds(60,100,400,40);
   
   
   j7 = new JLabel();
    j7.setText("  help the Hospital Management Department to handle the records easily ");
   j7.setForeground(Color.BLACK);
   j7.setBounds(60,130,420,40);
   
  j8 = new JLabel();
    j8.setText("PROJECT DEVELOPER -- Rajat Pratap Singh -- Utkarsh Gupta");
   j8.setForeground(Color.CYAN);
   j8.setBounds(100,200,400,40);

    jb1= new JButton("BACK TO HOME PAGE");
    jb1.setBounds(150,300,160,30);
    jb1.addActionListener(this);
    jf1.add(j3);
    jf1.add(j4);
    jf1.add(j7);
    jf1.add(j8);
    jf1.add(jb1);
    jf1.setVisible(true);
jf1.setResizable(false);

}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == jb1)
{
jf1.setVisible(false);
new MyGridLayout();
}
else 
{

}
}



public static void main(String [] ar)
{
new F();
}
}