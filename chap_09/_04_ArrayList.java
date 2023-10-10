package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>(); // "ArrayList" 클래스에서 String 타입인 list 객체를 만든다.

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0)); // 0번째 배열값 가져오기
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-------------------");

        // 삭제 (박명수씨가 이사)
        System.out.println("신청 학생 수 (이사 전) : " + list.size()); // 5, list에 몇명 있는지 출력
        list.remove("박명수"); // "박명수" 리스트에서 제거
        System.out.println("신청 학생 수 (이사 후) : " + list.size()); // 4
        System.out.println(list.get(3)); // "박명수" 제거 돼서 "강호동"이 3번쨰 배열이 됨.

        System.out.println("-------------------");

        System.out.println("남은 학생 수 (제외 전) : " + list.size()); // 4
        list.remove(list.size() - 1); // 마지막 배열인 "강호동"이 삭제 됨.
        System.out.println("남은 학생 수 (제외 후) : " + list.size()); // 3

        System.out.println("-------------------");

        // 순회
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        // 변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "이수근"); // 0번째 배열 값을 "이수근"으로 변경 한다.
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("-------------------");

        // 확인
        System.out.println(list.indexOf("김종국")); // "김종국"이 몇번째 인덱스인지 확인
        // 선착순 5명 내에 포함되었는가?
        if (list.contains("김종국")) { // "김종국"이 "list"에 포함 되어 있다면
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("-------------------");

        // 전체 삭제
        list.clear(); // "list" 전부 삭제
        if (list.isEmpty()) { // "list"가 비어있다면
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-------------------");

        // 다음 학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 정렬
        Collections.sort(list); // "list"를 "가, 나, 다" 순서대로 정렬
        for (String s : list) {
            System.out.println(s);
        }
    }
}
