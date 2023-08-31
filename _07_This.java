package chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이"; // 까망이(최신형)
        b1.appendModelName("(최신형)"); // ctrl + shift + i = 메소드 코드 확인 가능
        System.out.println(b1.modelName);
    }
}
