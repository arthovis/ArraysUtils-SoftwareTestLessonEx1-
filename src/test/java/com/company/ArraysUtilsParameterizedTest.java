package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArraysUtilsParameterizedTest {
    private int[] arr;
    private int n;
    private int[] binarySearch;
    private int[] bubbleSort;

    public ArraysUtilsParameterizedTest(int[] arr, int n, int[] binarySearch, int [] bubbleSort) {
        this.arr = arr;
        this.n = n;
        this.binarySearch = binarySearch;
        this.bubbleSort = bubbleSort;
    }

    @Parameterized.Parameters
    public static Collection<Integer[]>data(){
        Integer[][] array = {{1,2,3,4,5,6,7}};
        return Arrays.asList(array);
    }

    @Test
    public void binarySearchTest(){
        ArraysUtils arraysUtils = new ArraysUtils();
        int actual =arraysUtils.binarySearch(arr,n);
        Assert.assertEquals(binarySearch,actual);

    }

    @Test
    public void bubbleSortTest(){
        ArraysUtils arraysUtils = new ArraysUtils();
        int actual = arraysUtils.bubbleSort(arr);
        Assert.assertEquals(bubbleSort,actual);
    }

}
