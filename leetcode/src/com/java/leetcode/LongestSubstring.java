package com.java.leetcode;

import java.util.HashSet;
import java.util.Set;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left=0;
        Set<Character> charset = new HashSet<>();

        for(int right = 0; right <n; right++){
            if(!charset.contains(s.charAt(right))){
                charset.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
            }
            else{
                while(charset.contains(s.charAt(right))){
                    charset.remove(s.charAt(left));
                    left++;
                }
                charset.add(s.charAt(right));
            }
        }
        return maxLength;
    }
}