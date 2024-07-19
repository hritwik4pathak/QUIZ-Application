
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SCORE extends JFrame implements ActionListener {
SCORE(String name, int SCORE){
    setBounds(450,160,800,600);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);

    ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/score new.png"));
    Image i2= i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0,200,300,350);
    add(image);


    JLabel HEADING= new JLabel("Thankyou "+ name+" for playing java quiz");
    HEADING.setBounds(45,30,700,30);
    HEADING.setFont(new Font("Tahoma",Font.PLAIN,26));
    add(HEADING);

    JLabel Score= new JLabel("Your score is "+ SCORE);
    Score.setBounds(350,200,300,30);
    Score.setFont(new Font("Tahoma",Font.PLAIN,26));
    add(Score);


    JButton SUBMIT= new JButton("Play Again");
    SUBMIT.setBounds(350,270,220,50);
    SUBMIT.setFont(new Font("dialog",Font.PLAIN,22));
    SUBMIT.addActionListener(this);

    add(SUBMIT);


    setVisible(true);

}
public void actionPerformed(ActionEvent ae){
    setVisible(false);
    new Login();

}

    public static void main (String[]args){
    new SCORE("user",0);


    }
}
