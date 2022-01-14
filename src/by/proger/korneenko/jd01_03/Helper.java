package by.proger.korneenko.jd01_03;

public class Helper {
    static double findMax(double[] arr) {
        if (0 == arr.length) {
            return Double.MAX_VALUE;
        } else {
            double max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i])
                    max = arr[i];
            }
            return max;
        }

    }

    static double findMin(double[] arr) {
        double min;
        if (0 == arr.length)
            min = Double.MIN_VALUE;
        else {
            min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i])
                    min = arr[i];
            }
        }
        return min;
    }

    static void sort(double[] array) {
        boolean swap = true;
        int last = array.length - 1;
        do {
            double buffer;
            swap = false;

            for (int i = 0; i < last; i++) {
                if (array[i] > array[i + 1]) {
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    swap = true;
                }

            }
            last--;

        } while (swap);
    }

    static double[] mul(double[][] matrix, double[] vector) {

        double[] res = new double[matrix.length];//заменил vector->matrix
        for (int i = 0; i < res.length; i++) {
            res[i] = 0;
        }
        //реализовать проверку
        //число столбцов в матрице должно совпадать с числом строк в векторе-столбце
        if (matrix[0].length == vector.length) {
            //double[][] vect_stolb;


            for (int i = 0; i < matrix.length; i++) {
                //double sum=0;
                for (int j = 0; j < matrix[i].length; j++) {
                    //res[i]=vector[i]*matrix[i][j];
                    res[i] = res[i] + vector[j] * matrix[i][j];
                }

            }
        }

        return res;
    }

    static double[][] mul(double[][] left, double[][] right) {
        //сделать проверку столбцов/строк
        //if()
        double[][] res = new double[left.length][right[0].length];
        for (int str = 0; str < left.length; str++) {
            for (int stolb = 0; stolb < right[0].length; stolb++) {
                for (int k = 0; k < right.length/*LEFT[0].LENGTH*/; k++) {
                    res[str][stolb] = res[str][stolb] + left[str][k] * right[k][stolb];
                }

            }
        }
        //return res;
    }
}
//1 2 3 0      q w e      4 4 4 4
//4 5 6 0      a s d      4 4 4 4
//7 8 9 0      z x c      4 4 4 4
//             r t y