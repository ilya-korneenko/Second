package by.proger.korneenko.jd01_07.Task3;

public class IBaseImplementation implements IBaseAction{


    public boolean openAccount() {
        return false;
    }


    public boolean closeAccount() {
        return false;
    }


    public void blocking() {
        System.out.println("blocking");
    }


    public void unBlocking() {
        System.out.println("unblocking");
    }
}
