package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date now = new Date();
        System.out.println();
        System.out.println("Now: " + sdf.format(now));
        System.out.println();

        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        int day = cal.get(Calendar.DAY_OF_WEEK); // pegando dia
        int month = 1 + cal.get(Calendar.MONTH); // pegando mes
        int year = cal.get(Calendar.YEAR); // pegando ano
        int hour = cal.get(Calendar.HOUR); // pegando a hora
        int minutes = cal.get(Calendar.MINUTE); // pegando minutos
        int segundos = cal.get(Calendar.SECOND); // pegando segundos
        int millis = cal.get(Calendar.SECOND); // pegando milisegundos

        System.out.println("Dia: " + day);
        System.out.println("Mes: " + month);
        System.out.println("Ano: " + year);
        System.out.println();
        System.out.println("Horas: " + hour);
        System.out.println("Minutos: " + minutes);
        System.out.println("Segundos: " + segundos);
        System.out.println("Mili segundos: " + millis);
        System.out.println();
        System.out.println(
                "Dia " + day + " do " + month + " de " + year + " às " + hour + "H" + minutes + "M" + segundos + "S");
        System.out.println();
        System.out.println("----------------------------------------------");
        // Aumentando 4 horas do horário atual
        cal.add(Calendar.HOUR_OF_DAY, 4);
        now = cal.getTime();

        day = cal.get(Calendar.DAY_OF_WEEK); // pegando dia
        month = 1 + cal.get(Calendar.MONTH); // pegando mes
        year = cal.get(Calendar.YEAR); // pegando ano
        hour = cal.get(Calendar.HOUR); // pegando a hora
        minutes = cal.get(Calendar.MINUTE); // pegando minutos
        millis = cal.get(Calendar.SECOND); // pegando mili segundos

        System.out.println();
        System.out.println("Now format: " + sdf.format(now));
        System.out.println();
        System.out.println("Dia: " + day);
        System.out.println("Mes: " + month);
        System.out.println("Ano: " + year);
        System.out.println();
        System.out.println("Horas: " + hour);
        System.out.println("Minutos: " + minutes);
        System.out.println("Segundos: " + segundos);
        System.out.println("Mili segundos: " + millis);
        System.out.println();

        System.out.println(
                "Dia " + day + " do " + month + " de " + year + " às " + hour + "H" + minutes + "M" + segundos + "S");
    }
}