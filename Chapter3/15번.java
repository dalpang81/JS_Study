import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("곱하고자 하는 두 수 입력>>");
            try {
                int n = scanner.nextInt();
                int m = scanner.nextInt();

                System.out.print(n + "X" + m + "=" + n*m);
                scanner.close();
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.");
                scanner.nextLine();
            }
        }



    }
}
