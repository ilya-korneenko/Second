package by.proger.korneenko.jd01_03;

public class InOut {
         static double[] getArray(String line) {
        //упростить код

        line=line.trim();                                 //убирает пробелы
        String[] elemStrig = line.split(" ");       //создаём массив строк, отделяющихся " "
        int count = elemStrig.length;                     //переменная количества строк в массиве
        double[] arr= new double[count];                        //создаём интовый массив
        for (int i = 0; i < count; i++) {
            arr[i]=Double.parseDouble(elemStrig[i]);        //массив строк переводим в массив интов, с помощью parseDouble
        }
        return arr;
    }

    public static void printArray(double[] array) {
        for (double valye : array) {
            System.out.print(valye + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array, String name, int i) {
        for (int i1 = 0; i1 < array.length; i1++) {


            System.out.printf("%-2s[%-2d] = %-3.0f",name,i1,array[i1]);
        }
        System.out.println();
         }


//    static double[] getArray(String line) {
//        String[] strArray = line.trim().split(" ");
//        double[] result = new double[strArray.length];
//        for (int i = 0; i < strArray.length; i++) {
//            result[i] = Double.parseDouble(strArray[i]);
//        }
//        return result;
//    }
}
