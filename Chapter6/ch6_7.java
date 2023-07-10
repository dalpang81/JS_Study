import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.print(">>");
            String str = s.nextLine();

            if(str.equals("그만")) {
                System.out.print("종료합니다...");
                break;
            }
            
            StringTokenizer st = new StringTokenizer(str, " ");
            int n = st.countTokens();

            System.out.println("어절 개수는 " + n);
        }

        /*
        while(true) {
            System.out.print(">>");
            String str = s.nextLine();

            if(str.equals("그만")) {
                System.out.print("종료합니다...");
                break;
            }


            String[] arr = str.split(" ");
            System.out.println("어절 개수는 " + arr.length);
        }
         */



    }
}
