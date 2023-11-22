package com.cg.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class MinMaxTest {
    MinMaxObj minmax;

    @Test
    @DisplayName("Testing Find Min Max Function")

    public void findMinMaxTest() {
    minmax = new MinMaxObj();
    int arr[] = {5,8,2,9};
    String expected=Integer.toString(29);
    String actual= minmax.findMaxMin(arr);

    assertEquals(expected, minmax.findMaxMin(arr));

    int arr1[]= {51, -82, 0, 9};

    String expected1=Integer.toString(-8251);
    assertEquals(expected1, minmax.findMaxMin(arr1));
    int arr2[]= {0, 0, 0, 0};
    String expected2=Integer.toString(0);
    expected2+=Integer.toString(0);
    assertEquals(expected2, minmax.findMaxMin(arr2));
    }
}
