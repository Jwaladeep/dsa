package com.java.leetcode;
class TwoSumBasic{
    public int[] twoSum(int[] nums, int target) {
        int[] k = {0,1};
        for (int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j]== target){
                    System.out.println("["+i+","+j+"]");
                    k[0] =i;
                    k[1]=j;
                    return k;
                }
            }
        }
        return k;
    }
}