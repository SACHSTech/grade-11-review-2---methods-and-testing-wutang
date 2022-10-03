package gr11review.part2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;



public class UtilityTest{

    @Test 
    /**
     * Test for canBalance method
     */
    void canBalanceTest1(){
        int[] arr = {10,10};
        assertTrue(Utility.canBalance(arr));
    }
    @Test 
    /**
     * Test for canBalance method
     */
    void canBalanceTest2(){
        int[] arr = {5,10,15};
        assertTrue(Utility.canBalance(arr));
    }
    
    @Test 
    /**
     * Test for canBalance method
     */
    void canBalanceTest3(){
        int[] arr = {1,15,16};
        assertTrue(Utility.canBalance(arr));
    }
    @Test 
    /**
     * Test for canBalance method
     */
    void canBalanceTest4(){
        int[] arr = {10,11};
        assertFalse(Utility.canBalance(arr));
    }



    @Test 
    /**
     * Test for xyBalance method
     */
    void xyBalanceTest1(){
        assertTrue(Utility.xyBalance("fbbfkdsfjdfjnsdjkfyx"));
    }
    @Test 
    /**
     * Test for xyBalance method
     */
    void xyBalanceTest2(){
        assertTrue(Utility.xyBalance("fbbfkdsfjdfjnsdjkfyxxxx"));
    }
    @Test 
    /**
     * Test for xyBalance method
     */
    void xyBalanceTest3(){
        assertTrue(Utility.xyBalance("fbbfkydsfjdfjnsdjkfdsfdsx"));
    }
    /**
     * Test for xyBalance method
     */
    @Test 
    void xyBalanceTest4(){
        assertFalse(Utility.xyBalance("fbbfkdsfjdfjnsdjkfyxy"));
    }
    @Test 
    /**
     * Test for xyBalance method
     */
    void xyBalanceTest5(){
        assertTrue(Utility.xyBalance("fbbfkdsfjdfjnsdjkf"));
    }



    @Test 
    /**
     * Test for withoutTen method
     */
    void withoutTenTest1(){
        int[] arr = {10,1,5};
        int[] ans = {1,5,0};
        assertArrayEquals(ans, Utility.withoutTen(arr));
    }
    @Test 
    /**
     * Test for withoutTen method
     */
    void withoutTenTest2(){
        int[] arr = {10,10,10};
        int[] ans = {0,0,0};
        assertArrayEquals(ans, Utility.withoutTen(arr));
    }
    @Test 
    /**
     * Test for withoutTen method
     */
    void withoutTenTest3(){
        int[] arr = {5,0,5};
        int[] ans = {5,0,5};
        assertArrayEquals(ans, Utility.withoutTen(arr));
    }
    @Test 
    /**
     * Test for withoutTen method
     */
    void withoutTenTest4(){
        int[] arr = {0,0,0};
        int[] ans = {0,0,0};
        assertArrayEquals(ans, Utility.withoutTen(arr));
    }



    @Test 
    /**
     * Test for reverse method
     */
    void reverseTest1(){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] ans = {{9,8,7},{6,5,4},{3,2,1}};
        assertArrayEquals(ans, Utility.reverse(arr));
    }
    @Test 
    /**
     * Test for reverse method
     */
    void reverseTest2(){
        int[][] arr = {{1,2,3}, {1,2,3}, {1,2,3}};
        int[][] ans = {{3,2,1},{3,2,1},{3,2,1}};
        assertArrayEquals(ans, Utility.reverse(arr));
    }
    @Test 
    /**
     * Test for reverse method
     */
    void reverseTest3(){
        int[][] arr = {{10,20,30}, {2,4,6}, {8,16,32}};
        int[][] ans = {{32,16,8}, {6,4,2}, {30,20,10}};
        assertArrayEquals(ans, Utility.reverse(arr));
    }

    @Test
    /**
     * Test for longestword method
     */
    void longestwordTest1() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\Jenus\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\part2\\Review2_3Test_1.txt"));
    }
    @Test
    /**
     * Test for longestword method
     */
    void longestwordTes2() throws IOException{
        assertEquals("x", Utility.longestWord("C:\\Users\\Jenus\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\part2\\Review2_3Test_2.txt"));
    }
    @Test
    /**
     * Test for longestword method
     */
    void longestwordTes3() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\Jenus\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\part2\\Review2_3Test_3.txt"));
    }
    @Test
    /**
     * Test for longestword method
     */
    void longestwordTes4() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\Jenus\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\part2\\Review2_3Test_4.txt"));
    }
}
