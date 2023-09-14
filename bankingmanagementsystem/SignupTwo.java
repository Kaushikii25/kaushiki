package bankingmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField pantf,anumtf;
    JButton btn2;
    JRadioButton Yes,No,Yes1,No1;
    JComboBox religion,category1,income1,education1,occupation1;
    
    
    
    SignupTwo(){
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("New folder/bankicon.jpg"));
        Image i2=i1.getImage().getScaledInstance(840,765,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,840,765);
        add(image);
        
        setTitle("NEW APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails=new JLabel("PAGE 2. ADDITIONAL DETAILS ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,30));
        additionalDetails.setBounds(200,60,600,35);
        additionalDetails.setForeground( Color.WHITE);
        image.add(additionalDetails);
        
        JLabel nationality=new JLabel("Nationality:");
        nationality.setFont(new Font("Raleway",Font.BOLD,19));
        nationality.setBounds(100,150,140,35);
        nationality.setForeground( Color.WHITE);
        image.add(nationality);
        
        String valnationality[]={"Afghan","Albanian","Algerian","American","Bahamian","Bahraini","Bangladeshi","Barbadian","Cambodian","Cameroonian","Canadian","Cape Verdean","Danish","Djiboutian","English","French","Greek","Hungarian","Indian","Indonesian","Japanese","Kuwaiti","Latvian","Macanese","Nigerian","Omani","Pakistani","Qatari","Russian","Saudi Arabian","Turkish","Ukrainian","Vietnamese","Welsh","Yemini","Zambian"};
        religion=new JComboBox(valnationality);
        religion.setBounds(300,155,400,25);
        religion.setBackground(Color.WHITE);
        image.add(religion);
        
        JLabel category=new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,19));
        category.setBounds(100,200,300,35);
        category.setForeground(Color.WHITE);
        image.add(category);
        
        String valcategory[]={"General","OBC","SC","ST","Other"};
        category1=new JComboBox(valcategory);
        category1.setBounds(300,205,400,25);
        category1.setBackground(Color.WHITE);
        image.add(category1);
        
        JLabel income=new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,19));
        income.setBounds(100,250,300,35);
        income.setForeground( Color.WHITE);
        image.add(income);
        
        String valincome[]={"null","<1,00,000","<2,50,000","<4,00,000","<4,50,000","<5,00,000","upto 10,00,000"}; 
        income1=new JComboBox(valincome);
        income1.setBounds(300,255,400,25);
        income1.setBackground(Color.WHITE);
        image.add(income1);
        
        
        JLabel education=new JLabel("Education ");
        education.setFont(new Font("Raleway",Font.BOLD,19));
        education.setBounds(100,300,300,25);
        education.setForeground( Color.WHITE);
        image.add(education);
        
        JLabel qualification=new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,19));
        qualification.setBounds(100,320,300,35);
        qualification.setForeground( Color.WHITE);
        image.add(qualification);
        
        String valedu[]={"Non-Graduate","Graduate","Post-Graduate","Diploma"}; 
        education1=new JComboBox(valedu);
        education1.setBounds(300,320,400,25);
        education1.setBackground(Color.WHITE);
        education1.setForeground( Color.BLACK);
        image.add(education1);
        
        
        JLabel occupation=new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,19));
        occupation.setBounds(100,390,300,35);
        occupation.setForeground( Color.WHITE);
        image.add(occupation);
        
        String valoccup[]={"Salaried","Non-salaried","Self-employed","student","Retired"}; 
        occupation1=new JComboBox(valoccup);
        occupation1.setBounds(300,400,400,25);
        occupation1.setBackground(Color.WHITE);
        image.add(occupation1);
        
        
        JLabel pan=new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,19));
        pan.setBounds(100,450,300,35);
        pan.setForeground( Color.WHITE);
        image.add(pan);
        
        pantf=new JTextField();
        pantf.setFont(new Font("Raleway",Font.BOLD,14));
        pantf.setBounds(300,455,400,25);
        image.add(pantf);
        
        JLabel anum=new JLabel("Aadhar Number:");
        anum.setFont(new Font("Raleway",Font.BOLD,19));
        anum.setBounds(100,500,300,35);
        anum.setForeground( Color.WHITE);
        image.add(anum);
        
        anumtf=new JTextField();
        anumtf.setFont(new Font("Raleway",Font.BOLD,14));
        anumtf.setBounds(300,505,400,25);
        image.add(anumtf);
        
        JLabel disable=new JLabel("Any Disability:");
        disable.setFont(new Font("Raleway",Font.BOLD,19));
        disable.setBounds(100,550,300,35);
        disable.setForeground( Color.WHITE);
        image.add(disable);
        
        Yes=new JRadioButton("Yes");
        Yes.setBounds(300,550,100,30);
        Yes.setBackground(Color.WHITE);
        image.add(Yes);
        
        No=new JRadioButton("No");
        No.setBounds(450,550,100,30);
        No.setBackground(Color.WHITE);
        image.add(No);
        
        ButtonGroup disablegroup=new ButtonGroup();
        disablegroup.add(Yes);
        disablegroup.add(No);
        
        JLabel eacc=new JLabel("Existing Account:");
        eacc.setFont(new Font("Raleway",Font.BOLD,19));
        eacc.setBounds(100,600,300,35);
        eacc.setForeground( Color.WHITE);
        image.add(eacc);
        
        Yes1=new JRadioButton("Yes");
        Yes1.setBounds(300,600,100,35);
        Yes1.setBackground(Color.WHITE);
        image.add(Yes1);
        
        No1=new JRadioButton("No");
        No1.setBounds(450,600,100,35);
        No1.setBackground(Color.WHITE);
        image.add(No1);
        
        ButtonGroup accountgroup=new ButtonGroup();
        accountgroup.add(Yes1);
        accountgroup.add(No1);
        
        btn2=new JButton("Next");
        btn2.setBackground(Color.WHITE);
        btn2.setForeground(Color.BLACK);
        btn2.setFont(new Font("Raleway",Font.BOLD,15));
        btn2.setBounds(620, 660, 80, 30);
        btn2.addActionListener(this);
        image.add(btn2);
        
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
        String snationality=(String) religion.getSelectedItem();
        String scategory1=(String) category1.getSelectedItem();
        String sincome=(String) income1.getSelectedItem();
        String seducation=(String) education1.getSelectedItem();
        String soccupation=(String) occupation1.getSelectedItem();
        String sdisability=null;
        if(Yes.isSelected()){
            sdisability="Yes";
        }
        else if(No.isSelected()){
            sdisability="No";
        }
        
        String existingacc=null;
        if(Yes1.isSelected()){
            existingacc="Yes";
        }
        else if(No1.isSelected()){
            existingacc="No";
        }
        
        String pannum=pantf.getText();
        String aadharnum=anumtf.getText();        
        try{
            Conn c=new Conn();
            String query="insert into signup2 values( '"+snationality+"', '"+scategory1+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+sdisability+"', '"+existingacc+"', '"+pannum+"', '"+aadharnum+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupThree().setVisible(true);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    
    }
    public static void main(String ar[]){
        new SignupTwo();
    }
    
}

    

