package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");
        if (file.exists()) {
            if (file.delete()) { // "file"을 삭제하고 만약 "file"이 삭제 됐다면 True가 반환이 돼서 if문을 실행 시키고 삭제가 안됐다면 False가 반환되므로 else문이 실행된다.
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        File folder = new File("A"); // 'A'파일을 "folder"객체에 넣는다
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }
        // deleteFolder : 주어진 폴더 및 그 안에 포함된 파일 및 폴더들을 재귀적으로 삭제하는 기능을 수행하는 Java 메서드의 이름
        if (deleteFolder(folder)) { // 삭제된 폴더에 "folder"가 존재한다면
            System.out.println("*폴더 삭제 성공 : " + folder.getAbsolutePath());
        } else {
            System.out.println("*폴더 삭제 실패 : " + folder.getAbsolutePath());
        }
    }

    // deleteFolder(A)
    //      deleteFolder(B)
    //          deleteFolder(C)
    //          C.delete() 삭제
    //      B.delete() 삭제
    // A.delete() 삭제

    public static boolean deleteFolder(File folder) { // "folder"라는 "File"객체를 만든다.
        if (folder.isDirectory()) { // "folder"에 경로가 있다면 True 반환
            for (File file : folder.listFiles()) { // "file"이라는 "File"객체에 "listFiles"라는 메소드를 통해서 "folder"안에 존재하는 파일들을 하나씩 전달한다.
                deleteFolder(file); // 재귀적으로 "file"객체의 파일들을 하나씩 삭제한다.
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
}
