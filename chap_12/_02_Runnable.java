package chap_12;

import chap_12.clean.CleanRunnable;
// Runnable: Runnable은 인터페이스이므로 클래스가 Runnable을 구현하도록 선택할 수 있습니다. 이것은 인터페이스 구현을 사용하는 방식입니다. 클래스가 이미 다른 클래스를 상속하고 있는 경우, 인터페이스 구현이 더 유연한 선택일 수 있습니다.
public class _02_Runnable {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable); // "thread"객체에 "cleanRunnable" 객체를 넣는다.
        thread.start(); // "start"메서드는 "thread"클래스의 메서드이기 때문에 반드시 "thread"를 통해서 호출해야 한다. 그래야 "run"메서드가 실행된다.

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
