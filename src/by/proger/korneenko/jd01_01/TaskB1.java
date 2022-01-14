package by.proger.korneenko.jd01_01;

import java.util.Scanner;


//приммер ввода целочисленнго числа

public class TaskB1 {
    public static void main(String[] args) {
        System.out.println("Введи число, которое будет возведено в квадрат: ");
        //int number;
        Scanner number= new Scanner(System.in);
        int num= number.nextInt();
        int a=num;
        int kvadrat = a*a;
        System.out.println("\na*a="+kvadrat);
    }
}
