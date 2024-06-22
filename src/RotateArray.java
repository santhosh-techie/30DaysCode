import java.util.Arrays;

/*
* Cyclically Rotate an Array by One | Right Rotate an Array by One Index
 * */
public class RotateArray {

    public static int[] rotateArray(int[] arr) {
        int lastEle = arr[arr.length-1];
        for(int i= arr.length -1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = lastEle;

        return arr;
    }

    public static void main (String...args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
       System.out.println(Arrays.toString(rotateArray(nums)));
    }
}
