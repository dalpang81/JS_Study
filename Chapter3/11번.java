import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.printf("%d", sum/args.length);
    }
}