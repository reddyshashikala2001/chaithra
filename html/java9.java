public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {5, 12, 7, 25, 18};
        int max = nums[0];
        for (int n : nums) {
            if (n > max) max = n;
        }
        System.out.println("Largest number: " + max);
    }
}
