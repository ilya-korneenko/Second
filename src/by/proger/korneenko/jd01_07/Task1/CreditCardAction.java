package by.proger.korneenko.jd01_07.Task1;

public class CreditCardAction extends AbstractCardAction {

    @Override   //указывает на полиморфнуюприроду метода
    //метод должен быть реализован в подклассе
    public void doPayment(double amountPayment) {
        //реализация
        System.out.println("complete from credit card!");
    }
}
