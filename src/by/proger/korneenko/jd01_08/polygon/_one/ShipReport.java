package by.proger.korneenko.jd01_08.polygon._one;

import by.proger.korneenko.jd01_08.polygon.Point.Point1D;

public class ShipReport {

        public void printReport(warship p){
            System.out.println(p.swim());
            if(p.berthing())
            {
                System.out.println("this ship is berth");
            }
            else
                System.out.println("this ship is not berth");
        }
}

