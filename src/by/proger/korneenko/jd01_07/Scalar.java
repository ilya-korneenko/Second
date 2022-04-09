package by.proger.korneenko.jd01_07;

public class Scalar extends Var{

    private double value;

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(String strScalar) {
        this.value = Double.parseDouble(strScalar);
    }
    public Scalar(Scalar otherScalar) {
        this.value = otherScalar.value;
    }


    @Override
    public String toString() {
        return Double.toString(value)  ;    //перевод числа double в строку String
    }
}
