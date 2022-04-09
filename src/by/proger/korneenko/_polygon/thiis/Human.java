package by.proger.korneenko._polygon.thiis;

public class Human {
    String name;
    int age;

    //сеттеры(для ввода информации)
    public void setName(String theName){
        name=theName;
    }

    public void setAge(int age){
        this.age=age;               //THIS указывает на переменную ОБЪЕКТА/КЛАССА
    }

    //геттеры
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo(){
        System.out.println(name+","+age);
    }
}
