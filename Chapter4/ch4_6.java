import java.util.*;

class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x;
        this. y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }

    public int square() {
        return radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];
        int max = 0;
        int tmp = 0;

        for(int i = 0; i < 3; i++)
        {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        for(int i = 0; i < c.length; i++) {
            if(max < c[i].square()) {
                max = c[i].square();
                tmp = i;
            }

        }

        System.out.print("가장 면적이 큰 원은 ");
        c[tmp].show();

        scanner.close();
    }
}
