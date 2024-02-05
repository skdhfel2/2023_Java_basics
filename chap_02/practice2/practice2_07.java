package chap_02.practice2;

import java.util.Scanner;

// 비교 연산 프로그램:
// 사용자로부터 두 개의 숫자를 입력받아, 두 숫자가 같은지, 다른지를 비교하는 프로그램을 작성하세요.
public class practice2_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        double num1 = scanner.nextDouble();
        System.out.print("두번째 숫자를 입력하세요 : ");
        double num2 = scanner.nextDouble();
        boolean compare = (num1 == num2) ? true : false;
        if (compare){
            System.out.println("두 숫자는 같습니다.");
        }
        else{
            System.out.println("두 숫자는 서로 다릅니다.");
        }
    }
}
