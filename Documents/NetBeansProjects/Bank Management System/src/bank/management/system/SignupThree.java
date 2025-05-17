package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton at1, at2, at3, at4;
    JCheckBox c1, c2, c3, c4, c5 ,c6 , c7;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno){
        
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        
        JLabel accountDetails = new JLabel("Page 2: Account Details");
        accountDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        accountDetails.setBounds(280, 40, 400, 40);
        add(accountDetails);
        
        JLabel accountType = new JLabel("Account Type:");
        accountType.setFont(new Font("Raleway", Font.BOLD, 22));
        accountType.setBounds(100, 140, 200, 30);
        add(accountType);
        
        at1 = new JRadioButton("Saving Account");
        at1.setFont(new Font("Raleway", Font.BOLD, 16));
        at1.setBackground(Color.WHITE);
        at1.setBounds(100, 180, 250, 20);
        add(at1);
        
        at2 = new JRadioButton("Fixed Deposit Account");
        at2.setFont(new Font("Raleway", Font.BOLD, 16));
        at2.setBackground(Color.WHITE);
        at2.setBounds(350, 180, 250, 20);
        add(at2);
        
        at3 = new JRadioButton("Current Account");
        at3.setFont(new Font("Raleway", Font.BOLD, 16));
        at3.setBackground(Color.WHITE);
        at3.setBounds(100, 220, 250, 20);
        add(at3);
        
        at4 = new JRadioButton("Recurring Deposit Account");
        at4.setFont(new Font("Raleway", Font.BOLD, 16));
        at4.setBackground(Color.WHITE);
        at4.setBounds(350, 220, 250, 20);
        add(at4);
        
        
        ButtonGroup atgroup = new ButtonGroup();
        atgroup.add(at1);
        atgroup.add(at2);
        atgroup.add(at3);
        atgroup.add(at4);
        
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel cnumber = new JLabel("XXXX-XXXX-XXXX-4184");
        cnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        cnumber.setBounds(330, 300, 300, 30);
        add(cnumber);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);
        
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 400, 300, 20);
        add(pindetail);
        
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 400, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBackground(Color.WHITE);
        c1.setBounds(100,500, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("INTERNET BANKING");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBackground(Color.WHITE);
        c2.setBounds(350,500, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("MOBILE BANKING");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBackground(Color.WHITE);
        c3.setBounds(100,550, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL & SMS ALERTS");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBackground(Color.WHITE);
        c4.setBounds(350,550, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBackground(Color.WHITE);
        c5.setBounds(100,600, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E_STATEMENT");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBackground(Color.WHITE);
        c6.setBounds(350,600, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBackground(Color.WHITE);
        c7.setBounds(100,680, 600, 30);
        add(c7);
        
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
         
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 810);
        setLocation(350, 10);
        setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit) {
            String accountType = null;
            if(at1.isSelected()){
                accountType = "Saving Account";
            } else  if(at2.isSelected()){
                accountType = "Fixed Deposit Account";
            } else  if(at3.isSelected()){
                accountType = "Current Account";
            } else if(at4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber  = "" + Math.abs((random.nextLong() % 90000000L ) + 5040936000000000L );
             
            String pinnumber = "" + Math.abs((random.nextLong()% 9000L)+ 1000L);
            
            String services = "";
            if(c1.isSelected()){
                services = services + "ATM CARD";
            } else if(c2.isSelected()){
                services = services + "INTERNET BANKING";
            } else if(c3.isSelected()){
                services = services + "MOBILE BANKING";
            } else if(c4.isSelected()){
                services = services + "EMAIL & SMS ALERTS";
            } else if(c5.isSelected()){
                services = services + "CHEQUE BOOK";
            } else if(c6.isSelected()){
                services = services + "CHEQUE BOOK";
            } 
            
            try {
                if (accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else {
                    Conn c = new Conn();
                    String query1 = "insert into signupthree_db values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+services+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null,  "Your account is created !! \n Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                    
                     setVisible(false);
                     new Transactions(pinnumber).setVisible(false);
            
                } 
            } catch (Exception e) {
                System.out.println(e);
            }
            
        } else if (ae.getSource() == cancel) {
            
            setVisible(false);
            new Login().setVisible(true);
            
        }
       
    }
    
    public static void main(String args[]){
        new SignupThree("");
        
    }

   
    
}
