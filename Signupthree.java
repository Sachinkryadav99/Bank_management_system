
package bank.management.system;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.SQLException;



public class Signupthree extends JFrame implements ActionListener{
    JRadioButton Saving_Account,FDA,CA,RDA;
    JCheckBox atm,int_Banking,MOB_Banking,sms_Alerts,chek_Book,Estatement,correct;
    JButton  cancle, submit;
    String formno;
    Signupthree(String formno)
    {
        this.formno = formno;
        setLayout(null);
        System.out.println(formno);
        
        
        JLabel l1 = new JLabel("Page3: Account Detail");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,40,400,40);
        add(l1);
        
            
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,400,40);
        add(type);
        
        
        
        
        
        Saving_Account = new JRadioButton("Saving Account");
        Saving_Account.setFont(new Font("Raleway",Font.BOLD,16));
        Saving_Account.setBackground(Color.WHITE);
        Saving_Account.setBounds(100,200,200,20);
        add(Saving_Account);
        
        
        
        FDA = new JRadioButton("Fixed deposit Account");
        FDA.setFont(new Font("Raleway",Font.BOLD,16));
        FDA.setBackground(Color.WHITE);
        FDA.setBounds(350,200,200,20);
        add(FDA);
        
        
        
        CA = new JRadioButton("Current Account");
        CA.setFont(new Font("Raleway",Font.BOLD,16));
        CA.setBackground(Color.WHITE);
        CA.setBounds(100,240,200,20);
        add(CA);
        
        
        RDA = new JRadioButton("Recuring deposit Account");
        RDA.setFont(new Font("Raleway",Font.BOLD,16));
        RDA.setBackground(Color.WHITE);
        RDA.setBounds(350,240,200,20);
        add(RDA);
        
        
        ButtonGroup groupAccoumt = new ButtonGroup();
        groupAccoumt.add(Saving_Account);
        groupAccoumt.add(FDA);
        groupAccoumt.add(RDA);
        groupAccoumt.add(CA);
        
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,22));
        cardno.setBounds(100,300,200,30);
        add(cardno);
        JLabel carddetail = new JLabel("Your 16 Digit Card no:");
        carddetail.setFont(new Font("Raleway",Font.BOLD,9));
        carddetail.setBounds(100,330,200,30);
        add(carddetail);
        
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-1234");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        
        
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        JLabel pindetails = new JLabel("Your 4 password:");
        pindetails.setFont(new Font("Raleway",Font.BOLD,9));
        pindetails.setBounds(100,400,300,30);
        add(pindetails);
        
        
        JLabel Pnumber = new JLabel("XXXX");
        Pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        Pnumber.setBounds(330,370,300,30);
        add(Pnumber);
        
        
        JLabel services = new JLabel("Service Reqired:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,200,30);
        add(services);
        atm = new JCheckBox("ATM CARD");
        atm.setBackground(Color.WHITE);
        atm.setBounds(100,500,200,30);
        add(atm);
        
        int_Banking = new JCheckBox("Internate Banking");
        int_Banking.setBackground(Color.WHITE);
        int_Banking.setBounds(350,500,200,30);
        add(int_Banking);
        
        MOB_Banking = new JCheckBox("Mobile Banking");
        MOB_Banking.setBackground(Color.WHITE);
        MOB_Banking.setBounds(100,550,200,30);
        add(MOB_Banking);
        
        sms_Alerts = new JCheckBox("Email/Sms Allerts ");
        sms_Alerts.setBackground(Color.WHITE);
        sms_Alerts.setBounds(350,550,200,30);
        add(sms_Alerts);
        
        chek_Book = new JCheckBox("Cheque Book");
        chek_Book.setBackground(Color.WHITE);
        chek_Book.setBounds(100,600,200,30);
        add(chek_Book);
        
        Estatement = new JCheckBox("E-Statement");
        Estatement.setBackground(Color.WHITE);
        Estatement.setBounds(350,600,200,30);
        add(Estatement);
        
        correct = new JCheckBox("I hearby declear that above details are correct to the best of my knowledge");
        correct.setBackground(Color.WHITE);
        correct.setBounds(100,650,550,30);
        add(correct);
        
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Ralway",Font.BOLD, 14));
        submit.setBounds(250, 700, 100 ,30);
        submit.addActionListener(this);
        add(submit);
        
        
        cancle = new JButton("Cancle");
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Ralway",Font.BOLD, 14));
        cancle.setBounds(450, 700, 100 ,30);
        cancle.addActionListener(this);
        add(cancle);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800);
        setLocation(350,0);
        setVisible(true);
        
        
    
    }
   
    
    
    public static void main(String [] args)
    {
        new Signupthree("");
    }
    
    /*
    JCheckBox atm,int_Banking,MOB_Banking,sms_Alerts,chek_Book,Estatement,correct;
    JButton  cancle, submit;
    */

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == submit)
       {
           String AccountType = null;
           if(Saving_Account.isSelected())
           {
               AccountType = "Savin Account";
           }
           else if(FDA.isSelected())
           {
               AccountType = "Fixed deposit Account";
           }
           else if(CA.isSelected())
           {
               AccountType = "Current Account";
           }
           else if(RDA.isSelected())
           {
               AccountType = "Recuring deposit Account";
           }
           
           
           Random random = new Random();
           String  cardnonumber ="" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
           String pin = "" + Math.abs(random.nextLong() % 9000L + 1000L);
           
           
           String faclity = "";
           if(atm.isSelected())
           {
               faclity = "" + "ATM Card";
           }
            else if(int_Banking.isSelected())
            {
                faclity = "" + " Internate Banking";
            }
            else if(MOB_Banking.isSelected())
            {
                faclity = "" + " Mobile Banking";
            }
            else if(sms_Alerts.isSelected())
            {
                faclity = "" + " Sms Allert";
            }
            else if(chek_Book.isSelected())
            {
                faclity = "" + " Cheque Book";
            }
            else if(Estatement.isSelected())
            {
                faclity = "" + " E-Statement";
            }
            else if(correct.isSelected())
            {
                faclity = "" + " Correct";
            }  
           
           
           try
           {
               if(AccountType.equals(""))
               {
                   JOptionPane.showMessageDialog(null,"AccountType is Required");
               }
               else
               {
                   Conn c = new Conn();
                   String query1 = "insert into signupthree values('"+formno+"', '"
                           +AccountType+"', '"+cardnonumber+"', '"+pin+"', '"+faclity+"')";
           
                   String query2 = "insert into login values('"+formno+"', '"+cardnonumber+"', '"+pin+"')";
                   c.s.executeUpdate(query1);
                   c.s.executeUpdate(query2);
                   
                  JOptionPane.showMessageDialog(null,"Card no: "+cardnonumber+"\n Pin: "+pin);
                   
                   setVisible(false);
                   new Trangection(pin).setVisible(false);
               }
           }
           catch(Exception e)
                   {
                       System.out.println(e);
                   }
           
           
           
           
           
       }
       else if(ae.getSource() == cancle)
       {
            setVisible(false);
            new Login().setVisible(true);
       }
    }
}
