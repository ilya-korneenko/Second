package by.proger.korneenko.jd01_08.polygon._one;

public class landingCraft extends aerocarrier {     //десантный

    @Override
    public String swim() {
        return "landingCraft " + super.swim();
    }

    @Override
    public boolean berthing() {
        return super.berthing();
    }

    @Override
    public String toString() {
        return "landingCraft " + super.toString();
    }
}
