import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int sum = 0, i = 0;

        //do-while문
        do {
            sum += 1;
            i += 2;
        } while(i < 100);


        /*
        //for문
        for(i = 0; i < 100; i+=2)
            sum += 1;
        */

        /*
        //while문
        while(i < 100) {
            sum += 1;
            i += 2;
        }*/
        System.out.println(sum);
    }
}