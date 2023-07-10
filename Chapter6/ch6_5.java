import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int hour = now.get(Calendar.HOUR_OF_DAY);

        System.out.println("현재 시간은 " + now.get(Calendar.HOUR_OF_DAY) + "시 " + now.get(Calendar.MINUTE) + "분입니다.");

        if(hour > 4 && hour < 12)
            System.out.print("Good Morning");
        else if(hour > 12 && hour < 18)
            System.out.print("Good Afternoon");
        else if(hour > 18 && hour < 22)
            System.out.print("Good Evening");
        else
            System.out.print("Good Night");

    }
}
