package DateAndTime;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.util.Date;
import java.util.Set;

public class Dataa {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(LocalDate.of(2015,01,10));

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        Set<String> allZoneId = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneId);
        LocalDate initialDate = LocalDate.parse("2007-05-10");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println(finalDate);
        Date date=new Date();
        System.out.println(date);
        System.out.println();

        LocalDate today = LocalDate.now();
        LocalDate longestDay = today.with(LocalDate.ofYearDay(1999,28));
        System.out.println(Period.between(longestDay, today).getYears());
        System.out.println(Period.between(longestDay, today).getMonths());
        System.out.println(Period.between(longestDay, today).getDays());
        System.out.println(Period.between(longestDay, today).getUnits());

        Date s = new Date();

    }

}
