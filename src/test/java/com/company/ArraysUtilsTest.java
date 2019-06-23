package com.company;

import org.junit.Assert;
import org.junit.Test;

public class ArraysUtilsTest {
    @Test
    public void binarySearchElementExistTest(){
        int[] array = {1,3,5,7,9,10};
        int n = 7;
        int result = new ArraysUtils().binarySearch(array,n);
        Assert.assertEquals(3,result);
    }
    @Test
    public void binarySearchElementNotExistTest(){
        int[] array = {1,3,5,7,9,10};
        int n = 2;
        int result = new ArraysUtils().binarySearch(array,n);
        Assert.assertEquals(-2,result);
    }

    @Test
    public void bubbleSortTest(){
        int[] array ={3,5,1,2,6,10,4};
        new ArraysUtils().bubbleSort(array);
        int[] expected ={1,2,3,4,5,6,10};
        Assert.assertArrayEquals(expected,array);
    }
}
