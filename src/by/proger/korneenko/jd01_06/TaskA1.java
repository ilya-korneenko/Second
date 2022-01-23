package by.proger.korneenko.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
//        {
//            StringBuffer sb = new StringBuffer();
//            System.out.println("длина -> " + sb.length());
//            System.out.println("размер буфера -> " + sb.capacity());
//            sb.append("Java");
//            System.out.println("длина -> " + sb.length());
//            System.out.println("размер буфера -> " + sb.capacity());
//            sb.append("Internationalization");
//            System.out.println("строка -> " + sb);
//            System.out.println("длина -> " + sb.length());
//            System.out.println("размер буфера -> " + sb.capacity());
//            System.out.println("реверс -> " + sb.reverse());
//
//        } //example first
//
//        {
//            Pattern p1 = Pattern.compile("а+у");
//            Matcher m1 = p1.matcher("ааааау");
//            boolean b = m1.matches();
//            System.out.println(b);
//            String regex = "(\\w{6,}@(\\w+\\.)([a-z]{2,4}))";
//            String str = "адреса эл.почты: modamax@mail.ru korneenko@mail.ru no@it.ru";
//            Pattern p2 = Pattern.compile(regex);
//            Matcher m2 = p2.matcher(str);
//            while (m2.find())
//                System.out.println("e-mail: " + m2.group());
//        } //example second
        StringBuilder dynText = new StringBuilder(Poem.text);
        Pattern p1 = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher m1 = p1.matcher(dynText);

        while (m1.find()){
            int index = m1.start();
            if (m1.end()-index>=4)
            {
            dynText.setCharAt(index+3,'#');
            if (m1.end()-index>=7)
            {
                dynText.setCharAt(index+6,'#');
            }
            //System.out.println(m1.group());
            }

        }
        System.out.println(dynText);

    }
}
