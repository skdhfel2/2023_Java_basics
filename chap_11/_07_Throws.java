package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) { // try문에서 호출한 메서드를 통해 catch문에서 "IOException"메서드의 매개변수에 값을 넣는다.
            e.printStackTrace(); // 오류 나올떄 출력값으로 방금 넣은 매개변수가 나온다.
            System.out.println("메인 메소드에서 해결할게요.");
        }
    }

    public static void writeFile() throws IOException { // "IOException"메서드에서의 결과값을 "writeFile"메서드에 반환시킨다
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기에 실패했어요!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요.");
//        }

        FileWriter writer = new FileWriter("test.txt"); // "test.txt"는 파일 경로 이름이다.
        throw new IOException("파일 쓰기에 실패했어요!!"); // "catch"문의 "IOException"메서드에 매개변수로 넣는다.
    }
}
