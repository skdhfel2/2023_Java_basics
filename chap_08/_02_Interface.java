package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 : 추상클래스가 미완성된 클래스라면 인터페이스는 뼈대만 잡는다고 생각하면 된다.
        Reportable normalReporter = new NormalReporter(); // Reportable(인터페이스)를 참조한 NormalReporter 클래스에서 normalReporter 객체를 생성한다.
        // 인터페이스(Reportable)를 구현하는 모든 클래스는 인터페이스를 통해서 참조를 할수 있다
        // 인터페이스(Reportable)에 있는 report 메소드는 항상 구현이 되어있다.
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("---------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("---------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector); // "advancedFireDetector"는 이미 클래스에서 생성된 객체이기 때문에 new를 앞에 따로 붙일 필요 X
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
