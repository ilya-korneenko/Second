package by.proger.korneenko._polygon.subclass_constructor;

public class Alpha {
    String name;    //текстовое поле
    int code;       //целочисленное поле
    //конструктор с тремя аргументами ....?(двумя)
    Alpha(String name, int code){
        this.name=name;
        this.code=code;
        System.out.println("Класс Alpha:");
        System.out.println("Поле name - " +this.name);
        System.out.println("Поле code - " + this.code);
    }
    //конструктор с одним текстовым аргументом
    Alpha(String name){
        this(name,0);
    }
    //конструктор с одним целочисленным аргуметом
    Alpha(int code){
        this("Белый",code);
    }
    //конструктор без аргументов
    Alpha(){
        this("Жёлтый",1);
    }

}
