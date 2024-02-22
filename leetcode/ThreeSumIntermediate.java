package com.java.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ThreeSumIntermediate {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result1 = new ArrayList<>();
        Set<List<Integer>> result = new HashSet<>();
        Map<Integer, Integer> twoSumMap = new HashMap<>();
        int numLen = nums.length;
        for (int i = 0; i < numLen; i++) {
            twoSumMap.put(nums[i], i);
        }
        for (int i = 0; i < numLen - 2; i++) {
            int target = 0 - nums[i];
            for (int j = i + 1; j < numLen; j++) {
                int diff = target - nums[j];
                if (twoSumMap.containsKey(diff) && twoSumMap.get(diff) != j && twoSumMap.get(diff) != i) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], diff);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
            }
        }
         result1.addAll(result);
         return result1;
    }
}