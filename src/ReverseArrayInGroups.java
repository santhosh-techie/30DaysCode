public class ReverseArrayInGroups {

    public static int[] reverse(int[]  arr, int k) {
        int n = arr.length;
        for(int i=0; i<n; i=i+k){
            int start = i;
            int end = Math.min(i+k-1, n-1);
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return arr;
    }

    public static void main (String...args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int[] result = reverse(nums, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
