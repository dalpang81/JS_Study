import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Vector<Integer>v = new Vector<>();

        System.out.print("정수(-1 이 입력될 때까지)>> ");
        while(true) {
            int n = s.nextInt();
            if(n == -1)
                break;

            v.add(n);
        }

        int max = 0;
        for(int i = 0; i < v.size(); i++)
        {
            if(max < v.get(i))
                max = v.get(i);
        }

        System.out.print("가장 큰 수는 " + max);

    }



}
