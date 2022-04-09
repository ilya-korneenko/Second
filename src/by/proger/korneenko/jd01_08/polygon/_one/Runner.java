package by.proger.korneenko.jd01_08.polygon._one;

import by.proger.korneenko.jd01_08.polygon.Point.Point1D;
import by.proger.korneenko.jd01_08.polygon.Point.Point2D;
import by.proger.korneenko.jd01_08.polygon.Point.Point3D;
import by.proger.korneenko.jd01_08.polygon.Point.PointReport;

public class Runner {
    public static void main(String[] args) {
        ShipReport d = new ShipReport();
        transportBoats p1= new transportBoats(5);
        d.printReport(p1);
        guardShip p2= new guardShip();
        d.printReport(p2);
        if(p2.berthing()){;
        }


//        PointReport d = new PointReport();
//        Point1D p1= new Point1D(7);
//        d.printReport(p1);
//        Point2D p2= new Point2D(3,4);
//        d.printReport(p2);
//        Point3D p3 = new Point3D(3,4,5);
//        d.printReport(p3);

    }

}
