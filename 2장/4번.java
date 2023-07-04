import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수 3개 입력>>");
        int[] arr = new int[3];

        for(int i = 0; i < 3; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);
        System.out.print("중간 값은 " + arr[1]);
    }
}