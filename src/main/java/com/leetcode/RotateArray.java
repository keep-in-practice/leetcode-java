package com.leetcode;

public class RotateArray {
    public void rotate(int nums[], int k) {
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        for (int start = 0, count = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[current];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (current != start);
        }
    }

    public static void main(String[] args) {
        int nums[] = { -1,-100,3,99 };
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
    }
}
