import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        FileReader fin = null;

        try {
            Scanner fScanner = new Scanner(new FileReader("c:\\windows\\system.ini"));
            int lineNumber = 1;

            while(fScanner.hasNext()) {
                String line = fScanner.nextLine();
                System.out.printf("%4d: ", lineNumber);
                System.out.println(line);
                lineNumber++;
            }
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }


    }
}
