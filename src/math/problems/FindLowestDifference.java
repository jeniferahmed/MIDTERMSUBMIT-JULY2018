package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int min = array1[0];
        for(int i=0;i<array1.length;i++){
            for(int k=0;k<array2.length; k++){

                int a = Math.abs(array1[i]-array2[k]);
                if(a<min) min = a;

            }
        }
      System.out.println(min);
    }

}
