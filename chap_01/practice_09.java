package chap_01.practice;

import java.util.Scanner;

//데이터 형 변환 프로그램:
//정수와 실수 간의 형 변환을 수행하는 프로그램을 작성하세요.
public class practice_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt();
        System.out.print("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble();
        double convertedDouble = (double) intValue;
        int convertedInt = (int) doubleValue;
        System.out.println("실수를 정수로 변환 : " + convertedDouble);
        System.out.println("정수를 실수로 변환 : " + convertedInt);

    }
}
