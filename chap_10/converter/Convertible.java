package chap_10.converter;

@FunctionalInterface // 이 "어노테이션"은  "함수형 인터페이스"를 시용할때 작성한다.
/* <함수형 인터페이스는 특징>

- 하나의 추상 메서드만 가질수 있다.
- 람다식을 활용하기 위한 목적으로 사용
*/
public interface Convertible {
    void convert(int USD);
}
