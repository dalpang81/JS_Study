import java.awt.*;
import java.util.*;

interface Stack {
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}

class StringStack implements Stack {
    int size;
    int count;
    String[] arr;

    StringStack(int size) {
        this.size = size;
        count = 0;
        arr = new String[size];
    }

    public int length() {
        return arr.length;
    }

    public int capacity() {
        return size - count;
    }

    public String pop() {
        return arr[--count];
    }

    public boolean push(String val) {
        if(capacity() <= 0)
            return false;
        else {
            arr[count] = val;
            count++;
            return true;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int size = s.nextInt();

        StringStack stringStack = new StringStack(size);

        while(true) {
            System.out.print("문자열 입력 >> ");
            String str = s.next();

            if(str.equals("그만"))
                break;

            boolean bool = stringStack.push(str);
            if(!bool) {
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(stringStack.pop() + " ");
        }
    }
}
