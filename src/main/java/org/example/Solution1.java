package org.example;

import java.util.Arrays;

class Solution1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(Arrays.toString(nums1));
            int temp = Arrays.binarySearch(nums1, 0, m, nums2[i]);
            System.out.println(temp);

            if (temp >= 0) {
                for (int j = m; j > temp; j--) {
                    nums1[j] = nums1[j - 1];
                }
                nums1[temp] = nums2[i];
                m++;
            } else {
                temp = Math.abs(temp) - 1;
                for (int j = m; j > temp; j--) {
                    nums1[j] = nums1[j - 1];
                }
                nums1[temp] = nums2[i];
                m++;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{4, 5, 6}, 3);
    }

}