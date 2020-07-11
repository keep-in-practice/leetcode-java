package com.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTest {
    @Test
    public void shouldInPlaceSwapArray() {
        RotateArray rotateArray = new RotateArray();
        int nums[] = { -1, -100, 3, 99 };
        System.out.println(System.identityHashCode(nums));
        int k = 2;
        rotateArray.rotate(nums, k);
        assertArrayEquals(new int[] { 3, 99, -1, -100 }, nums);
        nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(System.identityHashCode(nums));
        k = 3;
        rotateArray.rotate(nums, k);
        assertArrayEquals(new int[] { 7, 8, 9, 1, 2, 3, 4, 5, 6 }, nums);
    }
}
