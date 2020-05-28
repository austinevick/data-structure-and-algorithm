package sorting;

import java.util.Arrays;

public class InsertionSort {
    /*
    This simple insertion–sort algorithm goes as follows. We start with the first
character in the array. One character by itself is already sorted. Then we consider
the next character in the array. If it is smaller than the first, we swap them. Next
we consider the third character in the array. We swap it leftward until it is in its
proper order with the first two characters. We then consider the fourth character,
and swap it leftward until it is in the proper order with the first three. We continue
in this manner with the fifth integer, the sixth, and so on, until the whole array is
sorted.
     */
    public static void main(String[] args) {
int nums[] = {7,-2, 3,2,1,0,25};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));
    }
    public static void insertionSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > value){
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = value;
        }
    }
}
