package bankingmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Balanceenquiry extends JFrame implements ActionListener{
    
    JButton back;
    String pinnumber;
    
    Balanceenquiry(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/atm1.jpg"));
        Image i2=i1.getImage().getScaledInstance(850,765,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,850,765);
        add(image);
        
        back=new JButton("Back");
        back.setBounds(200,496,205,41);
        back.addActionListener(this);
        image.add(back);
       
            Conn c=new Conn();
            int balance=0;
            try{
                ResultSet rs=c.s.executeQuery("select * from bank1 where pin = '"+pinnumber+"'");
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance +=Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance -=Integer.parseInt(rs.getString("amount"));
                    }
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            
            JLabel text=new JLabel("Your current Account Balance is Rs "+ balance);
            text.setForeground(Color.WHITE);
            text.setBounds(163, 175, 400, 55);
            image.add(text);
        
        
        setSize(850,765);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
    }
    
    public static void main(String ar[]){
        new Balanceenquiry("");
    }
    
}
