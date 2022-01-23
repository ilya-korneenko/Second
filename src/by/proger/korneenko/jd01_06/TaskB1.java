package by.proger.korneenko.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[\\p{Blank}\\p{Punct}|\\s|\\p{Space}|\\p{Blank}|\\p{Punct}|—]+");
        Matcher matcher = pattern.matcher(Poem.text);
        String str=Poem.text;
        //String [] arrStr={};
        String [] arrStr = str.split(pattern.pattern());
//        while (matcher.find())
//            System.out.println(matcher.group());
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }
    }
}
//уеыаоэяиюёУЕЫАОЭЯИЮ