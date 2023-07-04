import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수 몇개?");
        int num = s.nextInt();

        int[] arr = new int[num];
        for(int i = 0; i < num; i++)
        {
            int tmp = (int)(Math.random() * 100 + 1);
            int chk = 0;
            for(int j = 0; j < i; j++)
            {
                if(tmp == arr[j]){
                    chk = 1;
                    break;
                }

            }
            if(chk == 1)
            {
                i--;
                continue;
            }
            arr[i] = tmp;

        }

        for(int i = 0; i < num; i++)
            System.out.print(arr[i] + " ");
    }
}