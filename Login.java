/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;


import java.sql.*;
import javax.swing.*;

import java.awt.*;
import static java.awt.Image.SCALE_DEFAULT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


/**
 *
 * @au
 */
public class Login extends JFrame implements ActionListener
{       
    JButton signup,login,Clear;
    JTextField Cardtext;
    JPasswordField Pintext;
    Login()
    {
        setTitle("Automatic taller machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel labe1= new JLabel(i3);
        labe1.setBounds(140,10,100,100);
        add(labe1);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("Welcom to ATM");
        text.setFont(new Font("Osward",Font.BOLD,36));
        text.setBounds(250,50,300,40);
        add(text);
        
        
        
        
        JLabel Crdno = new JLabel("Card no:");
        Crdno.setFont(new Font("Railway",Font.BOLD,25));
        Crdno.setBounds(130,150,300,40);
        add(Crdno);
        Cardtext = new  JTextField();
        Cardtext.setBounds(275,155,300,30);
        Cardtext.setFont(new Font("Arial",Font.BOLD,14));
        add(Cardtext);
        
        
        
        JLabel Pin = new JLabel("Pin:");
        Pin.setFont(new Font("Railway",Font.BOLD,25));
        Pin.setBounds(130,220,300,40);
        add(Pin);
        Pintext = new  JPasswordField();
        Pintext.setBounds(275,228,300,30);
        Pintext.setFont(new Font("Arial",Font.BOLD,14));
        add(Pintext);
        
        
        
        login = new JButton("SIGN IN");
        login.setBounds(275,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        
        Clear = new JButton("CLEAR");
        Clear.setBounds(475,300,100,30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);
        add(Clear);
        
        
        signup = new JButton("SIGN UP");
        signup.setBounds(275,375,300,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        setSize(700,500);
        setVisible(true);
        setLocation(350,200);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == Clear)
        {
            Cardtext.setText("");
            Pintext.setText("");
        }
        else if(ae.getSource() == login)
        {
            Conn conn = new Conn();
            String cardnumber = Cardtext.getText();
            String pinnumber = Pintext.getText();
            String query = "select * from login where cardno = '"+cardnumber+"'and pin = '"+pinnumber+"'";
            try
            {
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Trangection(pinnumber).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Card number and Pin");
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            
        }
        else if(ae.getSource() == signup)
        {
            new Signupone();
        }
    }

    public static void main(String[] args) 
    {
        new Login();
    }

    
}
