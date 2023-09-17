package chap_07.camera;

// SpeedCam is a Camera. (IS-A)
public class SpeedCam extends Camera { // 자식 클래스
    public SpeedCam() { // 클래스 생성자(Alt + insert -> 생성자(constructor) -> 원하는 클래스 선택 -> 확인)
        // this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }
    // 클래스 생성자 : 클래스와 동일한 이름을 가지며 반환 타입이 없다
    // 사용하는 이유 : 객체를 초기화하고 객체가 사용될 수 있도록 하는데 사용됩니다
    // 클래스 생성자와 Getter & Setter의 차이점: 클래스 생성자는 객체의 초기 상태를 설정하고 Getter & Setter는 객체의 내부상태를 중간에 설정한다.
    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation : 주석 , @Override: 부모 클래스에서 오버라이딩이 안되면 오류 표시해줌
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
