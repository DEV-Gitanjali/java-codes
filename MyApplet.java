import java.awt.*;
import java.applet.Applet;
import java.util.*;

public class MyApplet extends Applet implements Runnable {

    Thread t, t1;

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        t1 = Thread.currentThread();
        while (t1 == t) {
            repaint(); // Corrected method name from Repaint() to repaint()
            try {
                t1.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    public void paint(Graphics g) { // Corrected parameter name from G to g
        Calendar cal = new GregorianCalendar(); // Corrected class names from calender to Calendar and gregoriancalender to GregorianCalendar

        String hour = String.valueOf(cal.get(Calendar.HOUR)); // Corrected class name from Calender to Calendar
        String minute = String.valueOf(cal.get(Calendar.MINUTE)); // Corrected class name from Calender to Calendar
        String second = String.valueOf(cal.get(Calendar.SECOND)); // Corrected class name from Calender to Calendar

        g.drawString(hour + ":" + minute + ":" + second, 20, 30); // Corrected method name from drawing() to drawString()
    }
}
