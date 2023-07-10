import java.util.*;

class TV {
    private int size;
    public TV(int size) { this.size = size; }
    protected int getSize() { return size; }
}

class ColorTV extends TV {
    private int color;
    ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    void printProperty() {
        System.out.print(super.getSize() + "인치 " + color + "컬러");
    }

    int getColor() { return color; }
}

class IPTV extends ColorTV{
    String ip;
    IPTV(String ip, int inch, int color) {
        super(inch, color);
        this.ip = ip;
    }

    void printProperty() {
        System.out.print("나의 IPTV는 " + ip + " 주소의 " + super.getSize() + "인치 " + getColor() + "컬러");
    }
}

public class Main {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
