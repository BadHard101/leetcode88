package org.example;

import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        merge(new int[]{1, 2, 4, 0, 0, 0}, 3, new int[]{3, 5, 6}, 3);
    }
}