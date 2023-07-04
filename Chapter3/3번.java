import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수를 입력하시오>>");
        int num = s.nextInt();

        for(int i = 0; i < num; i++)
        {
            for(int j = i; j < num; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}