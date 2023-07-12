import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        FileWriter fout = null;

        System.out.println("전화번호 입력 프로그램입니다.");
        int c;
        try {
            fout = new FileWriter("c:\\temp\\phone.txt");

            while(true) {
                System.out.print("이름 전화번호 >> ");
                String name = s.nextLine();
                if(name.equals("그만"))
                    break;


                fout.write(name);
                fout.write("\r\n");
            }
            fout.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }

        System.out.println("저장하였습니다.");


    }
}
