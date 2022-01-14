package by.proger.korneenko.jd01_5;

import static java.lang.Math.*;

public class TaskA {
    private double a;

    //TaskA1
        //first

//    public static void main(String[] args) {
//
//        double x=0.3, a=756.13;
//
//        double part1=cos(pow(x*x+PI/6,5));
//        double part2 =sqrt(x*pow(a,3));
//        double part3=log10(abs((a-1.12*x)/4));
//        double res=part1-part2-part3;
//        System.out.println(res);
//    }

    //second
//        public static void main(String[] args) {
//            double a=756.13, x=0.3;
//            double res=cos(pow(x*x+PI/6,5))-sqrt(x*pow(a,3))-log10(abs((a-1.12*x)/4));
//            System.out.println(res);
//        }

//    //TaskA2
//    public static void main(String[] args) {
//        double a=1.21,b=0.371;
//
//        //double part1=tan(toRadians(pow(a+b,2)));
//        double part1=tan(pow(a+b,2));
//        //double part1=pow(tan(a+b),2);
//        double part2 = pow(a+1.5,1/3.0);
//        double part3=a*pow(b,5), part4=b/ log(pow(a,2));
//        double res = part1-part2+part3-part4;
//
//        System.out.println(res);
////        System.out.println(part1);//2.499561
////        System.out.println(part2);
////        System.out.println(part3);
////        System.out.println(part4);
//
//}

    //TaskA3
    public static void main(String[] args) {
        double dela=3.75, x=12.1;
        double a=-5;
        while(a>=-5&&a<=12)
        {
            double res=pow(E,a*x)-3.45*a;
            System.out.println(res);
            a+=dela;

        }
    }


}
