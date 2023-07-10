import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        System.out.println("문자열을 입력하세요. 빈칸이나 잇어도 되고 영어 한글 모두 됩니다.");
        String str = s.nextLine();

        while(count != str.length()) {
            char c = str.charAt(0);

            str = str.substring(1);
            str = str + c;
            System.out.println(str);
            count++;
        }






    }
}
