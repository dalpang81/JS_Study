import java.awt.*;
import java.util.*;

class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x = x; this.y = y; }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void moveUp() {
        z++;
    }

    void moveDown() {
        z--;
    }

    void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }



    public String toString() {
        return ("(" + getX() + "," + getY() + "," + z + ")의 점");
    }

}

public class Main {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println(p.toString() + "입니다.");

        p.moveUp();
        System.out.println(p.toString() + "입니다.");

        p.moveDown();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(100, 200, 300);
        System.out.println(p.toString() + "입니다.");
    }
}
