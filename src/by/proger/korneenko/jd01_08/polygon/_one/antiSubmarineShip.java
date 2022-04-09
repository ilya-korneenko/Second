package by.proger.korneenko.jd01_08.polygon._one;

public class antiSubmarineShip extends submarine{
    antiSubmarineShip(int ammunition) {
        this.ammunition=ammunition;

    }     //противолодочный



    @Override
    public String swim() {
        return "antiSubmarineShip " + super.swim();
    }

    @Override
    public boolean berthing() {
        return false;
    }

    @Override
    public String toString() {
        return "antiSubmarineShip" +super.toString();
    }
}
