/*
* Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
* */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;
        for (int num :  nums) {
            if (count == 0) {
                ele = num;
            }
            if (ele == num) {
                count++;
            } else {
                count--;
            }

        }
        int counter = 0;
        for (int num : nums) {
            if (num == ele) {
                counter++;
            }
        }
        if (counter > nums.length/2) {
            return ele;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}