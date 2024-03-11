package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식
        // (매개변수1, 매개변수2, ...) -> { 코드 }
    }

//    public void print() {
//        String s = "test";
//        System.out.println(s);
//    }
/* <람다식 특징>
- public(접근제어자) 필요 x
- 이름 필요 x => print 필요 x
- 람다식 내에서 return 할 일이 생기면 자동으로 return 해주기 때문에 return 값을 사용하지 않아도 된다.
- return 필요 x => void 필요 x
- public void print() => () -> { }
*/

//    () -> {
//        String s = "test";
//        System.out.println(s);
//    }

//    public void print(String s) {
//        System.out.println(s);
//    }

//    s -> System.out.println(s)
// "s"가 "String"이라는거는 알 수 있기 때문에 생략 가능
// 전달값(매개변수)가 1개 일때 "()괄호" 생략 가능
// 한문장 일때는 "{}중괄호" 제거 가능, ";세미콜론" 제거 가능

//    public int add(int x, int y) {
//        return x + y;
//    } // 한문장 일때 "return"이 포함되면 "{}중괄호" & "세미콜론"은 생략 불가능
        // 하지만 "람다식"에서는 "return"생략이 가능(선택사항이다)

//    (x, y) -> x + y
}
