package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User>{ // T를 사용함으로써 User 클래스를 사용하게 될때 제네릭 타입 매개변수를 이용할 수 있게 된다.
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
