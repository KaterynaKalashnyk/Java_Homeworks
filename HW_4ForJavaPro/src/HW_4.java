import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

//Homework 4
//@version 22.05.2023
//@author Kateryna
//У меня есть некоторые вопросы по поводу второго задания,
// к  сожалению последняя лекция не доступна к просмотру на скиллдеске
public class HW_4 {
    public static void main(String[] args) {
        String text = "hallo my name is kateryna i have friends i like to walk with my friends";
        ArrayList<String> words = new ArrayList<>(Arrays.asList(text.split(" ")));
        Set<String> modtext = new HashSet<>();
        System.out.println(words);
        modtext.addAll(words);
        System.out.println(modtext);
        for (String str : modtext){
            int word = 0;
            for(String w: words){
                if(str.equals(w)){
                    word++;
                }
            }
            System.out.println(str + " : " + word);
        }
    }
    }
