import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오>>");
        int[] arr = new int[3];

        for(int i = 0; i < 3; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);
        if(arr[0] + arr[1] > arr[2])
            System.out.print("삼각형이 됩니다");
        else
            System.out.print("삼각형이 안됩니다");

    }
}