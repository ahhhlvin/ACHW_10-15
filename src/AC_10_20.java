import java.util.Arrays;

/**
 * Created by alvin2 on 10/20/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class AC_10_20
{

    public static int[] selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] < nums[i]) {

                    // store smaller nums[j] in temporary int
                    // put larger nums[i] into nums[j]
                    // put smaller temporary int back into nums[i] position

                    int tempNum = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tempNum;
                }
            }
        }


        return nums;
    }




    public static int[] insertSort(int[] nums) {

        for (int i = nums.length-1; i > 0; i--) {

            for (int j = i; j >= 0; j--) {
                if (nums[j] > nums[i]) {

                    // store smaller nums[i] in temporary int
                    // put larger nums[j] into nums[j]
                    // put smaller temporary int back into nums[j] position

                    int tempNum = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tempNum;
                }
            }
        }

        return nums;

    }

    public static void main(String[] args) {

        int[] nums = {11, 3, 55, 6, 77, 7, 8, 10};
        int[] nums2 = {4, 66, 7, 8, 99, 2, 5};
//        System.out.println(Arrays.toString(selectionSort(nums)));
        System.out.println(Arrays.toString(insertSort(nums2)));


    }
}
