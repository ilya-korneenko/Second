package by.proger.korneenko.jd01_07;

import java.util.Arrays;
import java.util.StringJoiner;

public class Vector extends Var {
    private final double [] value;  //final не даёт никак изменить ссылку

    public Vector(double[] value) {
        this.value = Arrays.copyOf( value, value.length);
    }

    public Vector(String strVector) {

        String[] seqNumbers = strVector.split(" ");
        double[] numbers = new double[seqNumbers.length];

        for (int i = 0; i < seqNumbers.length; i++) {
            numbers[i]=Double.parseDouble(seqNumbers[i]);
        }
        this.value = Arrays.copyOf( numbers, numbers.length);
    }

    public Vector(Vector otherVector) {
        this.value = otherVector.value;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ", "{","}"  );
        for (double element : value) {
            joiner.add(Double.toString(element));
        }
        return joiner.toString();
    }
}
