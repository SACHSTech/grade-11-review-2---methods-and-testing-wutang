package gr11review.part2;
import java.io.*;
import java.util.*;

/**
* Where all the methods are located. 
* @author: N. Wan 
*
*/
public class Utility {


    /** A method that checks if "xyz" is in the middle of the string.
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