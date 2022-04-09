package by.proger.korneenko.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Var var1 = new Scalar(12);
        Var var2 = new Scalar("13");
        Var var3 = new Scalar((Scalar) var1);
        //Var var2 = new Matrix();
        Var var4 = new Vector(new double[]{1,2,3,4});
        Var var5= new Vector("1 3 5 7 9 11");
        Var var6 = new Vector((Vector) var5);
        Var var7 = new Matrix(new double[][]{{2,1,3},{3,5,6}});
        Var var8 = new Matrix("1 3 5 6 7" + " \n "+"1 2 3 4 6");
        Var var9 = new Matrix((Matrix) var7);

        System.out.println(var1);   //System.out.println(var1.toString());
        System.out.println(var2.toString());
        System.out.println(var3);   //System.out.println(var3.toString());
        System.out.println(var4.toString());
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println("\n\n\n"+var8);
        System.out.println("\n"+var8);
    }
}
