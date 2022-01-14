package by.proger.korneenko.jd01_01;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int sum;
        Scanner num = new Scanner(System.in);
        System.out.print("Введите первое число:\t");
        int num1= num.nextInt();
        System.out.print("\nВведите второе число:\t");
        int num2= num.nextInt();
        System.out.println("\nDEC: "+(sum=num2+num1));
        //int b = 13;
        //System.out.println(sum);
        int ostatok=0, position=0;
        while (ostatok!=1)
        {
            ostatok=sum/2;
            if(ostatok!=1)
                position++;
            else
                break;
        }
        System.out.println(position);
    }
}
