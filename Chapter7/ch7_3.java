import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> nations = new HashMap<>();

        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000");
        while(true) {
            System.out.print("나라 이름, 인구 >> ");
            String nation = s.next();
            if(nation.equals("그만"))
                break;
            int person = s.nextInt();

            nations.put(nation, person);
        }

        while(true) {
            System.out.print("인구 검색 >> ");
            String search = s.next();
            if(search.equals("그만"))
                break;

            if(nations.get(search) == null)
                System.out.println(search + " 나라는 없습니다.");
            else System.out.println(search + "의 인구는 " + nations.get(search));
        }

    }
}
