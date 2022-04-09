package by.proger.korneenko.jd01_08.polygon._one;

public class guardShip extends aerocarrier{ //сторожевой

    @Override
    public String swim() {
        return "guardShip " + super.swim();
    }

    @Override
    public boolean berthing() {
        return true;
    }

    @Override
    public String toString() {
        return "guardShip " + super.toString();
    }
}
