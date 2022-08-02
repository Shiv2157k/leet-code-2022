package easy_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 11, 7};
        int target = 9;

        int[] arr1 = new int[] {2, 4};
        int target1 = 6;

        int[] arr2 = new int[] {2, 4};
        int target2 = 7;

        System.out.println(Arrays.toString(new TwoSum().twoSum(arr, target)));
        System.out.println(Arrays.toString(new TwoSum().twoSum(arr1, target1)));
        System.out.println(Arrays.toString(new TwoSum().twoSum(arr2, target2)));
    }

    private int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[] {hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }

        return null;
    }
}
