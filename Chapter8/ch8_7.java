import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        File a, b;
        FileInputStream fin;
        FileOutputStream fout;
        long n,total;

        try {
            a = new File("a.jpg");
            b = new File("copy.jpg");

            System.out.println(a.getName() + "를 " + b.getName() + "로 복사합니다.");
            System.out.println("10%마다 *를 출력합니다.");
            fin = new FileInputStream(a);
            fout = new FileOutputStream(b);

            int c;
            n = 0;
            total = a.length();

            while((c = fin.read()) != -1) {
                fout.write((byte)c);
                n = (n + 1);
                if(n == total / 10) {
                    System.out.print("*");
                    n = 0;
                }
            }
            fin.close();
            fout.close();
        }

        catch(IOException e) {
            e.printStackTrace();
        }


    }
}
