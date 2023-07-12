import java.io.*;
import java.util.*;

public class Main {
    public static boolean com(FileInputStream f1, FileInputStream f2) throws IOException {
        byte buf1[] = new byte[1024];
        byte buf2[] = new byte[1024];

        int l1 = 0, l2;

        while(true) {
            l1 = f1.read(buf1);
            l2 = f2.read(buf2);

            if(l1 != l2) return false;

            if(l1 == -1) break;

            for(int i = 0; i < l1; i++)
                if(buf1[i] != buf2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        FileInputStream f1, f2;
        String s1, s2;

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        s1 = s.next();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        s2 = s.next();

        try {
            f1 = new FileInputStream(s1);
            f2 = new FileInputStream(s2);

            if(!com(f1, f2)) {
                System.out.println("파일이 서로 다릅니다.");
            }
            else {
                System.out.println("파일이 같습니다.");
            }

            if(f1 != null) f1.close();
            if(f2 != null) f2.close();
        }

        catch(IOException e) {
            e.printStackTrace();
        }


    }
}
