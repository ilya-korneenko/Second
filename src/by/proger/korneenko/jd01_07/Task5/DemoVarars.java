package by.proger.korneenko.jd01_07.Task5;
/*
метод с неоределенном числом формальных параметров Integer... args
*/
public class DemoVarars {
    public static int defineArgCount(Integer... args){
        if(args.length==0)
            System.out.println("NO ARG ");
        else
            for (int i = 0; i < args.length; i++) {
                System.out.println("arg: " + args[i]);
            }
    return args.length;
    }

    public static void main(String[] args) {
        System.out.println(" N= "+ defineArgCount(7,51,555));
        Integer[] arr ={3,66,78};
        System.out.println(" N= "+ defineArgCount(arr));
        System.out.println(" N= " + defineArgCount());
    }


}
