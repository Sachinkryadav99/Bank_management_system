
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import java.sql.ResultSet;


public class BalanceEnquery extends JFrame implements ActionListener
{
    
    String pinnumber;
    JButton back;
    
    BalanceEnquery(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
         Conn c = new Conn();
         int balance = 0;
         try
            {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                
                while(rs.next())
                {
                    if(rs.getString("type").equals("Deposit"))
                    {
                        balance +=Integer.parseInt(rs.getString("amount"));
                    }
                    else
                    {
                         balance -=Integer.parseInt(rs.getString("amount"));
                    }
                }
            }
                catch (Exception e)
                        {
                            System.out.println(e);
                        }
         JLabel text = new JLabel("Your Current Account Ballance is RS "+balance);
         text.setForeground(Color.WHITE);
         text.setBounds(170,300,400,30);
         image.add(text);
        
        
        
        
        setSize(900,900);
        setLocation(300,100);
        setUndecorated(true);
        setVisible(true);
    }
    
    public static void main(String [] args)
    {
        new BalanceEnquery("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        setVisible(false);
        new Trangection(pinnumber).setVisible(true);
    }
}
