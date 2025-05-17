package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    
    JButton login, Clear, Signup;
    JTextField CardTextField;
    JPasswordField PinTextField;
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        add(label);
        label.setBounds(70,10,100,100);
        
        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font( "Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel CardText = new JLabel("Card No:");
        CardText.setFont(new Font( "Reilway", Font.BOLD, 28));
        CardText.setBounds(120, 150, 230, 30);
        add(CardText);
        
        CardTextField = new JTextField();
        CardTextField.setBounds(300, 150, 230, 30);
        CardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(CardTextField);
        
        JLabel PinText = new JLabel("Pin:");
        PinText.setFont(new Font( "Reilway", Font.BOLD, 28));
        PinText.setBounds(120, 220, 230, 30);
        add(PinText);
        
        PinTextField = new JPasswordField();
        PinTextField.setBounds(300, 220, 230, 30);
        PinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(PinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        Clear = new JButton("CLEAR");
        Clear.setBounds(430, 300, 100, 30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);
        add(Clear);
        
        Signup = new JButton("SIGN UP");
        Signup.setBounds(300, 350, 230, 30);
        Signup.setBackground(Color.BLACK);
        Signup.setForeground(Color.WHITE);
        Signup.addActionListener(this);
        add(Signup);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
       if (ae.getSource()== Clear){
           CardTextField.setText("");
           PinTextField.setText("");
          
       } else if(ae.getSource() == login){
           Conn c = new Conn();
           String cardnumber = CardTextField.getText();
           String pinnumber = PinTextField.getText();
           String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"' ";
           try {
               ResultSet rs =  c.s.executeQuery(query);
               if (rs.next()){ 
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
               } else {
                   JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin !");
               }
               
               
           } catch (Exception e){
               System.out.println(e);
               
           }
           
           
           
            
       } else if (ae.getSource()== Signup){
           setVisible(false);
           new SignupOne().setVisible(true);
       }
        
    }
    
    public static void main(String[] args ){
         new Login();
         
    }
   
    
}
