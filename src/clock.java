import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class clock extends JFrame{
    //JFrame timeFrame;
    JLabel timeLabel;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    String time;
    String day;

    public clock(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Clock");
        setLayout(new FlowLayout());
        setSize(500,100);
        getContentPane().setBackground(Color.BLACK);   // to change background of JFram

        timeFormat = new SimpleDateFormat("HH:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("times roman plain",Font.BOLD,50));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        add(timeLabel);





        setVisible(true);

        setTime();
    }

    public void setTime(){
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            day = dayFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(day + " " + time);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }





    public static void main(String[] args){
        clock newClock = new clock();
    }
}
