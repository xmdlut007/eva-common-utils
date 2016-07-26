import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 
 * @author qiuwenming
 * 
 * @since 2016-07-24 下午4:18:16
 */
public class DateUtils {

    public final static long ONE_DAY = 86400000;
    public static long getDayBeginTimeStamp() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    public static long getHourBeginTimeStamp(int lastHour) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) + lastHour);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    public static long getDayEndTimeStamp() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 24);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    public static String getCurrentDay() {
        return getCurrentDay("yyyy-MM-dd");
    }

    public static String getCurrentDay(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }

    public static String getSpecificDay(String format, long time) {
        return new SimpleDateFormat(format).format(new Date(time));
    }

    // 获取num天之前的数据
    public static String getInternalDay(int num) {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date().getTime() - num * ONE_DAY);
    }
}
