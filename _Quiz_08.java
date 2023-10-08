package chap_08;

import chap_08.camera.SpeedCam;
import chap_08.detector.AccidentDetector;
import chap_08.reporter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector()); // "AccidentDetector"는 클래스 명이고 매개변수로 사용하려면 객체로 넣어야 하기 때문에 new를 사용해서 클래스의 객체로 만들어야 한다.
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
