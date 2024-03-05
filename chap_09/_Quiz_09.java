package chap_09;

// 유재석 파이썬
// 박명수 자바
// 김종국 자바
// 조세호 C
// 서장훈 파이썬

// 자바 자격증을 보유한 학생
// ---------------------
// 박명수
// 김종국

import java.util.ArrayList;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>(); // ArrayList 클래스에서 Student클래스의 객체들을 담은 새로운 list 객체를 생성
        list.add(new Student("유재석", "파이썬")); // Student 메서드 호출
        list.add(new Student("박명수", "자바")); // new를 사용하는 이유 : 각각의 정보가 다르기 때문에 구별하기 위해 새로운 객체를 생성 해야한다.
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("---------------------");
        for (Student student : list) { // list가 Student 클래스의 객체를 담고있기 때문에 student 변수를 생성할때 Student 클래스 타입을 받아야한다. 
            if (student.certification.equals("자바")) {
                System.out.println(student.name);
            }
        }
    }
}

class Student {
    public String name;
    public String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}
