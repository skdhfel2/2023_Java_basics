package chap_11;

// 에러코드
// 0 (에러 없음), 1 (판매 시간 아님), 2 (매진)

// 0 인 경우? 상품 구매를 완료하였습니다.
// 1 인 경우? 상품 구매 가능 시간이 아닙니다. / 상품 구매는 20시부터 가능합니다.
// 2 인 경우? 해당 상품은 매진되었습니다. / 다음 기회에 이용해주세요.

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 2;
        try {
            if (errorCode == 0) {
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new SoldOutException("해당 상품은 매진되었습니다.");
            }
        } catch (NotOnSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class NotOnSaleException extends Exception {
    public NotOnSaleException(String message) {
        super(message); // 이걸 호출 함으로써 "Exception"클래스의 생성자가 호출되고 예외 객체를 생서하는 역할을한다.
        // 예외 객체를 초기화 하고 메시지 설정 -> 해당 예외가 어떻게 발생했는지 나타낼 수 있음.
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}