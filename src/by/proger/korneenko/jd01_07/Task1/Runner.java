package by.proger.korneenko.jd01_07.Task1;

import by.proger.korneenko.jd01_07.Task1.AbstractCardAction;
import by.proger.korneenko.jd01_07.Task1.CreditCardAction;

public class Runner {
    public static void main(String[] args) {
        AbstractCardAction action = null;  //можно объявить ссылку
        //action= new AbstractCardAction(); нельзя создать объект!
        action= new CreditCardAction();
        action.doPayment(100);
        }

    }

