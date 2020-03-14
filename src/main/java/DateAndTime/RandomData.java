package DateAndTime;

import java.time.LocalDateTime;
import java.time.Month;;
import java.util.Random;

public class RandomData {

    public static void ran() {
        Random random = new Random();
        for (int i = 1; i <= 60; i++) {
            Month month = Month.values()[random.nextInt(Month.values().length)];
            LocalDateTime ld = LocalDateTime.of(2020, month, random.nextInt(month.length(true)) + 1, random.nextInt(23), random.nextInt(59));
            System.out.println(ld.toLocalDate());
        }

    }

    public static void main(String[] args) {
        ran();
    }
}
