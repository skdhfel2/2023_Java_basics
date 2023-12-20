package chap_12.clean;

public class Room {
    public int number = 1;
    synchronized public void clean(String name) { // "synchronized"를 앞에 붙이면 여러곳에서 동시에 호출을 해도 먼저 호출된 곳에서 실행된 후에 결과값이 동기화 된 후에 다음 호출이 진행된다.
        // 직원1 : 3번방 청소 중
        System.out.println(name + " : " + number + "번방 청소 중");
        number++;
    }
}
