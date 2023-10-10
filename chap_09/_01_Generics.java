package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray); // printIntArray : int 형을 나타내는 메서드, int 배열을 출력
        printDoubleArray(dArray); // "printDoubleArray"여기에 마우스 클릭하고 Alt + Enter 누르면 자동으로 필요한 코드가 작성된다.
        printStringArray(sArray);

        System.out.println("-----------------------");

        printAnyArray(iArray); // 메서드 호출, iArray는 매개변수
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T : Type, K : Key, V : Value, E : Element <>
    private static <T> void printAnyArray(T[] array) { // 앞에 T만 들어가면 어떤 단어든 상관 없음, T는 매개변수에 따라 타입이 변한다.
        for (T t : array) {
            System.out.print(t + " "); // " "는 빈칸 확보를 위해 사용
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }
}
