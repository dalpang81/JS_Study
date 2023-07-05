import java.util.*;

class Phone {
    String name;
    String tel;

    Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}

class PhoneBook {
    Scanner s = new Scanner(System.in);
    Phone[] phone;


    void run() {
        System.out.print("인원수>>");
        int num = s.nextInt();
        int count = 0;


        phone = new Phone[num];

        for(int i = 0; i < num; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = s.next();
            String tel = s.next();

            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true)
        {
            System.out.print("검색할 이름>>");
            String name = s.next();

            if(name.equals("그만"))
                return;

            for(int i = 0; i < num; i++)
            {
                if(phone[i].getName().equals(name)) {
                    System.out.println(phone[i].getName() + "의 번호는 " + phone[i].getTel() + " 입니다.");
                    count = 1;
                    break;
                }
            }

            if(count == 0)
                System.out.println(name + " 이 없습니다.");
            else
                count = 0;


        }



    }
}

public class Main {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();

        phonebook.run();
    }
}
