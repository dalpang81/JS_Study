import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        HashMap<String, Double> h = new HashMap<>();

        System.out.println("미래장학금관리시스템입니다.");
        for(int i = 0; i < 5; i++) {
            System.out.print("이름과 학점 >> ");
            String name = s.next();
            double score = s.nextDouble();

            h.put(name, score);
        }

        System.out.print("장학생 선발 학점 기준 입력>> ");
        double max = s.nextDouble();

        System.out.print("장학생 명단 : ");
        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();

        while(it.hasNext()) {
            String name = it.next();
            double score = h.get(name);
            if(max < score)
                System.out.print(name + " ");
        }


    }
}
