package org.example;

import java.util.Arrays;

class Solution2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[--n];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 4, 0, 0, 0}, 3, new int[]{3, 5, 6}, 3);
    }

}