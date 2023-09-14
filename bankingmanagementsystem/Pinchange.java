package bankingmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pinchange extends JFrame implements ActionListener {
    
    JPasswordField texttf,texttf2;
    JButton change,back;
    String pinnumber;
    
    Pinchange(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/atm1.jpg"));
        Image i2=i1.getImage().getScaledInstance(850,765,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,850,765);
        add(image);
        
        JLabel text=new JLabel("Change your Pin");
        text.setBounds(240,190,500,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,20));
        image.add(text);
        
        
        JLabel text1=new JLabel(" New Pin");
        text1.setBounds(150,250,180,20);
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("System",Font.BOLD,17));
        image.add(text1);
        
        texttf=new JPasswordField();
        texttf.setFont(new Font("Raleway",Font.BOLD,22));
        texttf.setBounds(310,245,180,35);
        image.add(texttf);
        
        JLabel text2=new JLabel("Re-enter New Pin");
        text2.setBounds(154,310,180,20);
        text2.setForeground(Color.WHITE);
        text2.setFont(new Font("System",Font.BOLD,17));
        image.add(text2);
        
        texttf2=new JPasswordField();
        texttf2.setFont(new Font("Raleway",Font.BOLD,22));
        texttf2.setBounds(310,305,180,35);
        image.add(texttf2);
        
        change=new JButton("Change");
        change.setBounds(300,430,180,30);
        change.addActionListener(this);
        image.add(change);
        
        back=new JButton("Back");
        back.setBounds(200,496,205,41);
        back.addActionListener(this);
        image.add(back);
        
        setSize(850,765);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
            try{
                String npin=texttf.getText();
                String rpin=texttf2.getText();
                
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                
                }
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter new PIN");
                    return;
                }
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
                    return;
                }
                
                Conn c=new Conn();
                String query1="update bank1 set pin = '"+rpin+"' where pin= '"+pinnumber+"'";
                String query2="update login1 set pin = '"+rpin+"' where pin= '"+pinnumber+"'";
                String query3="update signUp3a set pin = '"+rpin+"' where pin= '"+pinnumber+"'";
                
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                
                setVisible(false);
                new Transaction(rpin).setVisible(true);
            
            }
            catch(Exception e){
                System.out.println(e);
            }
        
        
        }
        else{
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        
        }
    
    }
    
    public static void main(String ar[]){
        
        new Pinchange(" ").setVisible(true);
    }
    
}
