package bankingmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nametf,fnametf,emailtf,addtf,citytf,statetf,pintf;
    JButton btn1;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser datechooser;
    
    SignupOne(){
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/bankicon.jpg"));
        Image i2=i1.getImage().getScaledInstance(840,765,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,840,765);
        add(image);
        
        Random r1=new Random();
        random= Math.abs((r1.nextLong()% 9000L) + 1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(150,45,600,35);
        formno.setForeground(Color.WHITE);
        image.add(formno);
        
        JLabel personalDetails=new JLabel("PAGE 1. PERSONAL DETAILS ");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(260,100,600,35);
        personalDetails.setForeground(Color.WHITE);
        image.add(personalDetails);
        
        JLabel name=new JLabel("NAME:");
        name.setFont(new Font("Raleway",Font.BOLD,19));
        name.setBounds(100,150,100,35);
        name.setForeground(Color.WHITE);
        image.add(name);
        
        nametf=new JTextField();
        nametf.setFont(new Font("Raleway",Font.BOLD,14));
        nametf.setBounds(300,155,400,25);
        image.add(nametf);
        
        
        JLabel fname=new JLabel("FATHER'S NAME:");
        fname.setFont(new Font("Raleway",Font.BOLD,19));
        fname.setBounds(100,200,300,35);
        fname.setForeground(Color.WHITE);
        image.add(fname);
        
        fnametf=new JTextField();
        fnametf.setFont(new Font("Raleway",Font.BOLD,14));
        fnametf.setBounds(300,205,400,25);
        image.add(fnametf);
        
        JLabel dob=new JLabel("DATE OF BIRTH:");
        dob.setFont(new Font("Raleway",Font.BOLD,19));
        dob.setBounds(100,250,300,35);
        dob.setForeground(Color.WHITE);
        image.add(dob);
        
        datechooser=new JDateChooser();
        datechooser.setBounds(300,250,400,25);
        datechooser.setForeground(new Color(105,105,105));
        image.add(datechooser);
        
        JLabel gender=new JLabel("GENDER:");
        gender.setFont(new Font("Raleway",Font.BOLD,19));
        gender.setBounds(100,300,300,25);
        gender.setForeground(Color.WHITE);
        image.add(gender);
        
        male=new JRadioButton("MALE");
        male.setBounds(300,300,100,30);
        male.setBackground(Color.WHITE);
        image.add(male);
        
        female=new JRadioButton("FEMALE");
        female.setBounds(450,300,100,30);
        female.setBackground(Color.WHITE);
        image.add(female);
        
        other=new JRadioButton("OTHER");
        other.setBounds(600,300,100,30);
        other.setBackground(Color.WHITE);
        image.add(other);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        JLabel maritial=new JLabel("MARITIAL STATUS:");
        maritial.setFont(new Font("Raleway",Font.BOLD,19));
        maritial.setBounds(100,350,300,35);
        maritial.setForeground(Color.WHITE);
        image.add(maritial);
        
        married=new JRadioButton("MARRIED");
        married.setBounds(300,350,100,30);
        married.setBackground(Color.WHITE);
        image.add(married);
        
        unmarried=new JRadioButton("UNMARRIED");
        unmarried.setBounds(450,350,100,30);
        unmarried.setBackground(Color.WHITE);
        image.add(unmarried);
        
        ButtonGroup maritialgroup=new ButtonGroup();
        maritialgroup.add(married);
        maritialgroup.add(unmarried);
        
        JLabel email=new JLabel("EMAIL:");
        email.setFont(new Font("Raleway",Font.BOLD,19));
        email.setBounds(100,400,300,35);
        email.setForeground(Color.WHITE);
        image.add(email);
        
        emailtf=new JTextField();
        emailtf.setFont(new Font("Raleway",Font.BOLD,14));
        emailtf.setBounds(300,400,400,25);
        image.add(emailtf);
        
        JLabel address=new JLabel("ADDRESS:");
        address.setFont(new Font("Raleway",Font.BOLD,19));
        address.setBounds(100,450,300,35);
        address.setForeground(Color.WHITE);
        image.add(address);
        
        addtf=new JTextField();
        addtf.setFont(new Font("Raleway",Font.BOLD,14));
        addtf.setBounds(300,455,400,25);
        add(addtf);
        
        JLabel city=new JLabel("CITY:");
        city.setFont(new Font("Raleway",Font.BOLD,19));
        city.setBounds(100,500,300,35);
        city.setForeground(Color.WHITE);
        image.add(city);
        
        citytf=new JTextField();
        citytf.setFont(new Font("Raleway",Font.BOLD,14));
        citytf.setBounds(300,505,400,25);
        add(citytf);
        
        JLabel state=new JLabel("STATE:");
        state.setFont(new Font("Raleway",Font.BOLD,19));
        state.setBounds(100,550,300,35);
        state.setForeground(Color.WHITE);
        image.add(state);
        
        statetf=new JTextField();
        statetf.setFont(new Font("Raleway",Font.BOLD,14));
        statetf.setBounds(300,555,400,25);
        add(statetf);
        
        JLabel pincode=new JLabel("PINCODE:");
        pincode.setFont(new Font("Raleway",Font.BOLD,19));
        pincode.setBounds(100,600,300,35);
        pincode.setForeground(Color.WHITE);
        image.add(pincode);
        
        pintf=new JTextField();
        pintf.setFont(new Font("Raleway",Font.BOLD,14));
        pintf.setBounds(300,605,400,25);
        add(pintf);
        
        JButton btn1=new JButton("Next");
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        btn1.setFont(new Font("Raleway",Font.BOLD,15));
        btn1.setBounds(620, 660, 80, 30);
        btn1.addActionListener(this);
        image.add(btn1);
        
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
        String formno="" + random;
        String name=nametf.getText();
        String fname=fnametf.getText();
        String dob=((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
        }
        String email=emailtf.getText();
        String maritial_status=null;
        if(married.isSelected()){
            maritial_status="Married";
        }
        else if(unmarried.isSelected()){
            maritial_status="Unmarried";
        }
        
        String address=addtf.getText();
        String city=citytf.getText();
        String state=statetf.getText();
        String pincode=pintf.getText();
        
        try{
            if(name.equals("")||fname.equals("")||dob.equals("")||gender.equals("")||maritial_status.equals("")||email.equals("")||address.equals("")||city.equals("")||state.equals("")||pincode.equals("")){
                JOptionPane.showMessageDialog(null,"All Fields are Required");
            }
            else{
                Conn c=new Conn();
                String query="insert into signup1 values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+maritial_status+"', '"+email+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo().setVisible(true);
            
            }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    
    }
    public static void main(String ar[]){
        new SignupOne();
    }
    
}
