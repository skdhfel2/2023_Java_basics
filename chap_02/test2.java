package chap_02;

public class test2 {

    public static String getHiddenData(String data, int index){
        String HiddenData = data.substring(0,index);
        for (int i = 1; i <= data.length() - index; i++){
            HiddenData += "*";
        }
        return HiddenData;
    }


    public static void main(String[] args) {
        String email = "skdhfel2@naver.com";
        String phone = "010-8584-4669";

        System.out.println("이메일 주소 : " + getHiddenData(email, 9));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
