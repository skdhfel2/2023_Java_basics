package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
            // System.out.println(3 / 0);

            int[] arr = new int[3];
            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int) obj);

//            String s = null;
//            System.out.println(s.toLowerCase());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // 두개의 에러 사항을 해결하는 코드
            System.out.println("뭔가 실수 하셨네요.");
        //} catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println("뭔가 실수 하셨네요.");
        } catch (ClassCastException e) { // "ClassCastException" 이 에러가 뜨는 예외코드를 해결함
            System.out.println("잘못된 형 변환입니다.");
        } catch (Exception e) { // "Exception"은 대부분의 예외사항들을 처리한다
            System.out.println("그 외의 모든 에러는 여기서 처리가 돼요.");
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
