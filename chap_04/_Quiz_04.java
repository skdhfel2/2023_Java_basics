package chap_04;

import java.util.Objects;
import java.util.Scanner;

public class Practice_remind {
    public static void main(String[] args) {

        // 일반 차량 5시간 주차 시 20000 원 ( 1시간에 4000원)
        // 경차 5시간 주차 시 10000 원 ( 1시간에 2000원)
        // 장애인 차량 10시간 주차 시 15000 원 ( 1시간에 1500원)

        // 실행결과 : 주차 요금은 xx 원입니다.

        String generalVehicle = "일반차량";
        String smallCar = "경차";
        String disabledPerson = "장애인 차량";
        Scanner scanner = new Scanner(System.in);
        System.out.print("일반차량/경차/장애인차량 이중 어디에 해당되시나요? : ");
        String category = scanner.nextLine();
        System.out.print("몇 시간 주차하실 예정이신가요? : ");
        int hour = scanner.nextInt();

        int fee = 0;
        if (Objects.equals(category, generalVehicle)){
            fee = hour * 4000;
        } else if (Objects.equals(category, smallCar)) {
            fee = hour * 2000;
        } else if (Objects.equals(category, disabledPerson)) {
            fee = hour * 1500;
        } else {
            System.out.println("다시 입력해주세요!");
            return;
        }
        System.out.println("--------------주차요금 정보--------------");
        System.out.println("차량 유형: " + category);
        System.out.println("주차 시간 : " + hour + "시간");
        System.out.println("주차 요금 : " + fee + "원");
    }
}
