package gr11review.part2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.*;
import java.util.*;

/**
* Where all the methods are located. 
* @author: N. Wan 
*
*/
public class Utility {


    /** A method that checks if "xyz" is in the middle of the string.
    * @author N. Wan
    * @param str The string that is going to be checked if there is "xyz" in the middle.
    * @return boolean If "xyz" is in the middle or not. 
    */
    public static boolean xyzMiddle(String str){ 

        // Initialize variables
        int intLength = str.length();
        int intSides;
        String strTester;
        String strChecker = "xyz";

        // Determine if it is atleast 5 characters long
        if (intLength >= 5) {

            intSides = intLength - 3;
            
            // Check if it is even or odd then check if "xyz" is in the middle.
            if (intSides % 2 != 0) {
                
                intSides = intSides / 2;
    
                strTester = str.substring(intSides, intSides + 3);

                if (strTester.equals(strChecker) == true) {
                    
                    return true;

                } else {

                    strTester = str.substring(intSides +1, intSides + 4);

                    if (strTester.equals(strChecker) == true) {
                        
                        return true;

                    }
                }

            // Check if "xyz" is in the middle for even. 
            } else {

                intSides = intSides / 2;

                strTester = str.substring(intSides, intSides + 3);

                if (strTester.equals(strChecker) == true) {
                  
                    return true;
                
                } 
            }
    }

    return false;

    }


    /** A method that finds the alphabetically first word and returns it. 
    * @author N. Wan
    * @param filenametxt The file that contains all the information needed.
    * @return highestWord The word that is most alphabetically first.
    * @IOExecption 
    */
    public static String alphaWord(String filenametxt) throws IOException { 
     
        // Initialize buffer reader and variables.
        BufferedReader Br = new BufferedReader(new FileReader(filenametxt));
        String strLine = Br.readLine();
        String highestWord = Br.readLine();

    // Read the lines in the file and compare them to see which word is the alphabetically first word. 
    while(strLine != null) {
        
        strLine = Br.readLine();

        if (strLine.compareTo(highestWord) > 0) {

            highestWord = strLine;

        }
    }

    Br.close();

    // Return the alphabetically first word. 
    return highestWord;
    
    }


    /** A method that puts all the zeros in an array to the front. 
    * @param nums The array that has the zeros in random position.
    * @return zeroFront The array that has all the zeros at the front of the array.
    */
    public static int[] zeroFront(int[] nums) {

        // Initialize variables
        int intZeroCounter = 0;
        int[] zeroFront;
        zeroFront = new int[nums.length];
        int intCounter = 0;

        // Count how many zeros there are
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {

                intZeroCounter++;
                
            } 
        }

        // Add the non-zero numbers to the end.
        for(int i = 0; i < nums.length; i++){

            if (nums[i] != 0) {

                zeroFront[intZeroCounter + intCounter] = nums[i];
                intCounter++;
            }
        }

        // Add the zeros to the front.
        for(int i = 0; i < intZeroCounter; i++) {

            zeroFront[i] = 0;
        }

        // Return array
        return zeroFront;   
    }


    /** A method that creates an array with an ascending pattern. 
    * @param n The highest number.
    * @return seriesUp An array with an ascending pattern.
    */
    public static int[] seriesUp(int n) {

        // Initialize variables 
        int[] seriesUp;
        int intLength = n * (n+1) / 2;
        seriesUp = new int[intLength];
        int intCounter = 1;
        int intPosition = 0;
        int intEnd = -1;

        // Create the ascending pattern array.
        for (int i = 1; i <= n; i++) {

            intEnd = intEnd + i;

            while (intPosition <= intEnd) {

                seriesUp[intPosition] = intCounter;

                intCounter++;

                intPosition++;

            }

            intCounter = 1;
        }

        // Return the array.
        return seriesUp;

    }


    /** A method that takes a portion of a 2D array and outputs it based on the rows and columns given. 
    * @param arr The original 2D array. 
    * @param row The row the portion goes up to.
    * @param col The col the portion goes up to.
    * @return ans The portion of the 2D array.
    */
    public static int[][] split(int[][] arr, int row, int col) {
        
        // Initialize protion of 2D array. 
        int[][] ans = new int[row + 1][col + 1];

        // Construct the portion of the 2D array.
        for(int i = 0; i <= col; i++) {
            for(int j = 0; j <= row; j++) {

                ans[j][i] = arr[j][i];

            }
        }

        // Return array. 
        return ans;
        
    }
}


/**
     * method to check if a string contains characters ys that balance character xs
     * @author J. Yogarajah
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


    /**
     * method to return the longest word in a txt file
     * @author J. Yogarajah
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
 * @author J. Yogarajah
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
 * @author J. Yogarajah
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
 * @author J. Yogarajah
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