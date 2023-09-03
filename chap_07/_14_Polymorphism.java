package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("----------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) { // Camera 클래스의 객체를 대표하는 cam 변수에 배열값을 하나씩 담아서 배열에 맞는 객체 타입으로 변경된다.
            cam.showMainFeature();
        }

        System.out.println("----------------");

//        factoryCam.detectFire();
//        speedCam.checkSpeed();/**/
//        speedCam.recognizeLicensePlate();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) { // FactoryCam 클래스 에서 factoryCam 객체를 만들었다면
            ((FactoryCam) factoryCam).detectFire(); // factoryCam 에서 FactoryCam 으로 형변환을 한다 -> FactoryCam에서 detectFire를 불러온다.
        } // factoryCam.detectFire() 안되는 이유 : factoryCam은 부모 클래스인 Camara 에서 자식클래스인 FactoryCam 을 거쳐서 만들어진 객체이기 떄문이다.
          // 이 코드에서처럼 부모클래스를 거쳐서 만들어진 객체들은 부모 클래스에 없는 자식 클래스에만 존재하는 객체를 사용하기 위해서는 if문을 사용하여 위에 코드 처럼 작성해야 한다.

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

//        Object[] objs = new Object[3]; // 모든 자바 클래스는 Object 클래스를 상속하고 있어서 어디서든 사용 가능하다.
//        objs[0] = new Camera();
//        objs[1] = new FactoryCam();
//        objs[2] = new SpeedCam();
    }
}
