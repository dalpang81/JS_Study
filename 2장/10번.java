import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        double r1 = s.nextDouble();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        double r2 = s.nextDouble();

        double distance = Math.sqrt((x1 - y1)*(x1 - y1) + (x2 - y2)*(x2 - y2));
        if(distance <= r1 + r2){
            System.out.print("두 원은 서로 겹친다.");
        }
        else{
            System.out.print("두 원은 서로 겹치지 않는다.");
        }
    }
}