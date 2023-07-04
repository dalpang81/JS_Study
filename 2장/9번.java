import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        float x = s.nextFloat();
        float y = s.nextFloat();
        float r = s.nextFloat();

        System.out.print("점 입력>>");
        float x1 = s.nextFloat();
        float y1 = s.nextFloat();

        if(x - r <= x1 && x + r >= x1 && y - r <= y1 && y + r >= y1)
            System.out.print("점 (" + x1 + ", " + y1 + ")는 원 안에 있다.");
        else
            System.out.print("점 (" + x1 + ", " + y1 + ")는 원 안에 없다.");


    }
}