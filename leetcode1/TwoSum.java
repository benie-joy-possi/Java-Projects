package leetcode1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        Map <Integer, Integer> map = new HashMap<>();

        for (int i=0; i < nums.length; i++){
            int complement = target - nums[i];

            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");

    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums = {11, 7, 2, 15, 2, 7};
        int target= 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
