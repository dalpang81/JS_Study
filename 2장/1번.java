import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("원화를 입력하세요(단위 원)>>");
        int won = s.nextInt();

        float dollar = won / 1100;

        System.out.print(won + "원은 $" + dollar + "입니다.");
    }
}