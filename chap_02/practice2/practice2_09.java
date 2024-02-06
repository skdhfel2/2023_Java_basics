package chap_02.practice2;

import chap_08.camera.SpeedCam;

import java.util.Scanner;

// 논리 연산자를 활용한 프로그램:
// 사용자로부터 세 개의 논리값을 입력받아, 이들을 조합하여 다양한 논리식을 만들어 결과를 출력하는 프로그램을 작성하세요.
public class practice2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 논리값을 입력하세요 (ture / false) : ");
        boolean x = scanner.nextBoolean();
        System.out.print("두번째 논리값을 입력하세요 (ture / false) : ");
        boolean y = scanner.nextBoolean();
        System.out.print("세번째 논리값을 입력하세요 (ture / false) : ");
        boolean z = scanner.nextBoolean();

        boolean result1 = (x && y && z);
        boolean result2 = (x || y || z);
        boolean result3 = !x;
        System.out.println("x, y, z 논리값의 AND 결과 : " + result1);
        System.out.println("x, y, z 논리값의 OR 결과: " + result2);
        System.out.println("x 논리값의 NOT 결과 : " + result1);



    }
    }

