package gr11review.part2;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Utility {

    
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



}
