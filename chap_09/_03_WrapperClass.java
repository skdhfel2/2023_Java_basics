package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스
        // int double float char

        Integer i = 123; // int i = 123;
        Double d = 1.0; // double d = 1.0;
        Character c = 'A'; // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("---------------");

        System.out.println(i.intValue()); // 'i'를 정수형으로 형 변환
        System.out.println(d.intValue()); // 'd'를 정수형으로 형 변환
        System.out.println(c.charValue()); // 'c'를 문자로 형 변환

        System.out.println("---------------");
        String s = i.toString(); // 'i'를 문자열로 형 변환
        System.out.println(s);
    }
}
