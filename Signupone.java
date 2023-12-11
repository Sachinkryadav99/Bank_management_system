
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.SQLException;

//import com.toedter.calendar.JDateChooser


public class Signupone extends JFrame implements ActionListener
{
    
    long random;
    JTextField nametext, Fnametext, dobtext,Emailtext,addtext,citytext,statetext,
            pincodetext;
    JButton next;
    JRadioButton male,female,yes,no,others; 
            
    
    
    Signupone()
    {
        setLayout(null);
        
        Random ram = new Random();
        random = Math.abs(ram.nextLong() % 900l+1000l);
        JLabel formno = new JLabel("Application form "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Detals ");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(200,80,500,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(200,140,500,30);
        add(name);
        nametext = new  JTextField();
        nametext.setBounds(400,144,300,30);
        nametext.setFont(new Font("Arial",Font.BOLD,14));
        add(nametext);
        
        JLabel Fname = new JLabel("Father name:");
        Fname.setFont(new Font("Raleway",Font.BOLD,22));
        Fname.setBounds(200,200,500,30);
        add(Fname);
        Fnametext = new  JTextField();
        Fnametext.setBounds(400,204,300,30);
        Fnametext.setFont(new Font("Arial",Font.BOLD,14));
        add(Fnametext);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(200,260,500,30);
        add(dob);
        dobtext = new  JTextField();
        dobtext.setBounds(400,264,300,30);
        dobtext.setFont(new Font("Arial",Font.BOLD,14));
        add(dobtext);
        
        
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(200,320,500,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(400,320,120,30);
        male.setBackground(Color.white);
        add(male);
        female = new JRadioButton("female");
        female.setBounds(550,320,120,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergropup = new ButtonGroup();
        gendergropup.add(male);
        gendergropup.add(female);
        
        
        JLabel Email = new JLabel("Email:");
        Email.setFont(new Font("Raleway",Font.BOLD,22));
        Email.setBounds(200,380,500,30);
        add(Email);
        Emailtext = new  JTextField();
        Emailtext.setBounds(400,384,300,30);
        Emailtext.setFont(new Font("Arial",Font.BOLD,14));
        add(Emailtext);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(200,440,500,30);
        add(marital);
        yes = new JRadioButton("Yes");
        yes.setBounds(400,444,80,30);
        yes.setBackground(Color.white);
        add(yes);
        no = new JRadioButton("No");
        no.setBounds(500,444,80,30);
        no.setBackground(Color.white);
        add(no);
        
        others = new JRadioButton("Others");
        others.setBounds(600,444,80,30);
        others.setBackground(Color.white);
        add(others);
        
        ButtonGroup maritalgropup = new ButtonGroup();
        maritalgropup.add(yes);
        maritalgropup.add(no);
        maritalgropup.add(others);
        
        JLabel add = new JLabel("Address:");
        add.setFont(new Font("Raleway",Font.BOLD,22));
        add.setBounds(200,500,500,30);
        add(add);
        addtext = new  JTextField();
        addtext.setBounds(400,504,300,30);
        addtext.setFont(new Font("Arial",Font.BOLD,14));
        add(addtext);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(200,560,500,30);
        add(city);
        citytext = new  JTextField();
        citytext.setBounds(400,564,300,30);
        citytext.setFont(new Font("Arial",Font.BOLD,14));
        add(citytext);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(200,620,500,30);
        add(state);
        statetext = new  JTextField();
        statetext.setBounds(400,624,300,30);
        statetext.setFont(new Font("Arial",Font.BOLD,14));
        add(statetext);
        
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(200,680,500,30);
        add(pincode);
        pincodetext = new  JTextField();
        pincodetext.setBounds(400,684,300,30);
        pincodetext.setFont(new Font("Arial",Font.BOLD,14));
        add(pincodetext);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 744, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,850);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public static void main(String [] args)
    {
         new Signupone();
    } 

    
@Override
    public void actionPerformed(ActionEvent e) {
        String formno = ""+random;//long
        String name =nametext.getText();
        String fname = Fnametext.getText();
        String dob =dobtext.getText();
        String gender = null;
        if(male.isSelected())
        {
            gender = "Male";
        }
        else if(female.isSelected())
        {
             gender = "feMale";
        }
            
        String email = Emailtext.getText();
        String maried = null;
         if(yes.isSelected())
        {
            maried = "yes";
        }
        else if(no.isSelected())
        {
             maried = "no";
        }
         else if(others.isSelected())
        {
             maried = "other";
        }
        String address = addtext.getText();
        String city = citytext.getText();
        String state = statetext.getText();
        String pin =pincodetext.getText();
        
         try
        {
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Name is reqired");
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signup values ('"+formno+"',' "
                        +name+"',' "+fname+"',' "+dob+"',' "+gender+
                        "',' "+email+"',' "+maried+"',' "+address+"',' "
                        +city+"',' "+state+"',' "+pin+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                
                new Signuptwo(formno).setVisible(true);
                
                
                
            }
            
        }
         catch(Exception ae)
                {
                    System.out.println(ae);
                }
    }   
}
