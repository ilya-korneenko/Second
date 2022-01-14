package by.proger.korneenko.jd01_02;

import java.util.Scanner;

//import static by.proger.korneenko.jd01_02.TaskA1.step3;

public class TaskB {
    public static void main(String[] args) {
        Scanner klon=new Scanner(System.in);
        double a=0,b=0,c=0;
        int ms[]=new int[25];

        step1();
        step2(klon);
        System.out.println("смотри есть кв-е ур-я(ax^2+bx+c), введи a, b и c: ");
        System.out.print("a:\t");
        a= klon.nextDouble();
        System.out.print("b:\t");
        b=klon.nextDouble();
        System.out.print("c:\t");
        c=klon.nextDouble();
        step3(a,b,c);

    }

    private static void step1() {
        int value =1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(value+" " );
                value++;
            }
            System.out.println();
        }
    }

    private static void step2(Scanner klon) {
        System.out.println("Введите число от 1 до 12:\t");
        int vibor=0;
        boolean flag=false;
        while(!flag)
        {
            vibor=klon.nextInt();
        switch (vibor) {
            case 1: {
                System.out.println("январь");
                flag=true;
                break;
            }
            case 2: {
                System.out.println("февраль");
                flag=true;
                break;
            }

            case 3: {
                System.out.println("март");
                flag=true;
                break;
            }
            case 4: {
                System.out.println("апрель");
                flag=true;
                break;
            }
            case 5: {
                System.out.println("май");
                flag=true;
                break;
            }
            case 6: {
                System.out.println("июнь");
                flag=true;
                break;
            }
            case 7: {
                System.out.println("июль");
                flag=true;
                break;
            }
            case 8: {
                System.out.println("август");
                flag=true;
                break;
            }
            case 9: {
                System.out.println("сентябрь");
                flag=true;
                break;
            }
            case 10: {
                System.out.println("октябрь");
                flag=true;
                break;
            }
            case 11: {
                System.out.println("ноябрь");
                flag=true;
                break;
            }
            case 12: {
                System.out.println("декабрь");
                flag=true;
                break;
            }
            default:
                System.out.println("Вы ввели некоректное число, повторите, пожалуйста");

        }
        }

    }

    private static void step3(double a, double b, double c) {
        double discriminant=b*b-4*a*c;
      discriminant=Math.sqrt(discriminant);
        System.out.println(discriminant);
     if(discriminant>=0)
     {
         double x1,x2;
         if(discriminant==0)
         {
             x1=x2=-b/(2*a);
             System.out.println("x1=x2= " +x1);
         }
         else {

             x1 = (-b + discriminant) / (2 * a);
             x2 = (-b - discriminant) / (2 * a);
             System.out.println("Первый корень(x1)= " + x1);
             System.out.println("Второй корень(x2)= " + x2);
         }


     }
     else
         System.out.println("Положительных корней нет");
    }


}
