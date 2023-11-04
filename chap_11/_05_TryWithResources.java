package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null; // "MyFileWriter"클래스에서 "writer1"변수에 "null"을 넣는다.
        try { // 이처럼 try문 중괄호 안에서 클래스 객체(writer1)를 만들면 close 메서드를 사용하기 위해서는 따로 호출을 해줘야 하기 때문에 무조건 실행 할수 있는 finally문에서 close메서드를 호출 해줘야 한다.
            writer1 = new MyFileWriter(); // "MyFileWriter"클래스에서 새로운 객체를 "writer1"안에 넣는다.
            writer1.write("아이스크림이 먹고 싶어요"); // 방금 만든 "writer1"객체에서 "write"메서드를 호출한다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close(); // close 메서드 호출
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("---------------------");

        try (MyFileWriter writer2 = new MyFileWriter()) { // 하지만 "MyFileWriter"클래스가 AutoCloseable(인터페이스)를 참조할때 try문 소괄호 안에서 클래스 객체(writer2)를 생성하면 try문이 끝날때 자동으로 close 메서드가 실행 된다.
            writer2.write("빵이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedWriter bw = null; // "BufferedWriter"클래스는 writer>Closeable>AutoCloseable을 참조하고 있기 때문에 "TryWithResources"문에서 "BufferedWriter"클래스를 사용하면 close 메서드를 자동호출 할수있다.
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
     public void close() throws Exception { // "AutoCloseable(인터페이스)"에서의 메서드이기 때문에 오버라이드 해서 이 클래스에서도 작성해야함
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void  write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }
}