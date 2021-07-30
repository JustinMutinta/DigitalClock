import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class clock extends JFrame{
    JLabel timeLabel;               //making these global because the setTime() and clock () will use them both
    SimpleDateFormat timeFormat;    //SimpleDateFormat will be used to format how time variables are presented.
    SimpleDateFormat dayFormat;     //timeFormat will be for time, while day will specify which day it is.
    String time;                    //String values will hold the SimpleDateFormat information.
    String day;                     //This is important to separate the two because of the constant update of time.

    public clock(){
                                                    //Setting up the GUI
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //To close the window when X is clicked on.
        setTitle("Clock");                          //Title of the GUI
        setLayout(new FlowLayout());                //Automatically lays out what is placed in the Frame of the GUI
        setSize(500,110);               //Size of the GUI. Otherwise its super compressed
        getContentPane().setBackground(Color.BLACK);   // to change background color of JFrame to Black from Grey

        timeFormat = new SimpleDateFormat("HH:mm:ss a"); //Working on how the "Time" will show up.
        dayFormat = new SimpleDateFormat("EEEE");       //How the day will show up.

        timeLabel = new JLabel();                       //Inside the Frame, you need the Label to place the objects
        timeLabel.setFont(new Font("times roman plain",Font.BOLD,50)); //set Font and Size
        timeLabel.setBackground(Color.BLACK);           //Set Color of Label background.
        timeLabel.setForeground(Color.white);           //Set Color of Font. Keep in mind its "setForeground" not "setFont"
        timeLabel.setOpaque(true);                      //You need this line for the background color to show up.

        add(timeLabel);                             //adds the Label to the Frame.

        setVisible(true);                       //Sets the GUI to visible.

        setTime();                  //Runs the function below.
    }

    public void setTime(){   //This is for the time to move up in real time
        while(true){        //while the GUI is running
            time = timeFormat.format(Calendar.getInstance().getTime()); //Gets the current time, assigns to String 'time'
            day = dayFormat.format(Calendar.getInstance().getTime()); //Get the current day, assigns to String 'day'
            timeLabel.setText(day + " " + time);   //updates the Label to show day and time

            try {                           //attempts the following and if it doesn't work...has a 'catch' for it
                Thread.sleep(1000);  //pauses every 1000ms or 1 second before updating
            } catch (InterruptedException e) { //this is the catch in case the try does not work
                e.printStackTrace();        //prints the error of why the try did not work
            }
        }
    }





    public static void main(String[] args){
        clock newClock = new clock();
    }
}
