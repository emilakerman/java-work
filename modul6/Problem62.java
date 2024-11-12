import java.util.Calendar;
import java.util.Map;

/* 
 * Modul 6
 * Problem62.java
 * Emil Åkerman
 * 2024-11-08
*/
public class Problem62 {
    public static void main(String[] args) {
        Map<String, Object> thatMap = Map.of("dateOfBirth", Calendar.getInstance());
        Calendar calendar = (Calendar) thatMap.get("dateOfBirth");
        System.out.println(getDayOfWeekMonthYear(calendar));
    }

    public static String getDayOfWeekMonthYear(Calendar c) {
        StringBuilder sb = new StringBuilder();
        sb.append("Date:\n");
        sb.append(c.getTime()).append("\n");
        sb.append("Day of week:\n");
        sb.append(c.get(Calendar.DAY_OF_WEEK)).append("\n");
        sb.append("Day of month:\n");
        sb.append(c.get(Calendar.DAY_OF_MONTH)).append("\n");
        sb.append("Day of year:\n");
        sb.append(c.get(Calendar.DAY_OF_YEAR));
        return sb.toString();
    }
}