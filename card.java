import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

class card  implements ActionListener
{

JFrame jf;
JLabel j1, j2, j3, j4,j6,j7,j8;
JTextField jtf1;
JButton jb1,jb2,jb3,jb4;
JPasswordField jpf1;
CardLayout cl;
JPanel jp1,jp2,jp3,jp4,jp,jp5,jp6;
ImageIcon ii;

   card()
  {
  
  jf = new JFrame("Hospital Management");

  jf.setSize(530,415);
  
  jf.setLocationRelativeTo(null);
   
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
  


  jp1 = new JPanel();
   
  jb1 = new JButton("LOGIN");
  jb2 = new JButton("ABOUT US");

  jp1.add(jb1);
  jp1.add(jb2);
  
  ii =new ImageIcon("21vansanten-krentlerhospital-healthcare-asc-1.jpg");
  j6  = new JLabel(ii);
  j6.setSize(600,400);
  
  jf.add(j6,BorderLayout.CENTER);
 
   j7 = new JLabel("Under The Guidance Of Arvind Sir:-");
   jp5 = new JPanel();
   jp5.add(j7);
   jf.add(jp5,BorderLayout.SOUTH);
   


  jp2 = new JPanel();
  jp2.setLayout(null);
  //jp2.setBackground(Color.YELLOW);


  j1 = new JLabel("Name:"); 
  j1.setForeground(Color.ORANGE);
  j1.setBounds(100,100,70,20);      

 

  j2 = new JLabel("Password:"); 
  j2.setForeground(Color.ORANGE);
  j2.setBounds(100,130,70,20);
  
  jp2.add(j1);
  jp2.add(j2);
 

   jtf1 = new JTextField();
   jtf1.setBounds(180,100,80,20);

   jpf1 = new JPasswordField();
   jpf1.setBounds(180,130,80,20);

   jp2.add(jtf1);
   jp2.add(jpf1);

   jb3 = new JButton("SUBMIT");
   jb3.setBounds(160,200,80,50);

   jp2.add(jb3);
   

  jp3 = new JPanel();
  jp3.setLayout(null);
  jp3.setBackground(Color.GRAY);

  j3 = new JLabel("ABOUT HOSPITAL MANAGEMENT SYSTEM:"); 
  j3.setForeground(Color.BLACK);
  j3.setBounds(20,20,300,80);      

  
  j4 = new JLabel("This Hospital Management System has been developed With an Aim to"); 
  j4.setForeground(Color.BLACK);
  j4.setBounds(60,100,400,40);
   
   
   j7 = new JLabel("  help the Hospital Management Department to handle the records easily ");
   j7.setForeground(Color.BLACK);
   j7.setBounds(60,130,420,40);
   
   
   
   
   j8 = new JLabel("PROJECT DEVELOPER -- Rajat Pratap Singh -- Utkarsh Gupta");
   j8.setForeground(Color.CYAN);
   j8.setBounds(100,200,400,40);
  /* jb4 = new JButton("SUBMIT");
   jb4.setBounds(100,200,80,50);*/

   jp3.add(j3);
   jp3.add(j4);
    
   jp3.add(j7);
    
   jp3.add(j8);
   //jp3.add(jb4);
   jp = new JPanel();
   cl = new CardLayout();
   jp.setLayout(cl);
      
   
    jf.add(jp1,BorderLayout.NORTH);
    
    
    jp4 = new JPanel();
 

    jp.add(jp4,"card1");
    jp.add(jp2,"card2");
    jp.add(jp3,"card3");

     jf.add(jp);
 
   
   jb1.addActionListener(this);
   jb2.addActionListener(this);
   jb3.addActionListener(this);

   
   jf.setVisible(true);
   jf.setResizable(false);
 
}
  

  public void actionPerformed(ActionEvent ae)
  {  
    if(ae.getSource()== jb1)
    {
      cl.show(jp,"card2");
    }
     else if(ae.getSource()== jb3)
        {
         jf.setVisible(false);
         
         String Name=jtf1.getText();
        String Password=new String(jpf1.getPassword());
        if(Name.equalsIgnoreCase("Om")&&Password.equals("123"))
       {
            JOptionPane.showMessageDialog(null,"Congratulations!! You are successfully logged in." + "\n" + "\n" + 
             "Welcome to Hospital Management System."+"\n"+"Please click OK to proceed."," Result ",JOptionPane.NO_OPTION);
            new MyGridLayout();
            
         } 
            else
       {
            JOptionPane.showMessageDialog(null," Either username or password is incorrect! Sorry, please try again. ",
              " Result ",
              JOptionPane.ERROR_MESSAGE);
            jtf1.setText(null);
            jpf1.setText(null);
       }
       }
   else  
    {
     cl.show(jp,"card3");
    }
  
  }

   
public static void main(String [] ar)
  {
     new card();
  }
}



