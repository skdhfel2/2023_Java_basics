package chap_01;

import java.util.Scanner;

//BMI 계산기:
//사용자의 몸무게와 키를 입력받아 BMI(Body Mass Index)를 계산하는 프로그램을 작성하세요. BMI는 다음과 같이 계산됩니다: BMI = weight(kg) / (height(m) * height(m)).
public class practice_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몸무게를 입력하세요 : ");
        double weight = scanner.nextFloat();
        System.out.print("키를 입력하세요 : ");
        double height = scanner.nextFloat();
        double BMI = weight / height * height;
        System.out.println("당신의 BMI = " + BMI);
        BMICategory(BMI);
    }
    private static void BMICategory(double BMI){
        if (BMI < 18.5){
            System.out.println("저체중 입니다.");
        }
        else if (BMI < 24.9){
            System.out.println("정상 입니다.");
        }
        else if (BMI < 29.9){
            System.out.println("과체중 입니다.");
        }
        else{
            System.out.println("비만 입니다.");
        }


    }
}
