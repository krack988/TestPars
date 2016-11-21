import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CoursWindow extends JFrame implements ActionListener{

    private Map<String,String> viewCours=new HashMap<>();
    private JPanel panel;
    private JLabel labelUSD=new JLabel("TEST USD");
    private JLabel labelEUR=new JLabel("TEST EUR");
    private JLabel labelRUB=new JLabel("TEST RUB");
    private JLabel labelOther=new JLabel("Введите другую валюту (DKK,PLN)");
    private JTextField otherCours;
    private JButton button;
    private JProgressBar progressBar=new JProgressBar();
    private Date date;
    private SimpleDateFormat dateFormat;

    public CoursWindow (){
       super("Money");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(380,150);

        date=new Date();
        dateFormat=new SimpleDateFormat("dd.MM.yyyy hh:mm");

        panel=new JPanel();
        panel.setLayout(new GridLayout(7,1));

//        labelOther.setVisible(false);
        otherCours=new JTextField();
//        progressBar.setVisible(false);
//        progressBar.setIndeterminate(true);
//        progressBar.setStringPainted(true);
//        progressBar.setMinimum(0);
//        progressBar.setMaximum(100);
        button=new JButton("Click");
        button.addActionListener(this);

        panel.add(labelUSD);
        panel.add(labelEUR);
        panel.add(labelRUB);
        panel.add(labelOther);
        panel.add(otherCours);
        panel.add(progressBar);
        panel.add(button);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"Hello!!!","message",JOptionPane.PLAIN_MESSAGE);
        viewCours=ParsPage.getInstance().parsPage();
        labelUSD.setText("Курс доллара на "+ dateFormat.format(date)+" : "+ viewCours.get("USD"));
        labelEUR.setText("Курс евро на "+ dateFormat.format(date)+" : "+ viewCours.get("EUR"));
        labelRUB.setText("Курс российского рубля на "+ dateFormat.format(date)+" : "+ viewCours.get("RUB"));

    }

}

