package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("04/03/2020");
        Date y2 = sdf2.parse("04/03/2020 09:35:05");
        Date y3 = Date.from(Instant.parse("2020-07-22T12:10:05Z"));
        Date now = new Date();
        Date nowMili = new Date(System.currentTimeMillis());

        System.out.println("Date sem formatar");
        System.out.println("First date: " + y1);
        System.out.println("Second date: " + y2);
        System.out.println("Date format ISO: " + y3);
        System.out.println("Now date: " + now);
        System.out.println("Now date millis: " + nowMili);
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("Date SDF2");
        System.out.println("First date: " + sdf2.format(y1));
        System.out.println("Second date: " + sdf2.format(y2));
        System.out.println("Date format ISO: " + sdf2.format(y3));
        System.out.println("Now date: " + sdf2.format(now));
        System.out.println("Now date millis: " + sdf2.format(nowMili));
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("Date SDF3");
        System.out.println("First date: " + sdf3.format(y1));
        System.out.println("Second date: " + sdf3.format(y2));
        System.out.println("Date format ISO: " + sdf3.format(y3));
        System.out.println("Now date: " + sdf3.format(now));
        System.out.println("Now date millis: " + sdf3.format(nowMili));
        System.out.println();

    }
}