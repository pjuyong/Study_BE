package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] vlaues = ChronoUnit.values();
        for (ChronoUnit vlaue : vlaues) {
            System.out.println("values : " + vlaue);
        }

        System.out.println("ChronoUnit.HOURS : " + ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS Duration = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("DAYS : " + ChronoUnit.DAYS);
        System.out.println("ChronoUnit.DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds());

        // 차이 구하기
        LocalTime it1 = LocalTime.of(1,10,0);
        LocalTime it2 = LocalTime.of(1,20,0);

        long secondsBetween = ChronoUnit.SECONDS.between(it1, it2);
        System.out.println("secondsBetween : " + secondsBetween);

        long minutesBetween = ChronoUnit.MINUTES.between(it1, it2);
        System.out.println("minutesBetween : " + minutesBetween);


    }
}
