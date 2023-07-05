import java.util.*;

class Day {
    private String work;
    public void set(String work) {this.work = work;}
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}

class MonthSchedule {
    Scanner s = new Scanner(System.in);
    Day[] days;

    MonthSchedule(int day) {
        days = new Day[day];
        for(int i=0; i<days.length; i++) {
            days[i] = new Day();
        }
    }

    void input() {
        System.out.print("날짜(1~30)?");
        int d = s.nextInt();
        System.out.print("할일(빈칸없이입력)?");
        String work = s.next();
        d--;
        System.out.println();
        days[d].set(work);
    }

    void view() {
        System.out.print("날짜(1~30)?");
        int d = s.nextInt();
        d--;
        System.out.print((d + 1) + "일의 할 일은 ");
        days[d].show();
        System.out.println();
    }

    void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        System.out.print("이번달 스케쥴 관리 프로그램.");
        while(true) {
            System.out.println();
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int select = s.nextInt();
            switch(select) {
                case 1: input(); break;
                case 2: view(); break;
                case 3: finish(); return;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
