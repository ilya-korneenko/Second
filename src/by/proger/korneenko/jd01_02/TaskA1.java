package by.proger.korneenko.jd01_02;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int [] ms=new int[10];
        System.out.println("Введите массив из 10 чисел");
        for(int i=0; i< ms.length;i++)
        {
            System.out.print((i+1)+"е значение:\t");
            ms[i]=numbers.nextInt();
        }
        step1(ms);
        step2(ms);
        step3(ms);
    }

    private static void step1(int[] ms) {
        int min=ms[0];
        int max= ms[0];
        for (int value : ms) {

            if(value<min)
                min=value;
            if(value>max)
                max=value;
        }
        System.out.println("max: "+max+" min: "+min);
    }

    private static void step2(int[] ms) {
        double sum=0;
        for (int number : ms) {
            sum+=number;

        }
        sum=sum/ms.length;
        for (int num : ms) {
            if(num>sum)
                System.out.print(num + " ");

        }
        System.out.println();
    }

    private static void step3(int[] ms) {
        int min=ms[0];
        for (int number : ms) {
            if (number < min)
                min = number;
        }
            for (int i = ms.length - 1; i >= 0; i--) {
                if(min == ms[i])
                    System.out.print(i+" ");


        }
    }
}
