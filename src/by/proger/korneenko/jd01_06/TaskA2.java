package by.proger.korneenko.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    private static String[] wordsArr =new String[0];//массив слов
    private static int[] count ={}; //массив повторений

    private static int pos(String word){
        for (int i = 0; i < wordsArr.length; i++) {
            if (wordsArr[i].equals(word))
            {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[А-Яа-яёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find())
        {
            String word = matcher.group();
            int p = pos(word);
            if (p>=0){
                count[p]++;
            }
            else
            {
                int last = wordsArr.length;
                wordsArr = Arrays.copyOf(wordsArr,last+1);
                wordsArr[last]=word;
                count=Arrays.copyOf(count,last+1);
                count[last]=1;
            }
            for (int i = 0; i < wordsArr.length; i++) {
                System.out.println(wordsArr[i]+"->"+count[i]);
            }
        }
    }
}
