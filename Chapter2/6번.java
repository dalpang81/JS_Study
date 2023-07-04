import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int num = s.nextInt();

        if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
            if(num % 3 == 0 || num % 6 == 0 || num % 9 == 0)
                System.out.print("박수짝짝");
            else
                System.out.print("박수짝");
        }

    }
}