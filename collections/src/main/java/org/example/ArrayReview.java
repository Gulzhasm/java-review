package org.example;

import java.util.HashMap;
import java.util.Map;

public class ArrayReview {

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int potentialMatch = target - arr[i];
            if (map.containsKey(potentialMatch)) {
                output[0] = map.get(potentialMatch);
                output[1] = i;
                return output;
            } else {
                map.put(arr[i], i);
            }
        }
        return output;
    }
}
