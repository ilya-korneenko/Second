package by.proger.korneenko.jd01_08.polygon._one;

public class submarine extends warship{
     //int ammunition;


    public submarine() {

    }

    @Override
    public String swim() {
        return super.swim() + " under water";
    }

    @Override
    public boolean berthing() {
        return super.berthing();
    }

    submarine(int ammunition) {

    }

    @Override
    public String toString() {
        return "submarine{" +
                "ammunition=" + ammunition +
                '}';
    }

    @Override
    public boolean useAmmunition() {
        return true;
    }


}
