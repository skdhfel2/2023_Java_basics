package chap_01;
//문자열 연결 프로그램:
//두 개의 문자열을 입력받아 이를 연결하고 결과를 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class practice_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 문자열을 입력하세요. : ");
        String firstString = scanner.nextLine();
        System.out.print("두번째 문자열을 입력하세요. : ");
        String secondString = scanner.nextLine();
        String concatenated = firstString.concat(secondString);
        System.out.println("연결된 문자열 : " + concatenated);
        scanner.close();
    }
}
