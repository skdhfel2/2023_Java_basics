package chap_01;

import java.util.Scanner;

//원의 넓이 계산기:
//반지름을 입력받아 원의 넓이를 계산하는 프로그램을 작성하세요. 원의 넓이는 다음과 같이 계산됩니다: π * r^2.
public class practice_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("반지름 : ");
        double b = scanner.nextDouble();
        double S = result(b);
        System.out.println("원의 넓이 : " + S);
    }
    private static Double result(Double b){
        return Math.PI * Math.pow(b,2);
    }
}
