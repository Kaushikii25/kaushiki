package bankingmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Ministatement extends JFrame{
    
    Ministatement(String pinnumber){
        
        
        setLayout(null);
        
        JLabel text=new JLabel("----------------------------------Mini Statement------------------------------------");
        text.setBounds(3, 80, 600, 25);
        text.setFont(new Font("Raleway",Font.BOLD,20));
        add(text);
        
        
        JLabel text1=new JLabel("HDFC Bank");
        text1.setBounds(205,25,200,60);
        text1.setFont(new Font("System",Font.BOLD,30));
        add(text1);
        
        JLabel mini=new JLabel("");
        mini.setBounds(30,185,800,120);
        mini.setFont(new Font("System",Font.BOLD,15));
        add(mini);
        
        
        
        JLabel card=new JLabel();
        card.setBounds(25,105,200,60);
        //card.setFont(new Font("System",Font.BOLD,30));
        add(card);
        
        JLabel balance=new JLabel();
        balance.setBounds(30,465,500,40);
        balance.setFont(new Font("Raleway",Font.BOLD,15));
        add(balance);
        
        try{
            Conn c=new Conn();
            ResultSet rs =c.s.executeQuery("select * from login1 where pin = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
            }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        try{
            Conn c=new Conn();
            int bal=0;
            ResultSet rs=c.s.executeQuery("select * from bank1 where pin = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                        bal +=Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        bal -=Integer.parseInt(rs.getString("amount"));
                    }
            }
            
            balance.setText("Your current account Balance is Rs " + bal);
        
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
        setSize(600,600);
        setLocation(920,0);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    
    
    }
    
    public static void main(String ar[]){
        new Ministatement("");
    }
    
}
