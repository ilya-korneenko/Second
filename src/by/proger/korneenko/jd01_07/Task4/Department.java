package by.proger.korneenko.jd01_07.Task4;

import java.io.IOException;


public class Department {
    {
        System.out.println("logic(1) id=" + this.id);
        //проверка и инициализация параметров конкретного объекта
        //СТАРТ: ДО КОНУСТРУКТОРА КЛАССА
}
    static {
        System.out.println("static logic");
        //проверка и инициализация базовых параметров, необходимых
        //для функционирования приложения (всего класса)
        //СТАРТ: ПРИ ПЕРВОМ ОБРАЩЕНИИ К ЛЮБОМУ МЕТОДУ КЛАССА
    }

    private int id=7;

    public Department(int id){
        this.id=id;
        System.out.println("конструктор id="+id);
    }
    
    public int getId(){
        return id;
    }

    {
        System.out.println("logic(2) id= "+id);
    }

    public static void main(String[] args) throws IOException {
        new Department(18);
        new Department(25);

    }
}




