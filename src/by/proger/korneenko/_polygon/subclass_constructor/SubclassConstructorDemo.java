package by.proger.korneenko._polygon.subclass_constructor;

public class SubclassConstructorDemo {
    public static void main(String[] args) {
        Bravo obj;
        obj=new Bravo();
        obj=new Bravo("красный");
        obj=new Bravo(100);
        obj=new Bravo("зелёный", 200);
        obj=new Bravo('Y');
        obj=new Bravo("синий",300,'Z');
    }
}
