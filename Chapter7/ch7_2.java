import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(int i = 0; i < 6; i++)
        {
            String scores = s.next();
            a.add(scores);
        }

        double score = 0;
        for(int i = 0; i < 6; i++)
        {
            if(a.get(i).equals("A"))
                score += 4.0;
            else if(a.get(i).equals("B"))
                score += 3.0;
            else if(a.get(i).equals("C"))
                score += 2.0;
            else if(a.get(i).equals("D"))
                score += 1.0;
            else if(a.get(i).equals("F"))
                score += 0.0;
        }

        System.out.print(score / 6);

    }



}
