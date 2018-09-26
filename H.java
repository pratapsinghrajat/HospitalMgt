import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
class H implements ActionListener,ItemListener
   {    
        JPanel jp;
        JFrame jf;
        JLabel jl1,jl15;
        JRadioButton jrb1,jrb2,jrb3,jrb4;
        JTextField jtf1;
        JCheckBox jcb1,jcb2,jcb3;
	JButton jb,jb1;
        JTextArea jta;
	H()
	  {
                jf=new JFrame();
		jf.setLocation(200,200);
		jf.setSize(700,400);
                jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jl1=new JLabel("Enter Id Here");
                jl1.setBounds(20,50,100,100);

                jl15=new JLabel("Search Criterion");
                jp=new JPanel();
                jp.add(jl15);
                jp.setBounds(250,300,100,100);

                 jtf1=new JTextField();
                 jtf1.setText("000");
                 jtf1.setBounds(140,90,80,20);
                 jtf1.setEnabled(false);

                 jrb1=new JRadioButton("Search Doctor");
                 jrb1.setBounds(25,10,150,80);
                
		 jrb2=new JRadioButton("Search Staff");
                 jrb2.setBounds(200,10,150,80);

		 jrb3=new JRadioButton("Search Patient");
                 jrb3.setBounds(350,10,150,80);
                  
                 jrb4=new JRadioButton("Select to Exit");
		 jrb4.setBounds(300,300,110,40);	

		 ButtonGroup group = new ButtonGroup();
		 group.add(jrb1);
		 group.add(jrb2);
		 group.add(jrb3);
                 group.add(jrb4);
                  
                 jb=new JButton("Search In DataBase");
		 jb.setBounds(520,30,160,40);	
                
                 
                 jta = new JTextArea(" ");
                 jta.setBounds(20,150,640,140);

		jb.addActionListener(this);
                jrb4.addActionListener(this);  
                jrb1.addItemListener(this);
                jrb2.addItemListener(this);
                jrb3.addItemListener(this);
                jrb1.addActionListener(this);
                jrb2.addActionListener(this);  
                jrb3.addActionListener(this);  


		jf.add(jrb1);
                jf.add(jrb2);
                jf.add(jrb3);jf.add(jrb4);
                jf.add(jtf1);
		
		jf.add(jb);
                jf.add(jl15);
                jf.add(jl1);
                jf.add(jp);
                jf.add(jta);
		jf.setVisible(true);
                jf.setResizable(false);
	  }
    
                  public void itemStateChanged(ItemEvent ie)
                       {
                            if(jrb3.isSelected())
                             {
                                    jl1.setText("Enter Patient ID"); 
                                    jtf1.setEnabled(true);
   
                             }

                             else if(jrb2.isSelected())
                             {       
                                jl1.setText("Enter Staff ID");    
                                 jtf1.setEnabled(true);

                             }
                            
                             else 
                               {
                                 jl1.setText("Enter Doctor ID");
                                  jtf1.setEnabled(true);

                               }
                        }
      
             public void actionPerformed(ActionEvent ae) 
             {
              if(jrb1.isSelected() )
               {
                getdata();
               }
               else if(jrb3.isSelected() )
               {
               getdata1();
                }
               else if(jrb2.isSelected() )
               {
               getdata2();
 
               }  
                else if(jrb4.isSelected() )
               {
                 jf.setVisible(false);
                 new MyGridLayout(); 
               }  
               
               else 
               {
                 jf.setVisible(false);
                 new MyGridLayout(); 
               }

              }




                                          void getdata()
                           {
                             
                          int a = Integer.parseInt(jtf1.getText());

                               try
                                 {
                                     Class.forName("com.mysql.jdbc.Driver");
                                     Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Hospital_Management" , "root", "Lucknow@11");
                                     Statement statement = connection.createStatement();
                                     ResultSet rs = statement.executeQuery("select User_name,phone_no,Cabin_no from Add_Doctor where  User_id =("+a+")");
                                     while(rs.next())
                                     jta.setText(" USERNAME"+"   "+rs.getString("User_name")+"   " +"  " +"PHONE NO"+"   "+rs.getString("phone_no")+"   "+ "   "+"CABIN NO"+"    " +rs.getString("Cabin_no"));
                                     connection.close();
                                 }
                                 catch(Exception e)
                                { 
                                JOptionPane.showMessageDialog(jtf1, "User NOT FOUND", "Error", JOptionPane.ERROR_MESSAGE);
                                }

                             } 

                                    void getdata1()
                                                   {
                                                                             
                                                             int a = Integer.parseInt(jtf1.getText());
                                try
                                 {
                                  Class.forName("com.mysql.jdbc.Driver");
                                  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Hospital_Management" , "root", "Lucknow@11");
                                Statement statement = connection.createStatement();
                               ResultSet rs = statement.executeQuery("select Patient_name,Room_no,Bed_no from Add_Patient where Patient_id =("+a+")");
                                while(rs.next())
                                 jta.setText(" Patient_name"+"   "+rs.getString("Patient_name")+"   " +"  " +"Room_no"+"   "+rs.getString("Room_no")+"   "+ "   "+"Bed_no"+"    " +rs.getString("Bed_no"));
                              connection.close(); }
                                catch(Exception e)
                               { 
                              JOptionPane.showMessageDialog(jtf1, "User NOT FOUND", "Error", JOptionPane.ERROR_MESSAGE);
                                  }

                          }  


                                            void getdata2()
                                         {                   

                                         int a = Integer.parseInt(jtf1.getText());
                try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Hospital_Management" , "root", "Lucknow@11");
                    Statement statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery("select User_name,Department,Salary from Add_Staff where  User_id =("+a+")");
                    while(rs.next())
                   jta.setText(" USERNAME"+"   "+rs.getString("User_name")+"   " +"  " +"Department"+"   "+rs.getString("Department")+"   "+ "   "+"Slary"+"    " +rs.getString("Salary"));
                     connection.close();
                  }
               catch(Exception e)
                 { 
                  JOptionPane.showMessageDialog(jtf1, "User NOT FOUND", "Error", JOptionPane.ERROR_MESSAGE);
                   }

}



	public static void main(String[] arg)
	   {
		new H();
	   }
        
   }