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

    public static int checkPasswordStrength(String pw) {
        int length = pw.length();
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialChar = false;

        for (char pass : pw.toCharArray()) {
            if (Character.isUpperCase(pass)) {
                upperCase = true;
            } else if (Character.isLowerCase(pass)) {
                lowerCase = true;
            } else if (Character.isDigit(pass)) {
                digit = true;
            } else if (isSpecialChar(pass)) {
                specialChar = true;
            }
        }

            int strength = 0;
            if (length >= 8) {
                strength++;
            }
            if (upperCase) {
                strength++;
            }
            if (lowerCase) {
                strength++;
            }
            if (digit) {
                strength++;
            }
            if (specialChar) {
                strength++;
            }
            return strength;

        }



        public static boolean isSpecialChar(char pass){
            String specialChars = "!@#$%^&*()-=_+[]{}|;':\",.<>?/";
            return specialChars.contains(String.valueOf(pass));
        }
    }
