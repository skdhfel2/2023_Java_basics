package chap_02;
// 실행 결과
// 이름 : 나**
// 주민등록번호 : 990130-1******
// 전화번호 : 010-1234-****

// 힌트
// substring()
// length()
public class test {
    public static String getHiddenData(String data, int index) {
        String HiddenData = data.substring(0, index); // substring(0, index)는 문자열 data의 시작(인덱스 0)부터 index 이전까지의 부분 문자열을 추춣한다.
        for (int i = 0; i < data.length() - index; i++) {
            HiddenData += "*";

        }
        return HiddenData;
    }

    public static void main(String[] args) {

        String name = "나코딩"; // 이름
        String id = "990130-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // data 문자열 에서 index 숫자만큼 출력하게 만들고, data(전체 문자열) - index(출력된 문자열 수) = *생성 숫자(data에서 출력되지 않은 나머지 글자들에 *을 넣게 만든다..)
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));



    }
}

