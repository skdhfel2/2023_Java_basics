package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기
        /*

        *****
        *****
        *****
        *****
        *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 별 (*) 왼쪽 삼각형 만들기
        /*

        *
        **
        ***
        ****
        *****

         */
        for (int i = 0; i < 5; i++) {
            // for (int j = 0; j < i + 1; j++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*"); // i랑 j가 같이 증가하니까 별은 차츰 많아짐
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 별 (*) 오른쪽 삼각형 만들기
        /*

             *
            **
           ***
          ****
         *****

         SSSS*
         SSS**
         SS***
         S****
         *****

         */
        for (int i = 0; i < 5; i++) { // i는 4까지 증가
            for (int j = 0; j < 4 - i; j++) { // i가 3일떄 까지 for문 이용 가능
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) { // i가 4일때 부터 for문 시작
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
