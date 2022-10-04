package gr11review.part2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.jupiter.api.TestInstance;


public class UtilityTest{

    // Initialize variables for zeroFront method test
    int[] zeroFrontInput1 = {1,0,0,1};
    int[] zeroFrontInput2 = {0,1,1,0,1};
    int[] zeroFrontInput3 = {1,0};
    int[] zeroFrontInput4 = {0,1,1,0,1};
    int[] zeroFrontAns1 = {0,0,1,1};
    int[] zeroFrontAns2 = {1,0,1,0,1};
    int[] zeroFrontAns3 = {0,1};
    int[] zeroFrontAns4 = {0,0,1,1,1};

    // Initialize variables for seriesUp method test
    int[] seriesUpAns1 = {1,1,2,1,2,3};
    int[] seriesUpAns2 = {1,1,2,1,2,3,1,2,3,4};
    int[] seriesUpAns3 = {1,1,2};
    int[] seriesUpAns4 = {1,1,2,1,2,3,1,2,3,4,1,2,3,4,5,1,2,3,4,5,6,1,2,3,4,5,6,7,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10};

    // Initialize variables for split method test
    int[][] splitInput = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int[][] splitAns1 = {
        {1,2},
        {4,5}
    };
    int[][] splitAns2 = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int[][] splitInput2 = {
        {3,1,4,1,5},
        {9,2,6,5,3},
        {6,5,3,5,8},
        {9,7,9,3,2},
        {3,8,4,6,2}
    };
    int[][] splitAns3 = {
        {3,1,4},
        {9,2,6},
        {6,5,3}
    };
    int[][] splitAns4 = {
        {3,1,4},
        {9,2,6},
        {6,5,3},
        {9,7,9}
    };

    
    @Test
    /**
     * Test for xyzMiddle
     * @author N. Wan
     */
    void testSignature(){
        assertEquals(true, Utility.xyzMiddle("AAxyzBB"));
    }

    @Test
    /**
     * Test for xyzMiddle
     * @author N. Wan
     */
    void testSignature1(){
        assertEquals(true, Utility.xyzMiddle("AxyzBB"));
    }

    @Test
    /**
     * Test for xyzMiddle
     * @author N. Wan
     */
    void testSignature2(){
        assertEquals(false, Utility.xyzMiddle("AxyzBBB"));
    }

    @Test
    /**
     * Test for xyzMiddle
     * @author N. Wan
     */
    void testSignature3(){
        assertEquals(true, Utility.xyzMiddle("AAxyzB"));
    }

