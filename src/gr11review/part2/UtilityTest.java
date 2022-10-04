package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import gr11review.part2.Utility;

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

    // Tests for xyzMiddle
    @Test
    void testSignature(){
        assertEquals(true, Utility.xyzMiddle("AAxyzBB"));
    }

    @Test
    void testSignature1(){
        assertEquals(true, Utility.xyzMiddle("AxyzBB"));
    }

    @Test
    void testSignature2(){
        assertEquals(false, Utility.xyzMiddle("AxyzBBB"));
    }

    @Test
    void testSignature3(){
        assertEquals(true, Utility.xyzMiddle("AAxyzB"));
    }

    // Tests for alphaWord
    @Test
    void testSignature4() throws IOException {
        assertEquals("accompany", Utility.alphaWord("C:\\Users\\nw556\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }

    @Test
    void testSignature5() throws IOException {
        assertEquals("x", Utility.alphaWord("C:\\Users\\nw556\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\test2\\Review2_3Test_2.txt"));
    }

    @Test
    void testSignature6() throws IOException {
        assertEquals("accompanyx", Utility.alphaWord("C:\\Users\\nw556\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\test2\\Review2_3Test_3.txt"));
    }

    @Test
    void testSignature7() throws IOException {
        assertEquals("accompany", Utility.alphaWord("C:\\Users\\nw556\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-wutang\\src\\gr11review\\test2\\Review2_3Test_4.txt"));
    } 

    // Tests for zeroFront
    @Test
    void testSignature8(){
        assertArrayEquals(zeroFrontAns1, Utility.zeroFront(zeroFrontInput1));
    }

    @Test
    void testSignature9(){
        assertArrayEquals(zeroFrontAns2, Utility.zeroFront(zeroFrontInput2));
    }

    @Test
    void testSignature10(){
        assertArrayEquals(zeroFrontAns3, Utility.zeroFront(zeroFrontInput3));
    }

    @Test
    void testSignature11(){
        assertArrayEquals(zeroFrontAns4, Utility.zeroFront(zeroFrontInput4));
    }

    // Tests for seriesUp
    @Test
    void testSignature12(){
        assertArrayEquals(seriesUpAns1, Utility.seriesUp(3));
    }

    @Test
    void testSignature13(){
        assertArrayEquals(seriesUpAns2, Utility.seriesUp(4));
    }

    @Test
    void testSignature14(){
        assertArrayEquals(seriesUpAns3, Utility.seriesUp(2));
    }

    @Test
    void testSignature15(){
        assertArrayEquals(seriesUpAns4, Utility.seriesUp(10));
    }

    // Tests for split
    @Test
    void testSignature16(){
        assertArrayEquals(splitAns1, Utility.split(splitInput, 1, 1));
    }
    
    @Test
    void testSignature17(){
        assertArrayEquals(splitAns2, Utility.split(splitInput, 2, 2));
    }

    @Test
    void testSignature18(){
        assertArrayEquals(splitAns3, Utility.split(splitInput2, 2, 2));
    }

    @Test
    void testSignature19(){
        assertArrayEquals(splitAns4, Utility.split(splitInput2, 3, 2));
    }
}
