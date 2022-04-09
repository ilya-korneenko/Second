package by.proger.korneenko.jd01_08.polygon._one;

public class aerocarrier extends warship {  //авианосец

    @Override
    public String swim() {
        return super.swim() + " on water";
    }

    @Override
    public boolean berthing() {
        if (!super.berthing()) {
            System.out.println(" is not berth");
        }
        return super.berthing();
    }

    @Override
    public boolean useAmmunition() {
        return true;
    }

    @Override
    public String toString() {
        return "aerocarrier "  + super.toString();
    }
}
