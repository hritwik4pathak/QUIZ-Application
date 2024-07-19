import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login  extends JFrame implements ActionListener {


    //to set frame

    JButton rules,exit;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/login new.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,400,400);
        add(image);

        //1st heading
        JLabel heading= new JLabel("JAVA QUIZ");
        heading.setBounds(550,30,600,150);
        heading.setFont(new Font("Bahnschrift",Font.BOLD,50));
        heading.setForeground(Color.pink);
        add(heading);


        //2nd heading
        JLabel name= new JLabel("ENTER YOUR NAME");
        name.setBounds(550,50,600,250);
        name.setFont(new Font("Bahnschrift",Font.BOLD,10));
        name.setForeground(Color.blue);


        tfname= new JTextField();
        tfname.setBounds(550,180,250,20);
        tfname.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
        add(tfname);

         rules = new JButton("RULLES");
        rules.setBounds(500,250,150,30);
        rules.setForeground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);

         exit= new JButton("EXIT");
        exit.setBounds(700,250,150,30);
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        add(exit);




       setSize(1000,400);
       setLocation(300,100);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new RULES(name);

        }else if (ae.getSource() == exit){
            setVisible(false);

        }

    }

    public static void main (String[]args) {
        new Login();
    }
}
