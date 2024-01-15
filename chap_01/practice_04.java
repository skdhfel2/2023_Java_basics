package chap_01;

import java.util.Scanner;

//정수 연산 프로그램:
//두 정수를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈 연산을 수행하는 프로그램을 작성하세요. 나눗셈의 경우 몫과 나머지를 모두 출력하세요.
public class practice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("두 수의 합 : " + sum);
        int difference = num1 - num2;
        System.out.println("두 수의 차 : " + difference);
        int product = num1 * num2;
        System.out.println("두 수의 곱 : " + product);
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("두 수의 나눗셈-> 몫 : " + product + " 나머지 : " + remainder);
    }
}
