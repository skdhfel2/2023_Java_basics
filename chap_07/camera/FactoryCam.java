package chap_07.camera;

// FactoryCam is a Camera. (IS-A)
public class FactoryCam extends Camera { // 자식 클래스
    public FactoryCam() {
        // this.name = "공장 카메라";
        super("공장 카메라"); // 부모 클래스에서  String을 인수로 받는 생성자 호츌
    }
    // super.(); : 부모 클래스의 변수 or 메소드에 접근
    // super(); : 부모 클래스의 생성자에 접근

    public void recordVideo() {
        super.recordVideo();
        detectFire();
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
