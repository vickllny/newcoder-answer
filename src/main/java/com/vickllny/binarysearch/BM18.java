package com.vickllny.binarysearch;

public class BM18 {
    
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param target int整型 
     * @param array int整型二维数组 
     * @return bool布尔型
     */
    public static boolean Find (int target, int[][] array) {
        // write code here
        if(array == null || array.length == 0){
            return false;
        }
        int n = array[0].length;
        if(n == 0){
            return false;
        }
        int m = array.length;
 
        while (m-- > 0) {
            int[] array1 = array[m];
            if(target > array1[n - 1]){
                return false;
            }
            if(array1[0] > target){
                continue;
            }
            int left = 0;
            int right = n - 1;
            while (right >= left) {
                int index = (right + left) / 2;
                if(array1[index] == target){
                    return true;
                }else if(target < array1[index]){
                    right = index - 1;
                }else {
                    left = index + 1;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(Find(1, new int[][]{
            {2}
            }));
    }

}
