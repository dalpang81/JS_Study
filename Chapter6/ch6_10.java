import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public int game() {
        Scanner s = new Scanner(System.in);

        int n1 = (int)(Math.random() * 3 + 1);
        int n2 = (int)(Math.random() * 3 + 1);
        int n3 = (int)(Math.random() * 3 + 1);

        System.out.print("[" + name + "]:<Enter>");
        String str = s.nextLine();

        System.out.print("\t\t" + n1 + "\t" + n2 + "\t" + n3);

        if(n1 == n2 && n2 == n3 && n3 == n1) {
            System.out.println("\t" + name + "님이 이겼습니다!");
            return 1;
        }

        else
            System.out.println("\t아쉽군요!");
        return 0;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("1번째 선수 이름>>");
        String str1 = s.next();
        System.out.print("2번째 선수 이름>>");
        String str2 = s.next();

        Person p1 = new Person(str1);
        Person p2 = new Person(str2);

        while(true)
        {
            int a1 = p1.game();
            if(a1 == 1)
                return;
            int a2 = p2.game();
            if(a2 == 1)
                return;
        }

    }
}
