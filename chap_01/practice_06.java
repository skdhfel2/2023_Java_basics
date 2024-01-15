package chap_01;

import java.util.Scanner;

//소수 판별기:
//정수를 입력받아 해당 숫자가 소수인지 아닌지를 판별하는 프로그램을 작성하세요.
public class practice_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scanner.nextInt();
        boolean isPrime = checkPrime(num);
        if (isPrime) {
            System.out.println(num + "는 소수 입니다.");
        } else {
            System.out.println(num + "는 소수가 아닙니다.");
        }
    }

    private static boolean checkPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

