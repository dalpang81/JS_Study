import java.util.*;

class Dictionary {
    private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String [] eng = { "love", "baby", "money", "future", "hope" };

    public static String kor2Eng(String word) {
        for(int i = 0; i < kor.length; i++)
        {
            if(word.equals(kor[i]))
                return eng[i];
        }
        return "no";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dictionary dic = new Dictionary();

        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true) {
            System.out.print("한글 단어?");
            String korea = s.next();

            if(korea.equals("그만"))
                return;

            String eng = dic.kor2Eng(korea);

            if(eng.equals("no")) {
                System.out.println(korea + "는 저의 사전에 없습니다.");
                continue;
            }
            System.out.println(korea + "은 " + eng);

        }
    }
}
