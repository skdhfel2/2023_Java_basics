package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성

        // Arrays.stream :
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores); // Arrays.stream(scores) 이 코드에 Ctrl + Alt + V 누르면 이렇게 자동완성 된다.

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs); // "langs"를 스트림으로 변형시키고 스트림에는 문자열을 포함시킨다 그 스트림의 이름을 "langStream"으로 정의 한다.
        // Arrays.stream(langs) : 이 부분은 배열인 langs를 스트림으로 변환하는 부분입니다. 스트림으로 변환하면 스트림 API를 사용하여 배열의 요소를 조작하고 처리할 수 있습니다.
        // 스트림은 데이터를 처리하고 조작하는데 사용되는 객체다.
        // Collection.stream()
        List<String> langList = new ArrayList<>(); // ArrayList 클래스에서 String 타입인 LangList 객체를 만든다.
        // langList.add("python");
        // langList.add("java");

        // 배열 : 크기 조절 불가능
        // 리스트 : 크기 조절 가능 -> 리스트 추가 삭제 가능

        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#"); // List를 Arrays(배열)로 변경
        // System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");
        // Stream.of을 사용해서 요소들을 스트림으로 변환시킨다.

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip , ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90 점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("----------------------------");

        // 90 점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("----------------------------");

        // 90 점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("----------------------------");

        // 90 점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("----------------------------");

        // "python", "java", "javascript", "c", "c++", "c#"
        // c 로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("----------------------------");

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("----------------------------");

        // 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("----------------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("----------------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("----------------------------");

        // 3글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 3)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("----------------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + " (어려워요)")
                .forEach(System.out::println);
        System.out.println("----------------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("----------------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStartsWithC.stream().forEach(System.out::println);
    }
}
