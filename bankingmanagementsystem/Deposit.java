package bankingmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Deposit extends JFrame implements ActionListener {
    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    
    Deposit(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/atm1.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,765,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,765);
        add(image);
        
        JLabel text=new JLabel("Enter the amount you want to deposit");
        text.setBounds(150,190,500,20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,17));
        image.add(text);
        
        amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(150,240,300,35);
        image.add(amount);
        
        deposit=new JButton("Deposit");
        deposit.setBounds(305,385,140,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back=new JButton("Back");
        back.setBounds(305,425,140,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(800,765);
        setLocation(300,0);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){
            String number=amount.getText();
            Date date=new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount");
            }
            else{
                try{
                Conn c=new Conn();
                String query="insert into bank1 values('"+pinnumber+"', '"+date+"', 'Deposit', '"+number+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+number+" Deposited successfully");
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
        new Deposit("");
    }
    
}
