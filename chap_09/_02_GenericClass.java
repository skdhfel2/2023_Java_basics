package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("---------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("---------------------");
        int c3Name = (int) c3.name; // "c3.name"은 object 타입 이기 때문에 int를 사용해서 형 변환 시켜야 한다.
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        // c4Name = (String) c3.name;
        System.out.println("---------------------");

        Coffee<Integer> c5 = new Coffee<>(35); // Coffee 클래스에서 int형인 c5객체를 생성하고 클래스의 매개변수에 35를 넣는다.
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("---------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동")); // "CoffeeByUser" 의 새로운 객체 c7에 "User"라는 매개변수를 넣고 "User"의 새로운 객체에 "강호동"이라는 매개변수를 넣는다.
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        System.out.println("---------------------");
        orderCoffee("김영철");
        orderCoffee(36);

        orderCoffee("김희철", "아메리카노");
        orderCoffee(37, "라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}