import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class clock extends JFrame{
    public clock(){
        super("Clock");

        setSize(700,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flo = new FlowLayout();
        setLayout(flo);

        JPanel panel1 = new JPanel();
        panel1.setSize(50,50);

        add(panel1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        JLabel label3 = new JLabel(dtf.format(now));
        add(label3);

        setVisible(true); //needs to be last.

    }



    public static void main(String[] args){

            clock newClock = new clock();

    }
}
