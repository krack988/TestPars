import javax.swing.*;
import java.awt.*;

public class CoursWindow extends JFrame{


    private JPanel panel;
    private JLabel labelUSD,labelEUR,labelRUB,labelOther;
    private JButton button;

    public CoursWindow (){
       super("Money");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,150);
        panel=new JPanel();
        panel.setLayout(new GridLayout(5,1));

        labelUSD=new JLabel("TEST USD");
        labelEUR=new JLabel("TEST EUR");
        labelRUB=new JLabel("TEST RUB");
        labelOther=new JLabel("TEST");
        labelOther.setVisible(false);
        button=new JButton("Click");

        panel.add(labelUSD);
        panel.add(labelEUR);
        panel.add(labelRUB);
        panel.add(labelOther);
        panel.add(button);


        this.add(panel);
    }

}
