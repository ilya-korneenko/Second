package by.proger.korneenko.jd01_5;

import static     java.lang.Math.*;
public class TaskB {
//    //TaskB1
//
//    public static void main(String[] args) {
//        double dela=0.2;
//        double a=0;
//        for(;a<=2;a+=0.2)
//        {
//            double sum=0, res;
//           for(int x=1;x<=6;x++)
//           {
//               res=pow(7,a)-cos(x);
//               sum+=res;
//           }
//            System.out.println(sum);
//        }
//    }
    //TaskB2
public static void main(String[] args) {
    double delx=0.5;
    double b=100;
    //double res=log10(abs(b+2.74));
    double x = -5.5;//x=-4
    for(;x<2;x+=delx) {
        if (x / 2 > -2 && x / 2 <= -1) {
            b = sin(x * x);
            double k = res(b);
            System.out.println("при х равном " + x/2 +" " + k);
        }
        if(x/2>-1&&x/2<0.2)
        {
            b=cos(x*x);
            double k =res(b);
            System.out.println("при х равном " + x/2+" " + k);
        }
        if(x/2==0.2)
        {
            b=pow(tan(x*x),-1);
            double k=res(b);
            System.out.println("при х равном " + x/2 +" "+ k);
        }
        if(x/2<=-2||x/2>0.2)
            System.out.println("при х равном "+x/2+" хуила");
    }
}

    static double res(double b) {
        double ress=log10(abs(b+2.74));
        return ress;
    }
}
