package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        // converter.convert(2);

//      convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 1); // convertUSD(public void convert(int USD) {System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");, int USD)
//      함수형 인터페이스(FunctionalInterface)에서 메서드(convert)룰 사용하려면 람다식을 사용해야함.
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"); // convertible 변수에 USD 매개변수를 이용한 코드를 넣는다

        convertUSD(convertible, 2);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원"); // "c1" 객체에 들어있는 람다식에다가 "ConvertibleWithNoParams"함수형 인터페이스의 "convert"메서드 내용을 정의
        c1.convert(); // 인터페이스가 구현한 람다 표현식을 저장한 변수 "c1"을 호출하려면 인터페이스의 "convert"메서드를 호출한다.

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달값이 2개인 경우?
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 원"); // 이 람다식 내용은 인터페이스의 c2객체 속의 convert메서드 안에 들어가게 된다.
        c2.convert(10, 1400);

        // 반환값이 있는 경우?
        ConvertibleWithReturn c3 = (d, w) -> d * w; // "d * w"값은 자동으로 return(반환) 된다.
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + " 원");
    }

    public static void convertUSD(Convertible converter, int USD) { // Convertible(인터페이스 클래스)에서 "converter"객체를 매개변수로 받는다.
        converter.convert(USD); // "KRWConverter"클래스의 객체 "converter"에서 "USD"를 매개변수로 갖는 "convert"메서드를 호출한다.
    }
}


