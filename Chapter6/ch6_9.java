import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
            int person = s.nextInt();
            int computer = (int)(Math.random() * 3 + 1);

            switch(person) {
                case 1:
                    System.out.print("철수(가위) : ");
                    if(computer == 1)
                    {
                        System.out.println("컴퓨터(가위)");
                        System.out.println("비겻습니다.");
                        break;
                    }
                    else if(computer == 2)
                    {
                        System.out.println("컴퓨터(바위)");
                        System.out.println("컴퓨터가 이겼습니다.");
                        break;
                    }
                    else if(computer == 3)
                    {
                        System.out.println("컴퓨터(보)");
                        System.out.println("철수가 이겼습니다.");
                        break;
                    }

                case 2:
                    System.out.print("철수(바위) : ");
                    if(computer == 1)
                    {
                        System.out.println("컴퓨터(가위)");
                        System.out.println("철수가 이겼습니다..");
                        break;
                    }
                    else if(computer == 2)
                    {
                        System.out.println("컴퓨터(바위)");
                        System.out.println("비겼습니다.");
                        break;
                    }
                    else if(computer == 3)
                    {
                        System.out.println("컴퓨터(보)");
                        System.out.println("컴퓨터가 이겼습니다.");
                        break;
                    }

                case 3:
                    System.out.print("철수(보) : ");
                    if(computer == 1)
                    {
                        System.out.println("컴퓨터(가위)");
                        System.out.println("컴퓨터가 이겼습니다..");
                        break;
                    }
                    else if(computer == 2)
                    {
                        System.out.println("컴퓨터(바위)");
                        System.out.println("철수가 이겼습니다..");
                        break;
                    }
                    else if(computer == 3)
                    {
                        System.out.println("컴퓨터(보)");
                        System.out.println("비겼습니다.");
                        break;
                    }
                case 4:
                    return;
            }
        }








    }
}
