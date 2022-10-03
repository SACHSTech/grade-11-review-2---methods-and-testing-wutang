package gr11review.part2;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Utility {

    public static void main(String[] args) throws FileNotFoundException {
    }

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

}
