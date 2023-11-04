package chap_11;
// 문제: 정수 배열을 생성하고 배열의 인덱스를 입력받아 해당 인덱스에 접근하는 프로그램을 작성하십시오. 입력된 인덱스가 배열의 범위를 벗어날 경우, ArrayIndexOutOfBoundsException 예외를 처리하여 "유효하지 않은 배열 인덱스입니다" 메시지를 출력하십시오.
// 배열 인덱스 예외 처리

import java.util.Scanner;

public class _11_test_03 {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5};

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("배열의 인덱스를 입력하세요 : ");
            int index = scanner.nextInt();

            if (index >= 0 && index < numbers.length){
                int value = numbers[index];
                System.out.println("배열 요소 : " + value );
            } else {
                System.out.println("유효하지 않은 배열 인덱스 입니다.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("유효하지 않은 배열 인덱스 입니다."); // 사실상 이 catch문은 실행이 안되지만 가독성과 만일의 사태를 대비해 작성한 코드이다.
        }

    }
}
