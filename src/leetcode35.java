public class leetcode35 {
    public static void main(String[] args) {
        System.out.println(new leetcode35().searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) left = mid + 1; 
            else right = mid;
        }
        return left;
    }
}