import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RULES extends JFrame implements ActionListener {
    String name;
    JButton BACK,START;
    RULES(String name){
        this.name= name;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading= new JLabel("WELCOME " + name + " TO JAVA QUIZ");
        heading.setBounds(80,50,600,30);
        heading.setFont(new Font("Bahnschrift",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules= new JLabel();
        rules.setBounds(20,100,600,350);
        rules.setFont(new Font("Bahnschrift",Font.BOLD,16));
        rules.setForeground(Color.black);
        rules.setText(
                "<html>"+
                "put any kind of rule you want to" + "<BR><BR>"+
                        "<html>"
        );
        add(rules);



        BACK= new JButton("BACK");
        BACK.setBounds(150,550,150,30);
        BACK.setForeground(Color.BLACK);
        BACK.addActionListener(this);
        add(BACK);

        START = new JButton("START");
        START.setBounds(350,550,150,30);
        START.setForeground(Color.BLACK);
        START.addActionListener(this);
        add(START);


        setSize(700,650);
        setLocation(400,150);
        setVisible(true);

    }
     public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == START){
            setVisible(false);
            new QUIZ(name);

        }else {
            setVisible(false);
            new Login();
        }
     }
    public static void main (String[]args){
        new RULES("user");


    }
}
