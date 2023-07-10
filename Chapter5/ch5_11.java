import java.util.*;

abstract class Calc {
    protected int a, b;
    void setValue(int a, int b) { this.a = a; this.b = b; }
    abstract int calculate();
}

class Add extends Calc{
    public Add() { }
    int calculate() { return a + b; }
}

class Sub extends Calc{
    public Sub() { }
    int calculate() { return a - b; }
}

class Mul extends Calc{
    public Mul() { }
    int calculate() { return a * b; }
}

class Div extends Calc{
    public Div() { }
    int calculate() { return a / b; }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;

        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = s.nextInt();
        int b = s.nextInt();
        String str = s.next();

        switch(str) {
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                total = add.calculate();
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                total = sub.calculate();
                break;

            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                total = mul.calculate();
                break;

            case "/":
                Div div = new Div();
                div.setValue(a, b);
                total = div.calculate();
                break;

        }

        System.out.println(total);
    }
}
