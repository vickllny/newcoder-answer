package com.vickllny.binarysearch;

public class BM19 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param nums int整型一维数组
     * @return int整型
     */
    public static int findPeakElement(int[] nums) {
        // write code here
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = ((right - left) / 2) + left;
            if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}
