import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class loginpage implements ActionListener
{

JFrame jf;
JTextField jt;
JLabel j1,j2,j3,j4,j5,j6;
JPasswordField jpf;
JButton jb,jb1;
ImageIcon ii;

loginpage()
{
jf =new JFrame("HOSPITAL MANAGEMENT SYSTEM");
jf.setBounds(400,400,500,500);
jf.setLocationRelativeTo(null);
jf.getContentPane().setBackground(Color.brown);
jf.setLayout(null);

j3 = new JLabel("HOSPITAL MANAGEMENT SYSTEM",JLabel.CENTER);
j3.setForeground(Color.blue);
//j4.setBackground(Color.white);
j3.setOpaque(true);
j3.setBounds(140,50,200,20);


 ii =new ImageIcon("21vansanten-krentlerhospital-healthcare-asc-1.jpg");
 j6= new JLabel(ii);
j6.setSize(500,500);
jf.setIconImage(ii.getImage());

j4 = new JLabel("Please Enter The Password :--",JLabel.CENTER);
j4.setForeground(Color.black);
//j4.setBackground(Color.);
j4.setOpaque(true);
j4.setBounds(140,100,200,20);

j5 = new JLabel(" Under The Guidance Of Arvind  Sir:--",JLabel.CENTER);
j5.setForeground(Color.black);
//j4.setBackground(Color.);
j5.setOpaque(true);
j5.setBounds(120,420,300,20);

j1 = new JLabel("USERNAME\n  ",JLabel.CENTER);
j1.setForeground(Color.black);
j1.setOpaque(true);
j1.setBounds(140,150,100,20);

j2 = new JLabel("PASSWORD",JLabel.CENTER);
j2.setForeground(Color.black);
j2.setOpaque(true);
j2.setBounds(140,180,100,20);

jt = new JTextField(10);
jt.setText("");
jt.setOpaque(true);
jt.setBounds(280,150,100,20);

jpf=new JPasswordField(15);
jpf.setBounds(280,180,100,20);


jb = new JButton("LOGIN");
jb.setOpaque(true);
jb.setBounds(150,230,80,30);

jb1 = new JButton("EXIT");
jb1.setOpaque(true);
jb1.setBounds(280,230,80,30);

//ButtonGroup bg=new ButtonGroup();

jf.add(j1);
jf.add(j2);
jf.add(j3);
jf.add(j4);
jf.add(j5);
jf.add(j6);
jf.add(jt);
jf.add(jpf);
jf.add(jb);
jf.add(jb1);


jf.setVisible(true);

jpf.addActionListener(this);   
jt.addActionListener(this);             //registering source with listener
jb.addActionListener(this); 

jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//use to close
JPanel jp = new JPanel();
jp.setBackground(Color.pink);
//jp.add(j1);
//jp.add(j2);


jf.add(jp,BorderLayout.NORTH);





JPanel jp1= new JPanel();
jf.add(jp1,BorderLayout.SOUTH);

jf.setVisible(true);//use to display

}

public static void main(String [] ar)
{
new loginpage();
}

public void actionPerformed(ActionEvent ae)
{
    String username=jt.getText();
        String password=new String(jpf.getPassword());
        if(username.equalsIgnoreCase("rajat")&&password.equals("rajat123"))
       {
            JOptionPane.showMessageDialog(null,"Congratulations!! You are successfully logged in." + "\n" + "\n" +  "Welcome to Hospital Management System."+"\n"+"Please click OK to proceed."," Result ",JOptionPane.NO_OPTION);
            //new main().setVisible(true);
            //dispose();
         } 
            else
       {
            JOptionPane.showMessageDialog(null," Either username or password is incorrect! Sorry, please try again. "," Result ",JOptionPane.ERROR_MESSAGE);
            jt.setText(null);
            jpf.setText(null);
       }
}
}    

                   