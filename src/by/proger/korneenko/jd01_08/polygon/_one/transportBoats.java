package by.proger.korneenko.jd01_08.polygon._one;

public class transportBoats extends submarine{
    transportBoats(int ammunition) {
        super(ammunition);
    }

    @Override
    public boolean useAmmunition() {
        return false;
    }

    @Override
    public boolean berthing() {
        return super.berthing();
    }

    @Override
    public String toString() {
        return "transportBoats" + super.toString();
    }

    @Override
    public String swim() {
        return "transportBoats " + super.swim();
    }
}
