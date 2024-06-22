import java.util.HashSet;

/*
 * Given an integer array arr, count how many elements x there are,
 * such that x + 1 is also in arr. If there are duplicates in arr, count them separately.
 * Ex 1: Input: arr = [1,2,3] Output: 2
 * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
 * */
public class CountingElements {

    public static int countElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int count = 0;
        for(int num: arr) {
            if(set.contains(num+1)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String...args) {
        int[] arr = {1,2,3};
        System.out.println(countElements(arr));
    }
}
