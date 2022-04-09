package by.proger.korneenko.jd01_08.polygon;

import java.util.Objects;

public class Man {
    private int id;
    private String name;
    private int age;

    public Man(int id, String name, int age) {
        this.id = id;
        this.name=name;
        this.age=age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Man man = (Man) obj;
        return id == man.id && age == man.age && Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Man{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
