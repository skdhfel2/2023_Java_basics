package chap_09.coffee;

public class Coffee <T>{ // 클래스명 뒤에 "<T>" 붙이면 제네릭 클래스가 생성된다.
    public T name; // 클래스 Type 을 모르니까 T 사용

    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
