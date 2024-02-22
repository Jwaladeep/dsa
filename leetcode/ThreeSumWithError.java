package com.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
class ThreeSumWithError {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> twoSumMap = new HashMap<>();
        int numLen = nums.length;
        for(int i=0; i<numLen; i++){
           twoSumMap.put(nums[i],i);
        }
        for(int i=0; i<numLen; i++){
            int target = 0-nums[i];
            for(int j = i+1; j<numLen; j++){
                int diff = target - nums[j];
                if(twoSumMap.containsKey(diff) && twoSumMap.get(diff)!=j){
                    result.add(Arrays.asList(nums[i],nums[j], diff));
                }
            }
        }
        return result;
    }
}
