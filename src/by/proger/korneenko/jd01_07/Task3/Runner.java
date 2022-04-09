package by.proger.korneenko.jd01_07.Task3;

public class Runner {
    public static void main(String[] args) {
        IBaseAction base = new IBaseImplementation();
        base.blocking();
        base.closeAccount();

    }
}
