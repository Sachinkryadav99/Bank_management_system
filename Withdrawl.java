
package bamk.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Withdrawl  extends JFrame implements ActionListener
{
    JTextField amount;
    JButton withdraw,back;
    String pinnumber;
    Withdrawl(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the Amount you want to withdraw");
        text.setBounds(170,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("System",Font.BOLD,22));
        amount.setBounds(170,350,320,35);
        image.add(amount);
        
        
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        back = new JButton("Back");
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
        new Withdrawl("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == withdraw)
        {
            String number = amount.getText();
            Date date = new Date();
            if(number.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter the amount you want to withdraw");   
            }
            else
            {
                try
                {
                    Conn conn = new Conn();
                    String query = "insert into bank values ('"+pinnumber+"', '"+date+"','withdrawl','"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+number+" Withdraw Successfully");
                    setVisible(false);
                    new Trangection(pinnumber).setVisible(true);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                
                
            }
        }
        else if(ae.getSource() == back)
        {
            setVisible(false);
            new Trangection(pinnumber).setVisible(true);
        }
    }

   
}
