import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String course [] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
        int score [] = {95, 88, 76, 62, 55};

        while(true) {
            System.out.print("과목 이름>>");
            String str = s.next();
            for(int i = 0; i < 5; i++)
            {
                if(course[i].equals(str)){
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    break;
                }
                else
                {
                    System.out.println("없는 과목입니다.");
                    break;
                }
            }

            if(str.equals("그만"))
                return;
        }
    }
}
