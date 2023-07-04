import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] str = {"가위", "바위", "보"};
        int n = (int)(Math.random()*3);

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true) {
            System.out.print("가위 바위 보!>>");

            String answer = s.next();

            if(answer.equals("그만"))
                return;

            System.out.print("사용자 = " + answer + " , 컴퓨터 = " + str[n] + ", ");
            if(str[n].equals("가위")){
                if(answer.equals("가위"))
                    System.out.println("비겼습니다.");
                else if(answer.equals("바위"))
                    System.out.println("사용자가 이겼습니다.");
                else if(answer.equals("보"))
                    System.out.println("컴퓨터가 이겼습니다.");
            }

            else if(str[n].equals("바위")){
                if(answer.equals("가위"))
                    System.out.println("컴퓨터가 이겼습니다.");
                else if(answer.equals("바위"))
                    System.out.println("비겼습니다.");
                else if(answer.equals("보"))
                    System.out.println("사용자가 이겼습니다.");
            }

            else if(str[n].equals("보")){
                if(answer.equals("가위"))
                    System.out.println("사용자가 이겼습니다.");
                else if(answer.equals("바위"))
                    System.out.println("컴퓨터가 이겼습니다.");
                else if(answer.equals("보"))
                    System.out.println("비겼습니다.");
            }
        }


    }
}
