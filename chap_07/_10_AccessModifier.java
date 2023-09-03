package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation) : 데이터와 해당 데이터를 다루는 코드를 하나의 단위로 묶어 외부로부터의 접근을 제한하고, 데이터의 보안과 무결성을 보장하는 OOP의 핵심 개념 중 하나입니다
        // 정보은닉 (Information hiding) : 객체에서 허용한 메소드를 통해서만 접근가능하게 하는것

        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능
        // ctrl + c -> ctrl + r = 코드안에 동일한 문자 원하는 문자로 한번에 변경가능
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.setPrice(200000);
        b1.color = "블랙";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("-------------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
