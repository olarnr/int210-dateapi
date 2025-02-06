package int210.dateapi.services;

import java.util.Date;

public class DateService {
    public static String getCurrentDate() {
        Date now = new Date();
        String humanReadable = now.toString();
        String timeStamp = Long.toString(now.getTime());

        return String.format("{\"humanReadable\": \"%s\", \"timeStamp\": \"%s\"}", humanReadable, timeStamp);
    }
}
