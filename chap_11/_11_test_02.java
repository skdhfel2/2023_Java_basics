package chap_11;
// 문제: 문자열 변수를 생성하지만 초기화하지 않고 해당 문자열의 길이를 출력하려는 프로그램을 작성하십시오.NullPointerException 예외를 처리하여 "문자열이 null입니다.유효한 문자열을 할당하세요" 메시지를 출력하십시오.
// NullPointerException 예외 처리:
public class _11_test_02 {
    public static void main(String[] args) {
        String str = null;

        try {
            int length = str.length();
            System.out.println("문자열 길이: " + length);
        } catch (NullPointerException e) {
            System.out.println("문자열이 null입니다. 유효한 문자열을 할당하세요.");
        }
    }
}
