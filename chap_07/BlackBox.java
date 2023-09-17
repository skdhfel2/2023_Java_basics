package chap_07;

public class BlackBox {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해서 값을 증가)
    static boolean canAutoReport = false; // 자동 신고 기능, 스태틱을 붙여서 클래스변수(=모든 객체에 똑같이 적용)로 설정됨.

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출
//        기본생성자 : 매개변수(prameter) 없이 클래스의 인스턴스를 생성하는 생성자를 의미
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    } // this 굳이 쓰는 이유 -> 코드의 가독성과 유지 보수성을 향상시킬 수 있으며, 클래스 내부에서 인스턴스 변수를 명확하게 구분할 수 있습니다.

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        }
        else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-oooo) 로 연결합니다.");
    }
    // 일반적인 메소드 : 객체 필요
    // class 메소드(Static Method) : 객체 필요 x
    // Static으로 선언한 Class 메소드만 다른 static 메소드에서 사용 가능

    void appendModelName(String modelName) {
        this.modelName += modelName; // this. 사용 -> : class의 인스턴스 변수로 인식, 이름 같은 변수 사용시 겹치는 오류를 방지 하기 위해서 사용
    } // this. 없는 변수 -> parameter로 전달받은 변수다
    // parameter(매개변수) : 함수 & 메서드에 전달되는 값을 받아들이는 변수

    // Getter & Setter
    // 멤버변수 : 객체에서 선언된 변수
    // Getter : 객체의 멤버변수 값을 반환하기 위해 사용
    // Setter : 객체의 멤버변수를 변경할때 사용
    // Setter 에서 변경 후 -> Getter 에서 반환해서 전달한다.
    // Getter & Setter 사용 이유 : 1.클래스 안에있는 객체의 멤버변수를 안전하게 변경하기 위해서.
    // 2. 값을 잘못 설정했을때 발생하는 오류를 방지.
    // 3. 값을 가져오는 과정해서 그 값이 없거나 이상할때 대안으로 줄수있는 값을 설정할수 있다.
    String getModelName() {
        return modelName;
    }
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) { // isEmpty() : 빈칸
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    } // 이 코드에서는 매개변수가 설정되어 있지 읺기 때문에 price값은 자동적으로 인스턴스 변수값이 된다.

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