    @Test
    /**
     * Test for alphaWord
     * @author N. Wan
     */
    void testSignature4() throws IOException {
        assertEquals("accompany", Utility.alphaWord("C:\\Users\\nw556\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }

    @Test
    /**
     * Test for alphaWord
     * @author N. Wan
     */
    void testSignature5() throws IOException {
        assertEquals("x", Utility.alphaWord("C:\\Users\\nw556\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\test2\\Review2_3Test_2.txt"));
    }

    @Test
    /**
     * Test for alphaWord
     * @author N. Wan
     */
    void testSignature6() throws IOException {
        assertEquals("accompanyx", Utility.alphaWord("C:\\Users\\nw556\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\test2\\Review2_3Test_3.txt"));
    }

    @Test
    /**
     * Test for alphaWord
     * @author N. Wan
     */
    void testSignature7() throws IOException {
        assertEquals("accompany", Utility.alphaWord("C:\\Users\\nw556\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\test2\\Review2_3Test_4.txt"));
    } 

    @Test
    /**
     * Test for zeroFront
     * @author N. Wan
     */
    void testSignature8(){
        assertArrayEquals(zeroFrontAns1, Utility.zeroFront(zeroFrontInput1));
    }

    @Test
    /**
     * Test for zeroFront
     * @author N. Wan
     */
    void testSignature9(){
        assertArrayEquals(zeroFrontAns2, Utility.zeroFront(zeroFrontInput2));
    }

    @Test
    /**
     * Test for zeroFront
     * @author N. Wan
     */
    void testSignature10(){
        assertArrayEquals(zeroFrontAns3, Utility.zeroFront(zeroFrontInput3));
    }

    @Test
    /**
     * Test for zeroFront
     * @author N. Wan
     */
    void testSignature11(){
        assertArrayEquals(zeroFrontAns4, Utility.zeroFront(zeroFrontInput4));
    }

    @Test
    /**
     * Test for seriesUp
     * @author N. Wan
     */
    void testSignature12(){
        assertArrayEquals(seriesUpAns1, Utility.seriesUp(3));
    }

    @Test
    /**
     * Test for seriesUp
     * @author N. Wan
     */
    void testSignature13(){
        assertArrayEquals(seriesUpAns2, Utility.seriesUp(4));
    }

    @Test
    /**
     * Test for seriesUp
     * @author N. Wan
     */
    void testSignature14(){
        assertArrayEquals(seriesUpAns3, Utility.seriesUp(2));
    }

    @Test
    /**
     * Test for seriesUp
     * @author N. Wan
     */
    void testSignature15(){
        assertArrayEquals(seriesUpAns4, Utility.seriesUp(10));
    }

    @Test
    /**
     * Test for split
     * @author N. Wan
     */
    void testSignature16(){
        assertArrayEquals(splitAns1, Utility.split(splitInput, 1, 1));
    }
    
    @Test
    /**
     * Test for split
     * @author N. Wan
     */
    void testSignature17(){
        assertArrayEquals(splitAns2, Utility.split(splitInput, 2, 2));
    }

    @Test
    /**
     * Test for split
     * @author N. Wan
     */
    void testSignature18(){
        assertArrayEquals(splitAns3, Utility.split(splitInput2, 2, 2));
    }

    @Test
    /**
     * Test for split
     * @author N. Wan
     */
    void testSignature19(){
        assertArrayEquals(splitAns4, Utility.split(splitInput2, 3, 2));
    }

    @Test 
    /**
     * Test for canBalance method
     * @author J. Yogarajah
     */
    void canBalanceTest1(){
        int[] arr = {10,10};
        assertTrue(Utility.canBalance(arr));
    }
    @Test 
    /**
     * Test for canBalance method
     * @author J. Yogarajah
     */
    void canBalanceTest2(){
        int[] arr = {5,10,15};
        assertTrue(Utility.canBalance(arr));
    }
    
    @Test 
    /**
     * Test for canBalance method
     * @author J. Yogarajah
     */
    void canBalanceTest3(){
        int[] arr = {1,15,16};
        assertTrue(Utility.canBalance(arr));
    }
    @Test 
    /**
     * Test for canBalance method
     * @author J. Yogarajah
     */
    void canBalanceTest4(){
        int[] arr = {10,11};
        assertFalse(Utility.canBalance(arr));
    }



    @Test 
    /**
     * Test for xyBalance method
     * @author J. Yogarajah
     */
    void xyBalanceTest1(){
        assertTrue(Utility.xyBalance("fbbfkdsfjdfjnsdjkfyx"));
    }
    @Test 
    /**
     * Test for xyBalance method
     * @author J. Yogarajah
     */
    void xyBalanceTest2(){
        assertTrue(Utility.xyBalance("fbbfkdsfjdfjnsdjkfyxxxx"));
    }
    @Test 
    /**
     * Test for xyBalance method
     * @author J. Yogarajah
     */
    void xyBalanceTest3(){
        assertTrue(Utility.xyBalance("fbbfkydsfjdfjnsdjkfdsfdsx"));
    }
    /**
     * Test for xyBalance method
     * @author J. Yogarajah
     */
    @Test 
    void xyBalanceTest4(){
        assertFalse(Utility.xyBalance("fbbfkdsfjdfjnsdjkfyxy"));
    }
    @Test 
    /**
     * Test for xyBalance method
     * @author J. Yogarajah
     */
    void xyBalanceTest5(){
        assertTrue(Utility.xyBalance("fbbfkdsfjdfjnsdjkf"));
    }



    @Test 
    /**
     * Test for withoutTen method
     * @author J. Yogarajah
     */
    void withoutTenTest1(){
        int[] arr = {10,1,5};
        int[] ans = {1,5,0};
        assertArrayEquals(ans, Utility.withoutTen(arr));
    }
    @Test 
    /**
     * Test for withoutTen method
     * @author J. Yogarajah
     */
    void withoutTenTest2(){
        int[] arr = {10,10,10};
        int[] ans = {0,0,0};
        assertArrayEquals(ans, Utility.withoutTen(arr));
    }
    @Test 
    /**
     * Test for withoutTen method
     * @author J. Yogarajah
     */
    void withoutTenTest3(){
        int[] arr = {5,0,5};
        int[] ans = {5,0,5};
        assertArrayEquals(ans, Utility.withoutTen(arr));
    }
    @Test 
    /**
     * Test for withoutTen method
     * @author J. Yogarajah
     */
    void withoutTenTest4(){
        int[] arr = {0,0,0};
        int[] ans = {0,0,0};
        assertArrayEquals(ans, Utility.withoutTen(arr));
    }



    @Test 
    /**
     * Test for reverse method
     * @author J. Yogarajah
     */
    void reverseTest1(){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] ans = {{9,8,7},{6,5,4},{3,2,1}};
        assertArrayEquals(ans, Utility.reverse(arr));
    }
    @Test 
    /**
     * Test for reverse method
     * @author J. Yogarajah
     */
    void reverseTest2(){
        int[][] arr = {{1,2,3}, {1,2,3}, {1,2,3}};
        int[][] ans = {{3,2,1},{3,2,1},{3,2,1}};
        assertArrayEquals(ans, Utility.reverse(arr));
    }
    @Test 
    /**
     * Test for reverse method
     * @author J. Yogarajah
     */
    void reverseTest3(){
        int[][] arr = {{10,20,30}, {2,4,6}, {8,16,32}};
        int[][] ans = {{32,16,8}, {6,4,2}, {30,20,10}};
        assertArrayEquals(ans, Utility.reverse(arr));
    }

    @Test
    /**
     * Test for longestword method
     * @author J. Yogarajah
     */
    void longestwordTest1() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\Jenus\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\part2\\Review2_3Test_1.txt"));
    }
    @Test
    /**
     * Test for longestword method
     * @author J. Yogarajah
     */
    void longestwordTes2() throws IOException{
        assertEquals("x", Utility.longestWord("C:\\Users\\Jenus\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\part2\\Review2_3Test_2.txt"));
    }
    @Test
    /**
     * Test for longestword method
     * @author J. Yogarajah
     */
    void longestwordTes3() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\Jenus\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\part2\\Review2_3Test_3.txt"));
    }
    @Test
    /**
     * Test for longestword method
     * @author J. Yogarajah
     */
    void longestwordTes4() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\Jenus\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\part2\\Review2_3Test_4.txt"));

    }
}
