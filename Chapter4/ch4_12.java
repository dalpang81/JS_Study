import java.util.*;

class Concert {
    Scanner s = new Scanner(System.in);
    String[] S = new String[10];
    String[] A = new String[10];
    String[] B = new String[10];

    Concert() {
        for(int i = 0; i < 10; i++)
        {
            S[i] = " ---";
            A[i] = " ---";
            B[i] = " ---";
        }
    }

    void reservation() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int num = s.nextInt();

        if(num == 1) {
            System.out.print("S>>");
            for(int i = 0; i < 10; i++)
                System.out.print(S[i]);
            System.out.println();
            System.out.print("이름>>");
            String name = s.next();
            System.out.print("번호>>");
            int n = s.nextInt();

            S[n - 1] = " " + name;
        }

        if(num == 2) {
            System.out.print("A>>");
            for(int i = 0; i < 10; i++)
                System.out.print(A[i]);
            System.out.println();
            System.out.print("이름>>");
            String name = s.next();
            System.out.print("번호>>");
            int n = s.nextInt();

            A[n - 1] = " " + name;
        }

        if(num == 3) {
            System.out.print("B>>");
            for(int i = 0; i < 10; i++)
                System.out.print(B[i]);
            System.out.println();
            System.out.print("이름>>");
            String name = s.next();
            System.out.print("번호>>");
            int n = s.nextInt();

            B[n - 1] = " " + name;
        }
    }

    void view() {
        System.out.print("S>>");
        for(int i = 0; i < 10; i++) {
            System.out.print(S[i]);
        }
        System.out.println();

        System.out.print("A>>");
        for(int i = 0; i < 10; i++) {
            System.out.print(A[i]);
        }
        System.out.println();

        System.out.print("B>>");
        for(int i = 0; i < 10; i++) {
            System.out.print(B[i]);
        }
        System.out.println();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    void cancle() {
        System.out.print("좌석 S(1), A(2), B(3)>>");
        int num = s.nextInt();

        if(num == 1)
        {
            System.out.print("S>>");
            for(int i = 0; i < 10; i++)
                System.out.print(S[i]);
            System.out.println();
            System.out.print("이름>>");
            String name = s.next();

            for(int i = 0; i < 10; i++)
            {
                if(S[i].equals(" " + name))
                    S[i] = " ---";
            }
        }

        if(num == 2)
        {
            System.out.print("A>>");
            for(int i = 0; i < 10; i++)
                System.out.print(A[i]);
            System.out.println();
            System.out.print("이름>>");
            String name = s.next();

            for(int i = 0; i < 10; i++)
            {
                if(A[i].equals(" " + name))
                    A[i] = " ---";
            }
        }

        if(num == 3)
        {
            System.out.print("B>>");
            for(int i = 0; i < 10; i++)
                System.out.print(B[i]);
            System.out.println();
            System.out.print("이름>>");
            String name = s.next();

            for(int i = 0; i < 10; i++)
            {
                if(B[i].equals(" " + name))
                    B[i] = " ---";
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Concert concert = new Concert();

        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int num = s.nextInt();

            switch(num) {
                case 1: concert.reservation(); break;
                case 2: concert.view(); break;
                case 3: concert.cancle(); break;
                case 4: return;

            }
        }
    }
}
