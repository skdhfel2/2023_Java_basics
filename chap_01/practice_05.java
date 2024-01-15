package chap_01;

import java.util.Scanner;

//성적 평균 계산기:
//여러 명의 학생들의 성적을 입력받아 평균 성적을 계산하는 프로그램을 작성하세요.
public class practice_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGrade = 0;
        System.out.print("학생 수를 알려주세요 : ");
        int studentCount = scanner.nextInt();

        for (int i = 1; i <= studentCount; i++){
            System.out.print("학생" + i + "의 성적을 입력하세요 : ");
            double grade = scanner.nextDouble();
            totalGrade += grade;
        }
        double average = totalGrade / studentCount;
        System.out.println(studentCount + "명의 학생들의 평균은 :" + average + "입니다.");



    }
}
