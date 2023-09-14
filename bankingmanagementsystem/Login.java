package bankingmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Login extends JFrame implements ActionListener {
    
        JButton login,clear,signup;
        JTextField cardTextField;
        JPasswordField pinTextField;
    
        Login(){
            setTitle("Bank Management System");
            setLayout(null);
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/hdfc-logo.jpg"));
            Image i2=i1.getImage().getScaledInstance(100,100,250);
            ImageIcon i3=new ImageIcon(i2);
            JLabel label=new JLabel(i3);
            label.setBounds(70, 30, 170, 135);
            add(label);
            
            ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("New folder/bankicon.jpg"));
            Image i2a=i.getImage().getScaledInstance(1000,765,Image.SCALE_DEFAULT);
            ImageIcon i3a=new ImageIcon(i2a);
            JLabel image=new JLabel(i3a);
            image.setBounds(0,0,1000,765);
            add(image);
            
            JLabel text=new JLabel("Welcome to Net Banking");
            text.setFont(new Font("Arial Narrow font",Font.BOLD,50));
            text.setBounds(250, 30, 600, 150);
            text.setForeground(Color.WHITE);
            image.add(text);
            
            JLabel accountno=new JLabel("Account no");
            accountno.setFont(new Font("Arial Narrow font",Font.BOLD,28));
            accountno.setBounds(245, 130, 200, 150);
            accountno.setForeground(Color.WHITE);
            image.add(accountno);
            
            cardTextField=new JTextField();
            cardTextField.setBounds(420, 192, 250, 35);
            cardTextField.setFont(new Font("Arial",Font.PLAIN,14));
            image.add(cardTextField);
            
            JLabel pin=new JLabel("Password");
            pin.setFont(new Font("Arial Narrow font",Font.BOLD,28));
            pin.setBounds(245, 200, 200, 150);
            pin.setForeground(Color.WHITE);
            image.add(pin);
            
            pinTextField=new JPasswordField();
            pinTextField.setBounds(420, 260, 250, 35);
            pinTextField.setFont(new Font("Arial",Font.PLAIN,14));
            image.add(pinTextField);
            
            login=new JButton("LOGIN"); 
            login.setBounds(420,350, 105, 45);
            login.setBackground(Color.WHITE);
            login.setForeground(Color.BLACK);
            login.addActionListener(this);
            image.add(login);
            
            clear=new JButton("CLEAR"); 
            clear.setBounds(565,350, 105, 45);
            clear.setBackground(Color.WHITE);
            clear.setForeground(Color.BLACK);
            clear.addActionListener(this);
            image.add(clear);
            
            signup=new JButton("SIGNUP"); 
            signup.setBounds(420,420, 250, 45);
            signup.setBackground(Color.WHITE);
            signup.setForeground(Color.BLACK);
            signup.addActionListener(this);
            image.add(signup);
            
            
            getContentPane().setBackground(Color.white);
            
            
            setSize(1000,550);
            setVisible(true);
            setLocation(250,100);
        }
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==clear){
                cardTextField.setText(" ");
                pinTextField.setText(" ");
            }
            else if(ae.getSource()==login){
                Conn c=new Conn();
                String cardnumber=cardTextField.getText();
                String pinnumber=pinTextField.getText();
                String query="select * from login1 where cardnumber = '"+cardnumber+"'and pin='"+pinnumber+"'";
                try{
                    ResultSet rs=c.s.executeQuery(query);
                    if(rs.next()){
                        setVisible(false);
                        new Transaction(pinnumber).setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                    }
                }
                catch(Exception e){
                    System.out.println(e);
                }

            }
            else if(ae.getSource()==signup){
                setVisible(false);
                new SignupOne().setVisible(true);
            
            }
            
        }
    public static void main (String ar[]){
        new Login();
    }
    
}
