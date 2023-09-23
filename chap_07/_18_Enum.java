package chap_07;

public class _18_Enum { // enum : 열거형
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : JAN, FEB, MAR, ...
        // 옷 사이즈 : S, M, L, XL
        // OS 종류 : WIN10, WIN11, MACOS, LINUX, ...
        // 해상도 : HD, FHD, QHD, UHD, ...

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 녹화 품질 : ");
        switch (resolution)  {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");  // 문자열 UHD를 valueOf을 이용해서 Resolution 열거형(enum)에 넣고 Resolution 열거형에서 열거상수 UHD를 찾아서 resolution 변수에 값을 넣는다.
        System.out.println(resolution);

        System.out.println("-------------------");

        for (Resolution myRes : Resolution.values()) {
            // Resolution.values() : Resolution 열거형(enum)에 정의된 모든 열거 상수를 배열로 반환하는 메서드
            // for (Resolution myRes : ...) :  for-each 루프 구문, myRes는 각 열거 상수가 할당될 변수의 이름
            System.out.println(myRes.name() + " : " + myRes.ordinal()); // ordinal : 순서
        }
        // myRes.name() : 열거 상수의 이름을 반환하는 메서드
        // myRes.ordinal() : 열거 상수의 순서를 반환

        System.out.println("-------------------");
        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution { // 이 코드는 Resolution 열거형(enum)이 사용될 때 실행된다.
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}