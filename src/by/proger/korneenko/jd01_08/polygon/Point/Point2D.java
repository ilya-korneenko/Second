package by.proger.korneenko.jd01_08.polygon.Point;

public class Point2D extends Point1D{
    private final int y;
    Point2D(int x, int y){
        super(x);
        this.y=y;
    }

    @Override
    public double length(){
        return Math.hypot(super.length(),y);
    }
    /*просто length() нельзя, тк метод будет вызывать
    сам себя, что приведёт к бесконечной рекурсии и
    ошибке во время выполнения
     */

    @Override
    public String toString() {
        return super.toString() + " y= " +y;
    }
}
