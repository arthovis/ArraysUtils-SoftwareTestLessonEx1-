package com.company;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ArraysUtilsWithAssertJTest {
    private ArraysUtils arraysUtils;
    @Before
    public void setUP(){
        arraysUtils = new ArraysUtils();
    }

    @Test
    public void bubbleSort(){
        int[]array = {1,5,7,3,9,10};
        arraysUtils.bubbleSort(array);
        Assertions.assertThat(array)
                .contains(1)
                .contains(7)
                .hasSize(6);
    }
}
