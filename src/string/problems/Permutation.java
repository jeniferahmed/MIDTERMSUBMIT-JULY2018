package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("", "XYZ");
    }
    public static void permutation(String prefix,String sg){
        int a = sg.length();

        if(a==0) {
            System.out.println(prefix);
        }else{
            for(int i=0; i <a; i++){
                permutation(prefix + sg.charAt(i), sg.substring(0, i) + sg.substring(i+1, a));

            }

        }
    }
}
