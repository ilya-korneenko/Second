package by.proger.korneenko.jd01_07.Task2;

import java.io.Serializable;

public class User implements Serializable {
    private final String login ;     //для bean все поля private
    private String password;        //для получения используют геттеры и сеттеры


    public User(String demo) {  //конструктор без параметров
        this.login = "guest";
    }

        //геттеры(читать в поле)
    public String getLogin(){
        return login;
    }
    public String getPassword() {
        return password;
    }

        //сеттеры(записываь в поле)
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "User{login = "+login+" password = "+password +"}";
    }
}
