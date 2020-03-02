package DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datam {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd");
        String dateString = format.format(new Date());
        Date date = format.parse("2020-02-27");
        System.out.println(date);
        System.out.println(dateString);



    }
}
