package bankingmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener {
    
    JButton deposit,withdraw,fastcash,ministatement,pinchange,balance_enquiry,exit;
    String pinnumber;
    Transaction(String pinnumber){
        
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/atm1.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,765,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,765);
        add(image);
        
        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(185,190,500,20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit=new JButton("Deposit");
        deposit.setBounds(150,325,140,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdraw=new JButton("Withdraw");
        withdraw.setBounds(310,325,140,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        fastcash=new JButton("Fastcash");
        fastcash.setBounds(150,365,140,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement=new JButton("Ministatement");
        ministatement.setBounds(310,365,140,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange=new JButton("Pin Change");
        pinchange.setBounds(150,405,140,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balance_enquiry=new JButton("Balnace Enquiry");
        balance_enquiry.setBounds(310,405,140,30);
        balance_enquiry.addActionListener(this);
        image.add(balance_enquiry);
        
        exit=new JButton("Exit");
        exit.setBounds(196,496,180,41);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        setSize(800,765);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }
        else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==withdraw){
            setVisible(false);
            new Withdraw(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==fastcash){
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        
        }
        else if(ae.getSource()==pinchange){
            setVisible(false);
            new Pinchange(pinnumber).setVisible(true);
        
        }
        else if(ae.getSource()==balance_enquiry){
            setVisible(false);
            new Balanceenquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==ministatement){
           
            new Ministatement(pinnumber).setVisible(true);
        }
        
        
    }
    public static void main(String ar[]){
        new Transaction("");
    }
}
