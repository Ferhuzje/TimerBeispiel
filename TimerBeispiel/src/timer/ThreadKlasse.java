package timer;

import java.util.Date;
import java.util.TimerTask;

public class ThreadKlasse extends TimerTask {

    @Override
    public void run() {
        System.out.println( new Date () );
        
    }


    
}
    

