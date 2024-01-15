package chap_01.practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//날짜 차이 계산기:
//두 날짜를 입력받아 그 사이의 날짜 차이(일 수)를 계산하는 프로그램을 작성하세요.
public class practice_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 날짜를 입력하세요 (YYYY-MM-DD): ");
        String firstDateString = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateString);

        System.out.print("두번째 날짜를 입력하세요 : (YYYY-MM-DD) ");
        String secondDateString = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateString);

        Period period = Period.between(firstDate, secondDate);
        System.out.println("날짜 차이 : " + period.getYears() + "년" + period.getMonths() + "개월" + period.getDays() + "일");
        scanner.close();
    }
}
