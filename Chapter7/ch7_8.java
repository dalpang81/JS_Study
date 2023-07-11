import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<>();

        System.out.println("** 포인트 관리 프로그램입니다 **");
        while (true) {
            System.out.print("이름과 포인트 입력>> ");
            String name = s.next();
            if(name.equals("그만"))
                break;
            int point = s.nextInt();

            if(h.containsKey(name)) {
                int value = h.get(name);
                value += point;
                h.put(name, value);
            }
            else h.put(name, point);

            Set<String> keys = h.keySet();
            Iterator<String> it = keys.iterator();
            while(it.hasNext()){
                String names = it.next();
                int points = h.get(names);
                System.out.print("(" + names + "," + points + ")");
            }
            System.out.println();

        }

    }
}
