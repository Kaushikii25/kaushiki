package bankingmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Date;
import java.awt.event.*;

public class Fastcash extends JFrame implements ActionListener {
    
        JButton rs1,rs2,rs3,rs4,rs5,rs6,back;
        String pinnumber;
        
        Fastcash(String pinnumber){
        
        
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/atm1.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,765,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,765);
        add(image);
        
        JLabel text=new JLabel("Select Withdrawal amount");
        text.setBounds(185,190,500,20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        rs1=new JButton("Rs-100");
        rs1.setBounds(150,325,140,30);
        rs1.addActionListener(this);
        image.add(rs1);
        
        rs2=new JButton("Rs-500");
        rs2.setBounds(310,325,140,30);
        rs2.addActionListener(this);
        image.add(rs2);
        
        rs3=new JButton("Rs-1000");
        rs3.setBounds(150,365,140,30);
        rs3.addActionListener(this);
        image.add(rs3);
        
        rs4=new JButton("Rs-2000");
        rs4.setBounds(310,365,140,30);
        rs4.addActionListener(this);
        image.add(rs4);
        
        rs5=new JButton("Rs-5000");
        rs5.setBounds(150,405,140,30);
        rs5.addActionListener(this);
        image.add(rs5);
        
        rs6=new JButton("Rs-10000");
        rs6.setBounds(310,405,140,30);
        rs6.addActionListener(this);
        image.add(rs6);
        
        back=new JButton("back");
        back.setBounds(196,496,180,41);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setSize(800,765);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
        else{
            String amount=((JButton)ae.getSource()).getText().substring(3);
            Conn c=new Conn();
            try{
                ResultSet rs=c.s.executeQuery("select * from bank1 where pin = '"+pinnumber+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance +=Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance -=Integer.parseInt(rs.getString("amount"));
                    }
                
                }
                
                if(ae.getSource() != back && balance< Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date=new Date();
                String query="Insert into bank1 values('"+pinnumber+"', '"+date+"', 'withdraw', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+ amount + " Debited Successfully");
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        
        }
        
        
    }
    
 
    
    public static void main (String ar[]){
        
        new Fastcash("");
        
    
    }
}
