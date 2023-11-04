package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러 error, 예외 exception)

        try {
             System.out.println(3 / 0);

//            int[] arr = new int[3];
//            arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) { // 예외가 발생하면 실행
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage()); // 무슨 문제가 발생했는지 간결하게 나타내준다.
            e.printStackTrace(); // "catch"문을 사용할때 어디서 어떤 문제가 발생했는지 빨간색으로 출력해준다.
        }

        System.out.println("프로그램 정상 종료");
    }
}