package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시"); // 예외 메세지
            // System.out.println("택시에 탑승한다.");
        } catch (Exception e) {
            System.out.println("!! 문제 발생 : " + e.getMessage()); // 예외 메세지를 가져온다.
        } finally { // 에러가 생기든 말든 마지막은 무조건 finally 메서드를 실행시킨다
            System.out.println("택시의 문을 닫는다.");
        }

        // try + catch(s) try 와 함께라면 catch 여러번 사용 가능
        // try + catch(s) + finally
        // try + finally

        System.out.println("-------------------");

        try {
            System.out.println(3 / 0);

        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
