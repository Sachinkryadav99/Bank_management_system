
package bamk.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.SQLException;

//import com.toedter.calendar.JDateChooser

//addtext citytext
public class Signuptwo extends JFrame implements ActionListener
{
    
    long random;
    JTextField pan,adhar,addtext, citytext;
    JButton next;
    JRadioButton Syes,Sno,Eyes,Eno; 
    JComboBox religion, cateoery, income, education,occupation;
    String formno;
            
    
    
    Signuptwo(String formno)
    {
        this.formno = formno;
        setLayout(null);
        setTitle("NEW APPLICATION FORM - PAGE NO 2");
        System.out.println(formno);
        
        
        
        
        JLabel Additionaldetail = new JLabel("Page 2: Additional Detals ");
        Additionaldetail.setFont(new Font("Raleway",Font.BOLD,22));
        Additionaldetail.setBounds(200,80,500,30);
        add(Additionaldetail);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(200,140,500,30);
        add(name);
        String [] valrel = {"Hindu","Muslim","Sikh","Christain","Other"};
        religion = new JComboBox(valrel);
        religion.setBounds(400,144,300,30);
        religion.setBackground(Color.WHITE);
        add(religion);
     
        
        JLabel Fname = new JLabel("Cateoery:");
        Fname.setFont(new Font("Raleway",Font.BOLD,22));
        Fname.setBounds(200,200,500,30);
        add(Fname);
        String [] valCategory = {"General","Obc","Sc","St","Other"};
        cateoery = new JComboBox(valCategory);
        cateoery.setBounds(400,204,300,30);
        cateoery.setBackground(Color.WHITE);
        add(cateoery);
        
        
        
        JLabel dob = new JLabel("income:");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(200,260,500,30);
        add(dob);
        String [] valIncome = {"Null","<1,50,000","2,50,000","5,00,000","upto 10,00,00"};
        income = new JComboBox(valIncome);
        income.setBounds(400,264,300,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        
        
        JLabel gender = new JLabel("Educationl:");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(200,320,500,30);
        add(gender);
       
        
        JLabel Email = new JLabel("Qualification:");
        Email.setFont(new Font("Raleway",Font.BOLD,22));
        Email.setBounds(200,345,500,30);
        add(Email);
        
        String [] eduvalues = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(eduvalues);
        education.setBounds(400,345,300,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(200,440,500,30);
        add(marital);
        
        String [] Occupationval = {"Salaried","Self-Employed","Business","Student","Retaired","Farmer","Other"};
        occupation = new JComboBox(Occupationval);
        occupation.setBounds(400,440,300,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        
       
        
        JLabel add = new JLabel("Pan no:");
        add.setFont(new Font("Raleway",Font.BOLD,22));
        add.setBounds(200,500,500,30);
        add(add);
        pan = new  JTextField();
        pan.setBounds(400,504,300,30);
        pan.setFont(new Font("Arial",Font.BOLD,14));
        add(pan);
        
        JLabel city = new JLabel("Adhar no:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(200,560,500,30);
        add(city);
        adhar = new  JTextField();
        adhar.setBounds(400,564,300,30);
        adhar.setFont(new Font("Arial",Font.BOLD,14));
        add(adhar);
        
        JLabel state = new JLabel("Senior citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(200,620,500,30);
        add(state);
        Syes = new JRadioButton("Yes");
        Syes.setBounds(400,620,120,30);
        Syes.setBackground(Color.white);
        add(Syes);
        Sno = new JRadioButton("No");
        Sno.setBounds(550,620,120,30);
        Sno.setBackground(Color.white);
        add(Sno);
        
        ButtonGroup Seniorstz = new ButtonGroup();
        Seniorstz.add(Syes);
        Seniorstz.add(Sno);
        
        
        
        
        
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(200,680,500,30);
        add(pincode);
        Eyes = new JRadioButton("Yes");
        Eyes.setBounds(400,680,120,30);
        Eyes.setBackground(Color.white);
        add(Eyes);
        Eno = new JRadioButton("No");
        Eno.setBounds(550,680,120,30);
        Eno.setBackground(Color.white);
        add(Eno);
        
        ButtonGroup exestingAC = new ButtonGroup();
        exestingAC.add(Eyes);
        exestingAC.add(Eno);
        
     
       
        
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
         new Signuptwo("");
    } 

    
@Override
    public void actionPerformed(ActionEvent e) {
       //religion, cateoery, income, education,occupation;
        String formno = ""+ random;
        String Srel =(String) religion.getSelectedItem();
        String Scat =(String) cateoery.getSelectedItem();
        String Sinc =(String) income.getSelectedItem();
        String Sedu =(String) education.getSelectedItem();
        String Socc =(String) occupation.getSelectedItem();
        String seniorcetizen = null;
        if(Syes.isSelected())
        {
            seniorcetizen = "Yes";
        }
        else if(Sno.isSelected())
        {
             seniorcetizen = "No";
        }
            
        
        String exeAc = null;
         if(Eyes.isSelected())
        {
            exeAc = "yes";
        }
        else if(Eno.isSelected())
        {
             exeAc = "no";
        }
         
        String Span = pan.getText();
        String Sadd = adhar.getText();
        
        
         try
        {

                Conn c = new Conn();
                String query = "insert into signuptwo values ('"+formno+"', '"+Srel+"',' "
                        +Scat+"',' "+Sinc+"',' "+Sedu+
                        "',' "+Socc+"',' "+seniorcetizen+"',' "+exeAc+"',' "
                        +Span+"',' "+Sadd+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new Signupthree(formno).setVisible(true);
                
 
        }
         catch(Exception ae)
                {
                    System.out.println(ae);
                }
    }   

    
}
