import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("금액을 입력하시오>>");
        int money = s.nextInt();

        int money_50000 = 0;
        if(money > 50000) {
            money_50000 = money / 50000;
            money = money - (50000 * money_50000);
        }

        int money_10000 = money / 10000;
        money = money - (10000 * money_10000);

        int money_1000 = money / 1000;
        money = money - (1000 * money_1000);

        int money_100 = money / 100;
        money = money - (100 * money_100);

        int money_50 = money / 50;
        money = money - (50 * money_50);

        int money_10 = money / 10;
        money = money - (10 * money_10);

        System.out.println("오만원권 " + money_50000 + "매");
        System.out.println("만원권 " + money_10000 + "매");
        System.out.println("천원권 " + money_1000 + "매");
        System.out.println("백원 " + money_100 + "개");
        System.out.println("오십원 " + money_50 + "개");
        System.out.println("십원 " + money_10 + "개");
        System.out.println("일원 " + money + "개");
    }
}