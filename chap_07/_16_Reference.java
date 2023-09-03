package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Types) : int, float, double, long, boolean, ...
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam, ...
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        /////////////////////////////////
        System.out.println("-------------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1; // c2는 참조 자료형 변수이기 떄문에 c2 값이 c1으로 바꾸고 c2값을 변경하면 c2값은 c1이기 때문에 c1값도 당연히 변한다.
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라"; // c1값도 "고장난 카메라"로 변한다.
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("--------------");
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = null;
        System.out.println(c2.name);
    }

    public static void changeName(Camera camera) { // changeName 메소드 생성 후 매개변수를 camera로 설정한다.
        camera.name = "잘못된 카메라"; // c1, c2 값이 "잘못된 카메라"로 변경된다.
    }
}
