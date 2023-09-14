package bankingmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Withdraw extends JFrame implements ActionListener {
    
    JTextField amount;
    JButton withdraw,back;
    String pinnumber;
    
    Withdraw(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/atm1.jpg"));
        Image i2=i1.getImage().getScaledInstance(850,765,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,850,765);
        add(image);
        
        JLabel text=new JLabel("Enter the amount you want to Withdraw");
        text.setBounds(154,190,500,20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,17));
        image.add(text);
        
        amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(150,240,330,35);
        image.add(amount);
        
        withdraw=new JButton("Withdraw");
        withdraw.setBounds(300,430,180,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back=new JButton("Back");
        back.setBounds(200,496,205,41);
        back.addActionListener(this);
        image.add(back);
        
        setSize(850,765);
        setLocation(300,0);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==withdraw){
            String number=amount.getText();
            Date date=new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
            }
            else{
                try{
                Conn c=new Conn();
                String query="insert into bank1 values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+number+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+number+" Withdraw successfully");
                setVisible(true);
                new Transaction(pinnumber).setVisible(true);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            
            
            
        
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        
        }
        
        
    
    }
    
    
    public static void main(String ar[]){
        new Withdraw("");
    }
    
}
