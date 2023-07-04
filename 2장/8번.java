import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("점 (x1, y1), (x2, y2)의 좌표를 입력하시오>>");
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();

        if((x1 >= 100 && x2 <= 200) && (y1 >= 100 && y2 <= 200))
            System.out.print("(" + x1 + "," + y1 + ") ," + "(" + x2 + "," + y2 + ")는 사각형 안에 있습니다.");
        else
            System.out.print("(" + x1 + "," + y1 + ") ," + "(" + x2 + "," + y2 + ")는 사각형 안에 없습니다.");

    }
}