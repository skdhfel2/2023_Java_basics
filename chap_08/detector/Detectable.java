package chap_08.detector;

public interface Detectable {
    void detect(); // 감지

    // 인텊페이스 내에서 메서드가 만들어진다면 메서드 앞에 "public abstract"가 붙는다.
    // ex) public abstract void detect();

    // 인터페이스 내에서 변수가 만들어진다면 변수 앞에 "public Static final"이 붙는다.
    // ex) public Static final String name = "감지자"


}
