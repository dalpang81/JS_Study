import java.util.*;

class Student {
    String name;
    String subject;
    int number;
    double average;

    Student(String name, String subject, int number, double average){
        this.name = name;
        this.subject = subject;
        this.number = number;
        this.average = average;
    }

    String getName() {
        return name;
    }

    void print() {
        System.out.println("--------------------------");
        System.out.println("이름:" + name);
        System.out.println("학과:" + subject);
        System.out.println("학번:" + number);
        System.out.println("학점평균:" + average);
    }

    public String toString() {
        return name + ", " + subject + ", " + number + ", " + average;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();

        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
        for(int i = 0; i < 4; i++){
            System.out.print(">> ");
            String name = s.next();
            String subject = s.next();
            int number = s.nextInt();
            double average = s.nextDouble();

            a.add(new Student(name, subject, number, average));
        }
        for(int i = 0; i < 4; i++)
            a.get(i).print();

        System.out.println("--------------------------");
        while(true)
        {
            System.out.print("학생 이름 >> ");
            String name = s.next();
            if(name.equals("그만"))
                break;

            for(int i = 0; i < 4; i++)
            {
                if(a.get(i).getName().equals(name)) {
                    System.out.println(a.get(i).toString());
                    break;
                }
            }
        }


    }
}
