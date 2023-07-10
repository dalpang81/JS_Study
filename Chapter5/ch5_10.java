import java.awt.*;
import java.util.*;

abstract class PairMap {
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap {
    int size;
    int count;

    Dictionary(int size) {
        this.size = size;
        count = 0;
        keyArray = new String[size];
        valueArray = new String[size];
    }

    public String get(String key) {
        for(int i = 0; i < count; i++)
        {
            if(keyArray[i].equals(key))
                return valueArray[i];
        }
        return null;
    }

    public void put(String key, String value) {
        int index = count;
        for(int i = 0; i < count; i++)
        {
            if(key.equals(keyArray[i])) {
                index = i;
                break;
            }
        }
        keyArray[index] = key;
        valueArray[index] = value;
        count++;
    }

    public String delete(String key) {
        String tmp = get(key);
        int index = count;
        for (int i = 0; i < count; i++)
        {
            if(keyArray[i].equals(key)) {
                index = i;
                break;
            }
        }
        keyArray[index] = "";
        valueArray[index] = "";
        count--;
        return tmp;
    }

    public int length() {
        return count;
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
