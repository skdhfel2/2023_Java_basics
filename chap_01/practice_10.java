package chap_01.practice;

import java.util.Scanner;
//패스워드 강도 측정기:
//사용자에게 패스워드를 입력받아 패스워드의 강도를 측정하는 프로그램을 작성하세요. 여기서는 길이, 대문자, 소문자, 숫자, 특수문자 등을 고려할 수 있습니다.
public class practice_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요 : ");
        String pw = scanner.nextLine();
        int strength = checkPasswordStrength(pw);
        System.out.println("보안 강도 : " + strength);
    }
    public static int checkPasswordStrength(String pw){
        boolean length = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean number = false;
        boolean  specialCharacter = false;

        for(char pass : pw.toCharArray()){
            if (Character.isUpperCase(pass)){
                upperCase = true;
            }if (Character.isLowerCase(pass)){
                lowerCase = true;
            }if (Character.isUpperCase(pass)){
                upperCase = true;
            }if (Character.isUpperCase(pass)){
                upperCase = true;
            }



        }


        return 0;
    }
}
