import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        int sum = 0;

        while(true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int rain = s.nextInt();
            if(rain == 0) break;
            v.add(rain);
            sum += rain;

            System.out.println("현재 평균 " + (sum / v.size()));

        }

    }
}
