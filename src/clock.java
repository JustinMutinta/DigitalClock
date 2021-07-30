import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class clock extends JFrame{
    //JFrame timeFrame;
    JLabel timeLabel;
    SimpleDateFormat timeFormat;
    String time;

    public clock(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Clock");
        setLayout(new FlowLayout());
        setSize(500,200);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timeLabel = new JLabel();

        add(timeLabel);





        setVisible(true);

        setTime();
    }

    public void setTime(){
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
        }
    }





    public static void main(String[] args){
        clock newClock = new clock();
    }
}
