import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)>>");
        int num = s.nextInt();

        if(num / 10 == num % 10)
            System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.print("No.. 10의 자리와 1의 자리가 다릅니다.");
    }
}