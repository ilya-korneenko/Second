package by.proger.korneenko.jd01_03;

import static by.proger.korneenko.jd01_03.Helper.*;


public class Runner {
    public static void main(String[] args) {
        String line = "100 2 4 6 80 10 24 ";

        double[][] matrix = new double[2][2];
        double []vector = new double[2];
        matrix= new double[][]{
                {1, 2, 3,},
                {4, 5, 6,},
                {8, 7, 9,}
        };
        vector = new double[]
                {1, 2, 3};

        double[][] matrixLeft=new double[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        double[][] matrixRight=new double[][]{
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };
        double [] array = InOut.getArray(line);
//        System.out.println(Arrays.toString(array));
        InOut.printArray(array);
        InOut.printArray(array, "M", 2);
        findMax(array);
        findMin(array);
        sort(array);
        mul(matrix, vector);
        mul(matrixLeft, matrixRight);

    }

}
/**
 * 
 */