package Arrays;

import java.util.Arrays;

/* Given a sorted array A (sorted in ascending order), having N integers, find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.

 */
public class SumEqualX {
    boolean isPairSum(int[] num, int sum) {
        Arrays.sort(num);

        int left = 0;
        int right = num.length - 1;
        while (left < right) {
            // find a pair
            if (num[left] + num[right] == sum) {
                return true;
            // if sum of elements at current pointers is more,  move towards lower values
            } else if (num[left] + num[right] > sum) {
                right--;
            // if sum of elements at current pointers is less,  move towards higher values
            } else {
                left++;
            }
        }
        return false;
    }
}
