import java.util.*;

class Location {
    String name;
    int w;
    int h;

    Location(String name, int w, int h) {
        this.name = name;
        this.w = w;
        this.h = h;
    }

    void print() {
        System.out.println(name + "\t" + w + "\t" + h);
    }

    public String toString() {
        return name + "\t" + w + "\t" + h;
    }


}

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        HashMap<String, Location> hash = new HashMap<>();

        System.out.println("도시,경도,위도를 입력하세요.");
        for(int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String city = s.next();
            int w = s.nextInt();
            int h = s.nextInt();

            hash.put(city, new Location(city, w, h));
        }

        System.out.println("----------------------------");
        Set<String> keys = hash.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String key = it.next();
            Location value = hash.get(key);
            value.print();
        }
        System.out.println("----------------------------");
        while(true) {
            System.out.print("도시 이름 >> ");
            String name = s.next();
            if(name.equals("그만"))
                break;

            Location location = hash.get(name);
            if(location == null)
                System.out.println(name + "는 없습니다.");
            else
                System.out.println(location.toString());
        }


    }
}
