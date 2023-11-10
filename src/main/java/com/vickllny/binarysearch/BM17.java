package com.vickllny.binarysearch;

public class BM17 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param nums   int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public static int search(int target,int... nums) {
        // write code here
        if(nums.length == 0){
            return -1;
        }
        int length = nums.length;
        if(target < nums[0] || target > nums[length - 1]){
            return -1;
        }
        int left = 0;
        int right = length - 1;
        int index = 0;
        while (left <= right) {
            index = (left + right) / 2;
            int val = nums[index];
            if(val == target){
                return index;
            }else if(target < val){
                right = index - 1;
            }else {
                left = index + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int search = search(3, -1,1,3);
        System.out.println(search);
    }
}
