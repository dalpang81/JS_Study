import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[10];
        float sum = 0;

        System.out.print("랜덤한 정수들 : ");
        for(int i = 0; i < 10; i++)
        {
            arr[i] = (int)(Math.random() * 10 + 1);
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();
        System.out.print("평균은 " + (sum / 10));
    }
}