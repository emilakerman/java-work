
/* 
 * Modul 8
 * TimeStampRegister.java
 * Emil Åkerman
 * 2024-12-03
 * https://github.com/emilakerman/java-work
*/
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TimeStampRegister {
    private ArrayList<Date> timeStamps = new ArrayList<>();

    public void addTimeStamp() {
        var time = Calendar.getInstance().getTime();
        System.out.println("Adding timestamp: " + time);
        timeStamps.add(time);
    }

    public int getNumberOfStamps() {
        return timeStamps.size();
    }

    public long getTotalTime() {
        long total = 0;
        if (timeStamps.size() % 2 == 0) {
            for (int i = 0; i < timeStamps.size() - 1; i += 2) {
                total += timeStamps.get(i + 1).getTime() - timeStamps.get(i).getTime();
            }
        } else {
            for (int i = 0; i < timeStamps.size() - 2; i += 2) {
                total += timeStamps.get(i + 1).getTime() - timeStamps.get(i).getTime();
            }
            total += System.currentTimeMillis() - timeStamps.get(timeStamps.size() - 1).getTime();
        }
        System.out.println("Time stamps added: " + getNumberOfStamps() + ": " + getTimeStamps());
        return total;
    }

    public ArrayList<Date> getTimeStamps() {
        return timeStamps;
    }
}
