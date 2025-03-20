package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowdt = LocalDateTime.now();
        LocalDateTime ofdt = LocalDateTime.of(2016,8,16,8,10,1);
        System.out.println("현재 날짜시간 : " + nowdt);
        System.out.println("지정 날짜시간 : " + ofdt);

        // 날짜 시간 분리
        LocalDate localDate = ofdt.toLocalDate();
        LocalTime localTime = ofdt.toLocalTime();
        System.out.println("localDate : " + localDate);
        System.out.println("localTime : " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime : " + localDateTime);

        // 계산(불변)
        LocalDateTime ofdtPlus = ofdt.plusDays(1000);
        System.out.println("지정 날짜시간 + 1000d : " + ofdtPlus);
        LocalDateTime ofdtPlustYear = ofdt.plusYears(1);
        System.out.println("지정 날짜시간 + 1y : " + ofdtPlustYear);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? : " + nowdt.isBefore(ofdt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? : " + nowdt.isAfter(ofdt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 같은가? : " + nowdt.isEqual(ofdt));

    }
}
