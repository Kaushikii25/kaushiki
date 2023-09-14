package bankingmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    
    SignupThree(){
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/bankicon.jpg"));
        Image i2=i1.getImage().getScaledInstance(840,765,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,840,765);
        add(image);
        
        JLabel l1=new JLabel(" Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,40));
        l1.setBounds(275,55,400,38);
        l1.setForeground(Color.WHITE);
        image.add(l1);
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,130,200,30);
        type.setForeground(Color.WHITE);
        image.add(type);
        
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.PLAIN,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(380,135,160,20);
        image.add(r1);
        
        r2=new JRadioButton("FD Account");
        r2.setFont(new Font("Raleway",Font.PLAIN,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(590,135,160,20);
        image.add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.PLAIN,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(380,175,160,20);
        image.add(r3);
        
        r4=new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raleway",Font.PLAIN,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(590,175,160,20);
        image.add(r4);
        
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel cardnumber=new JLabel("Card Number");
        cardnumber.setFont(new Font("Raleway",Font.BOLD,22));
        cardnumber.setBounds(100,215,200,30);
        cardnumber.setForeground(Color.WHITE);
        image.add(cardnumber);
        
        JLabel pin=new JLabel("Pin");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,285,200,30);
        pin.setForeground(Color.WHITE);
        image.add(pin);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(380,215,300,30);
        number.setForeground(Color.WHITE);
        image.add(number);
        
        JLabel details=new JLabel("This is your 16 digit Account number");
        details.setFont(new Font("Raleway",Font.BOLD,12));
        details.setBounds(100,245,300,20);
        details.setForeground(Color.WHITE);
        image.add(details);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(380,285,200,30);
        pnumber.setForeground(Color.WHITE);
        image.add(pnumber);
        
        JLabel details2=new JLabel("Your 4 digit Pin");
        details2.setFont(new Font("Raleway",Font.BOLD,12));
        details2.setBounds(100,315,300,20);
        details2.setForeground(Color.WHITE);
        image.add(details2);
        
        JLabel services=new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,25));
        services.setBounds(100,355,300,30);
        services.setForeground(Color.WHITE);
        image.add(services);
        
        c1=new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.PLAIN,16));
        c1.setBounds(370, 355, 300, 20);
        image.add(c1);
        
        c2=new JCheckBox("Net Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.PLAIN,16));
        c2.setBounds(370, 395, 300, 20);
        image.add(c2);
       
        c3=new JCheckBox("SMS Alerts");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.PLAIN,16));
        c3.setBounds(370, 435, 300, 20);
        image.add(c3);
       
        c4=new JCheckBox("Cheque Book");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.PLAIN,16));
        c4.setBounds(370, 475, 300, 20);
        image.add(c4);
       
        c5=new JCheckBox("E-Statement");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.PLAIN,16));
        c5.setBounds(370, 515, 300, 20);
        image.add(c5);
       
        c6=new JCheckBox("I here by declares that the above enetered details are beast of my knowledge.");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.PLAIN,16));
        c6.setBounds(100, 620, 597, 22);
        image.add(c6);
        
        submit =new JButton("Submit");
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("Raleway",Font.BOLD,15));
        submit.setBounds(100,670,90,25);
        submit.addActionListener(this);
        image.add(submit);
        
        cancel =new JButton("Cancel");
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.setFont(new Font("Raleway",Font.BOLD,15));
        cancel.setBounds(670,670,90,25);
        cancel.addActionListener(this);
        image.add(cancel);
       
       
        getContentPane().setBackground(Color.WHITE);
        setSize(850,780);
        setLocation(350,0);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType=null;
            if(r1.isSelected()){
                accountType="Saving Account";
            }
            else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                accountType="Current Account";
            }
            else if(r4.isSelected()){
                accountType="Reccuring Account";
                
            }
            Random random1=new Random();
            String cardnumber= "" + Math.abs((random1.nextLong()% 90000000L) + 5040936000000000L);
            
            String pinnumber="" + Math.abs((random1.nextLong()% 9000L) + 1000L);
            String facility="";
            if(c1.isSelected()){
                facility=facility+" ATM card";
            }
            else if(c2.isSelected()){
                facility=facility+" Net Banking";
            }
            else if(c3.isSelected()){
                facility=facility+" SMS Alerts";
            }
            else if(c4.isSelected()){
                facility=facility+" Cheque Book";
            }
            else if(c5.isSelected()){
                facility=facility+" E-Statement";
            }
            
            try{
                if(accountType.equals("")||facility.equals("")){
                JOptionPane.showMessageDialog(null,"All Fields are Required");
                }
                else{
                Conn c=new Conn();
                String query1="insert into signUp3a values('"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                String query2="insert into login1 values('"+cardnumber+"', '"+pinnumber+"')";
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null,"Card Number:" + cardnumber + "\n Pin: " + pinnumber);
                
                setVisible(false);
                new Deposit(pinnumber).setVisible(false);
                }
            }
            catch(Exception e){
                System.out.println(e);
            }

        
        }
        else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
            
        
        }
    }
    
    public static void main(String ar[]){
        new SignupThree();
    }

    
}
