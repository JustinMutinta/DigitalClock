import javax.swing.*;
import java.awt.*;

public class clock extends JFrame {
    public clock(){
        super("Clock");
        setLookAndFeel();
        setSize(700,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flo = new FlowLayout();
        setLayout(flo);

        JButton button1 = new JButton("Test");
        add(button1);

        JLabel label1 = new JLabel("Test Label1");
        JLabel label2 = new JLabel("Test label2");

        JPanel panel1 = new JPanel();
        panel1.setSize(50,50);
        panel1.add(label1);

        add(panel1);
        add(label2);


        setVisible(true); //needs to be last.

    }

    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception exc){
            //ignore error
        }
    }

    public static void main(String[] args) {
        clock newClock = new clock();
    }
}
