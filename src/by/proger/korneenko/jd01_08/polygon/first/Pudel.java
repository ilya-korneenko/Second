package by.proger.korneenko.jd01_08.polygon.first;

public class Pudel extends Dog {
    boolean checkLife() {
        return true;
    }

    @Override
    void doBark(int amount) {
        System.out.println("\nPudel bark " + amount);
    }
}
