import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        char c = s.next().charAt(0);

        for(int i = 0; i <= c - 'a'; i++)
        {
            for(char j = 'a'; j <= c - i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}