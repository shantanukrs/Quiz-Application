package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    
    Login() {  //constructor
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);  //setBounds is used to make our own layout 
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");  //JLabel is used to write anything in our frame
        heading.setBounds(750, 60, 300, 45); //this will help to display at which position should simple minds should display
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);    // setForeground is used to set the color of the fonts
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");  //JLabel is used to write anything in our frame
        name.setBounds(810, 150, 300, 20); //this will help to display at which position should simple minds should display
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(Color.BLUE);    // setForeground is used to set the color of the fonts
        add(name);
        
        tfname = new JTextField();    //JTextField is used to make the box
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);  //it will set the size of the frame
        setLocation(200, 150);  // it will give the location from left and top side
        
        setVisible(true);  //frame bydefault is hidden so frame ko dekhne ke liye setvisible ko true rakhe hai 
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource() == back){
            setVisible(false);  //this one is used because if we click on the back button then the frame will get closed
        }
        
    }
    
    public static void main(String[] args){
        new Login();
    }
    
}
