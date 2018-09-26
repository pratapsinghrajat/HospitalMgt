import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class MyGridLayout implements ActionListener           
   {
        JFrame jf;
        JButton jb1,jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
	MyGridLayout()
	  {
                jf=new JFrame("HOME PAGE");
		GridLayout fl=new GridLayout(4,2,10,10);

		jf.setLayout(fl);
		jf.setLocation(400,200);
		jf.setSize(400,300);
                jf.getContentPane().setBackground(Color.GRAY);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jb1=new JButton("Add Doctor");
                jb1.setSize(100,100);
                jb2=new JButton("Add Staff");
                jb2.setSize(150,150);
		jb3=new JButton("Add Patient");
                jb3.setSize(150,150);
		jb4=new JButton("Remove Doctor");
                jb4.setSize(150,150);
		jb5=new JButton("Get Appointment");
                jb5.setSize(150,150);
		jb6=new JButton("Search");
                jb6.setSize(150,150);
		jb7=new JButton("About");
                jb7.setSize(150,150);
		jb8=new JButton("Logout");
                jb8.setSize(150,150);  
              
		jf.add(jb1);
		jf.add(jb2);
		jf.add(jb3);
		jf.add(jb4);
		jf.add(jb5);
		jf.add(jb6);
		jf.add(jb7);
		jf.add(jb8);

                jb1.addActionListener(this);
                jb2.addActionListener(this);
                jb3.addActionListener(this);
                jb4.addActionListener(this);
                jb5.addActionListener(this);
                jb6.addActionListener(this);
                jb7.addActionListener(this);
                jb8.addActionListener(this);
  

		jf.setVisible(true);
                 jf.setResizable(false);
	  }

       
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == jb5)
{
jf.setVisible(false);
new E();
}
else if(ae.getSource() == jb4)
{
jf.setVisible(false);
new D();
}
else if(ae.getSource() == jb1)
{
jf.setVisible(false);
new A();
}
else if(ae.getSource() == jb3)
{
jf.setVisible(false);
new C();
}
else if(ae.getSource() == jb2)
{
jf.setVisible(false);
new B();
}
else if(ae.getSource() == jb8)
{
 jf.setVisible(false);
 new card();
}
else if(ae.getSource() == jb7)
{
  jf.setVisible(false);
  new F();
}

else
{
jf.setVisible(false);
new H();
}

}
public static void main(String [] arg)
{
  new MyGridLayout();
}
}