package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera {
    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() { // showMainFeature는 추상 클래스인 부모 클래스의 추상 메소드 이므로 자식 클래스에서 무조건 구현해야 한다.
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        this.detector.detect();
    }

    public void report() {
        this.reporter.report();
    }
}
