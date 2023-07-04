import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("연산>>");
        int a = s.nextInt();
        String b = s.next();
        int c = s.nextInt();
        int total = 0;

        //switch문으로 구현
        switch(b) {
            case "+" :
                total = a + c;
                break;
            case "-" :
                total = a - c;
                break;
            case "*" :
                total = a * c;
                break;
            case "/" :
                if(c == 0) {
                    System.out.print("0으로 나눌 수 없습니다.");
                    return;
                }
                total = a / c;
                break;
        }



/*
        //if문으로 구현
        if(b.equals("+"))
            total = a + c;
        else if(b.equals("-"))
            total = a - c;
        else if(b.equals("*"))
            total = a * c;
        else if(b.equals("/")) {
            if(c == 0) {
                System.out.print("0으로 나눌 수 없습니다.");
                return;
            }
            total = a / c;
        }
*/
        System.out.print(a + b + c + "의 계산 결과는 " + total);



    }
}