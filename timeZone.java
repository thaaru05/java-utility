import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class timeZone {
    private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";

    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        String dateInString = "05-06-2004 11:56:00 AM";
        Date date = formatter.parse(dateInString);
        System.out.println("Date (India) : " + formatter.format(date));

        SimpleDateFormat sdfAmerica = new SimpleDateFormat(DATE_FORMAT);
        TimeZone tzInAmerica = TimeZone.getTimeZone("America/New_York");
        sdfAmerica.setTimeZone(tzInAmerica);
        String sDateInAmerica = sdfAmerica.format(date); 
        Date dateInAmerica = formatter.parse(sDateInAmerica);
        System.out.println("Date (New York): " + formatter.format(dateInAmerica));

        SimpleDateFormat sdfLondon = new SimpleDateFormat(DATE_FORMAT);
        TimeZone tzLondon = TimeZone.getTimeZone("GMT");
        sdfLondon.setTimeZone(tzLondon);
        String sDateInLondon =sdfLondon.format(date);
        Date dateInLondon=formatter.parse(sDateInLondon);
        System.out.println("Date (London) : "+formatter.format(dateInLondon));

        SimpleDateFormat sdfTokyo = new SimpleDateFormat(DATE_FORMAT);
        TimeZone tzTokyo = TimeZone.getTimeZone("JST");
        sdfTokyo.setTimeZone(tzTokyo);
        String sDateInTokyo = sdfTokyo.format(date);
        Date dateInTokyo = formatter.parse(sDateInTokyo);
        System.out.println("Date (Tokyo) : "+formatter.format(dateInTokyo));

        SimpleDateFormat sdfSydney = new SimpleDateFormat(DATE_FORMAT);
        TimeZone tzSydney = TimeZone.getTimeZone("AEST");
        sdfSydney.setTimeZone(tzSydney);
        String sDateInSydney = sdfSydney.format(date);
        Date dateInSydney = formatter.parse(sDateInSydney);
        System.out.println("Date (Sydney) : "+formatter.format(dateInSydney));
    }
   
}


