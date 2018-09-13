package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String l = "loop";
        String p = "pool";
        System.out.println(yesAnagram(l, p));
    }
    public static boolean yesAnagram(String str1,String str2){
        if(str1.length()!= str2.length()) {
            return false;
        }
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        char[] str1s=str1.toCharArray();
        Arrays.sort(str1s);
        char[] str2s=str2.toCharArray();
        Arrays.sort(str2s);
        return Arrays.equals(str1s, str2s);

    }
}
