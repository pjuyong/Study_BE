package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요 : ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요 : ");
        int month = sc.nextInt();

        printCalendar(year, month);

    }

    public static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1); // 해당 월의 첫번째 날
        LocalDate firstDayofNextMonth = firstDayOfMonth.plusMonths(1); // 해당 월의 다음 달

        int offSet = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("SU MO TU WE TH FR SA  ");

        for(int i=0; i<offSet; i++) {
            System.out.print("   ");
        }

        LocalDate dateIterator = firstDayOfMonth;
        while(dateIterator.isBefore(firstDayofNextMonth)) {
            System.out.printf("%2d ", dateIterator.getDayOfMonth());
            if(dateIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dateIterator = dateIterator.plusDays(1);
        }
    }
}
