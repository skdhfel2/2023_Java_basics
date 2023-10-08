package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

import java.awt.color.CMMException;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)
        // 추상 클래스인 부모 클래스에서 추상 메소드가 있다면 자식 클래스에서는 무조건 추상 메소드를 구현 해야만 한다.

        // Camera camera = new Camera();
        // Camera factoryCam = new FactoryCam(); -> Camera 부모 클래스를 상속한 FactoryCam 에서 만든 factoryCam 객체
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
