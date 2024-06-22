/*
* An array is monotonic if it is either monotone increasing or monotone decreasing.
* Given an integer array nums, return true if the given array is monotonic, or false otherwise.
* Example 1: Input: nums = [1,2,2,3] Output: true
* Example 2: Input: nums = [6,5,4,4] Output: true
* Example 3: Input: nums = [1,3,2] Output: false
* */
public class MonotonicArray {

    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]) increasing = false;
            if(nums[i] < nums[i+1]) decreasing = false;
        }
        return increasing || decreasing;
    }

    public static void main(String...args){
        int[] nums = {1,2,3,3};
        System.out.println(isMonotonic(nums));
    }
}
