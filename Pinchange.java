
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class Pinchange extends JFrame implements ActionListener
{
    JPasswordField pin,repin;
    JButton change,back;
    String pinumber;
    Pinchange(String pinumber)
    {
        this.pinumber = pinumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(250,280,500,35);
        image.add(text);
        
        JLabel pintext = new JLabel("New pin:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(165,320,180,25);
        image.add(pintext);
        
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);
        
        
        JLabel repintext = new JLabel("Re-Enter new pin:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setBounds(165,360,180,25);
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);
        
        
        
        change = new JButton("Change:");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
        JButton back = new JButton("Back:");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        
        
        setSize(900,900);
        setLocation(300,100);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    
    
    public static void main(String [] args)
    {
        new Pinchange("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
            if(ae.getSource() == change)
            {
                try
            {
                String npin = pin.getText();
                String rpin = repin.getText();
                if(!npin.equals(rpin))
                {
                    JOptionPane.showMessageDialog(null, "Entered PIN dose't match ");
                    return;
                }
                
                if(npin.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter new pin ");
                    return;
                }
                if(rpin.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Re-Enter new pin ");
                    return;
                }
                Conn c = new Conn();
                String query1 = "update bank set pin = '"+rpin+"' where pin ='"+pinumber+"'";
                String query2 = "update login set pin = '"+rpin+"' where pin ='"+pinumber+"'";
                String query3 = "update signupthree set pin = '"+rpin+"' where pin ='"+pinumber+"'";
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null, "Pin change successfully");
                
                 setVisible(false);
                new Withdrawl(rpin).setVisible(true);
                
                
            }
            catch(Exception e)
                    {
                        System.out.println(e);
                    }
            }
            else
            {
                setVisible(false);
                new Withdrawl(pinumber).setVisible(true);
            }
            
        
        
    }
}
