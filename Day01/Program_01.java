/*977. Squares of a Sorted Array
 */
class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] arr = new int[nums.length];

        // Square the elements
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}