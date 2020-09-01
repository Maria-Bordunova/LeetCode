package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:
Input: [1,2,3,1]
Output: true

Example 2:
Input: [1,2,3,4]
Output: false

Example 3:
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true

 */
public class ContainsDuplicate {
    // Using HashMap
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(); // pairs of value and number of occurrence
        for (int x : nums) {
            int count = hashMap.getOrDefault(x, 0);
            hashMap.put(x, count + 1);
        }
        int i = 0;
        while (i < nums.length && hashMap.get(nums[i++]) == 1) ;
        if (i < nums.length) {
            return true;
        } else {
            return false;
        }
    }

    // Using HashSet
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : nums) {
            if(hashSet.contains(x)){
                return true;
            }
            hashSet.add(x);
        }
        return false;
    }

    // Using sorting
    public boolean containsDuplicate3(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
