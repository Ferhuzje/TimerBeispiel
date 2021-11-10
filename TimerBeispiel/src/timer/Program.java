package timer;

import java.util.Timer;

public class Program {
    public static void main(String[] args) {
        ThreadKlasse thread = new ThreadKlasse();
        Timer timer = new Timer();
        timer.schedule(thread, 500, 100);
        

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         timer.cancel();
    }
}
