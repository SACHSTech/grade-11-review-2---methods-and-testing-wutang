package gr11review.part2;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Utility {

    public static void main(String[] args) throws FileNotFoundException {
        
            
        String filePath = new File("").getAbsolutePath();
        final String absPath = filePath+ "/src/gr11review/test2/";

        System.out.println(longestWord(absPath+"Review2_3Test_1.txt"));


        /*
         * System.out.println(xyBalance("dfdsfsfxyxx"));
         */


        /*
         * int[] arr = {10,5,15};
        System.out.println(canBalance(arr));
         */

         /*
          * int[] arr = {10,5,15};
        int[] ar = withoutTen(arr);
        for (int i = 0; i < arr.length; i++){
        System.out.print((ar[i]));
        }
          */



        /*
         * int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

          int[][] ar = reverse(arr);

          for (int i = 0; i < ar.length; i++){
            for (int x = 0; x < ar[i].length; x++){
                System.out.print(ar[i][x]);
            }
            System.out.println("");
          }
         */


    }

    /**
     * method to check if a string contains characters ys that balance character xs
     * @param str inputs a string that contains letters 
     * @return boolean vlaue on if the string xs are balanced 
     */
    public static boolean xyBalance(String str){
        int Lengthstyll = str.length();
        boolean YTrue = false;

        for (int i = 0; i < Lengthstyll; i++){
            char chrletter = str.charAt(i);
            if (chrletter == 'y'){
                YTrue = true;
            }
            if (YTrue){
                if (chrletter == 'x'){
                    YTrue = false;
                }
            }
        }

        if (!YTrue){
            return true;
        }else{
            return false;
        }
    }

    /**
     * method to return the longest word in a txt file
     * @param filenametxt enters files from the same directory
     * @return longest string in the file 
     * @throws FileNotFoundException
     */
    public static String longestWord(String filenametxt) throws FileNotFoundException{
        String strlongest = "";
        String strCurrent;

        Scanner sc = new Scanner(new File(filenametxt));

        while (sc.hasNext()) {
            strCurrent = sc.next();
             if (strCurrent.length() > strlongest.length()) {
                strlongest = strCurrent;
             }
    }
    return strlongest;    
}

/**
 * method that enters an array and returns one which contains no 10s, and instead 0s at the end
 * @param nums enters an array of numbers to be operated on 
 * @return the same except without the 10s found inside 
 */
public static int[] withoutTen(int[] nums){

    int[] newarr = new int[nums.length];
    int x = 0;

    for (int i = 0; i < nums.length; i++){
        if (nums[i] != 10){
            newarr[i - x] = nums[i];
        }else{
            x++;
        }
    }
    return newarr;
}

/**
 * method to determine wether there is a point where the array can equally be split to weigh the same on both sides 
 * @param nums array input of numbers
 * @return boolean on wether there is a point where the array can equally be split to weigh the same on both sides 
 */
public static boolean canBalance(int[] nums){
    int sum = 0;
    int half = 0;
    int splitsum = 0;
    int i=0;


    if (nums.length == 0){
        return false;
    }

    for (int x = 0; x < nums.length; x++){
        sum = sum + nums[x];
    }

    if (sum%2 ==0){
      half = sum / 2;
        while(splitsum != half){
            splitsum = splitsum + nums[i];
            i++;
          if (i == nums.length){
            break;
          }
        }
    }else{
        return false;
    }

    if (splitsum == half){
      return true;
    }else{
      return false;
    }
}

/**
 * method to reverse a 2d array 
 * @param arr inputs a 2d array off numbers
 * @return 2d arrray of the original array reversed 
 */
public static int[][] reverse(int[][] arr){

    int[][] newarr = new int[arr.length][arr[arr.length - 1].length];
          int y = 0;
          int w = 0;
          
          for (int i = arr.length - 1; i >= 0; i--){
            for (int x = arr[arr.length - 1].length - 1; x >= 0; x--){
                newarr[y][w] = arr[i][x];
                w++;
            }
            w = 0;
            y++;
          }

          return newarr;
}


}
