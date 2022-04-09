package by.proger.korneenko.jd01_08.polygon.Point;

import by.proger.korneenko.jd01_08.polygon.SuperAndThis;

public class Point1D {
    private int x;

    Point1D(int x){
        this.x=x;
    }

    public double length(){
        return Math.abs(x);
    }

    @Override
    public String toString(){
        return " x= " +x;
    }
}
