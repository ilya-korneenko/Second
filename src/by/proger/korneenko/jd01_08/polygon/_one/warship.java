package by.proger.korneenko.jd01_08.polygon._one;

abstract class warship implements ship {
    public int ammunition;


    public String swim(){
        return "ship is swim";
    }

    @Override
    public boolean berthing() {     //причален
        return false;
    }

    public boolean weapon(){ return true; }

    @Override
    public String toString() {
        return "warship{" +
                "ammunition=" + ammunition +
                '}';
    }
}
