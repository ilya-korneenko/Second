package by.proger.korneenko.jd01_01;

import java.math.BigInteger;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Введите первое число:\t");
        num1= number.nextInt();
        System.out.print("\nВведите второе число:\t");
        num2= number.nextInt();
        sum=num1+num2;
        System.out.println("\n"+num1+"+"+num2+"="+sum);
        BigInteger prob = new BigInteger(String.valueOf(sum));
        String s= prob.toString(2);
        System.out.println("двоичн:"+s);
    }
}
