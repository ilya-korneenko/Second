package by.proger.korneenko.jd01_07.Task1;

public abstract class AbstractCardAction {
    private int id;

    public AbstractCardAction(){    //консруктор
    }

    public boolean checkLimit(){    //собственный метод
        return true;
    }

    public abstract void doPayment(double amountPayment);
}
