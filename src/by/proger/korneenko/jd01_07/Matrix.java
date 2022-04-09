package by.proger.korneenko.jd01_07;

import java.util.Arrays;

public class Matrix extends Var{
    private final double[][] value ;

    public Matrix(double[][] value) {
        this.value = value;
    }

    public String showMatrix(double[][] mat){
        double element;
        StringBuilder str = new StringBuilder("{");
        for (int i = 0; i < mat.length; i++) {
            str.append("{");
            for (int j = 0; j < mat[0].length; j++) {
                //System.out.print(mat[i][j]+",");
                element=mat[i][j];
                str.append(element).append(",");
            }
            str.append("},");
        }
        str.append("}");
        String conventString = new String(str);
        return conventString;
    }

    public Matrix(String strMatrix){
        String[] row = strMatrix.split(" ");

        int counter =0;
        for (int i = 0; i < row.length; i++) {
            if (row[i].equals("\n"))
                counter++;
        }


        int columns = 0;
//        for (int i = 0; i < row.length; i++) {
//
//            if(strMatrix ==" ") {
//                columns++;
//            }
//        }
        String prob=" ";
        String[] columnsFut=strMatrix.split("");
        for (int i = 0; i < columnsFut.length; i++) {
            if (columnsFut[i].equals(prob))
                columns++;
            if(columnsFut[i].equals("\n"))
                break;
        }
        double[][] matr = new double[++counter][columns];
        int kol_char=0;
        counter--;//columns--;
        int flag=0;
        for (int i = 0; i <= counter; i++) {
            for (int j = 0; j < columns; j++) {
                if(flag==1)
                {
                    j = 0;
                    flag=0;
                }
                if(!row[kol_char].equals("\n")&& !row[kol_char].equals(" "))
                    matr[i][j]=Double.parseDouble(row[kol_char]);
                if ((row[kol_char].equals("\n")|| row[kol_char].equals(" ")))
                    if(j==0) {
                        flag = 1;

                    }
                        else
                        {
                            flag=0;
                            j--;
                        }
                kol_char++;
            }

        }
        this.value=matr;
    }

    public Matrix( Matrix otherMatrix){
        this.value=otherMatrix.value;
    }

    @Override
    public String toString() {
        return showMatrix(value);
    }
}
