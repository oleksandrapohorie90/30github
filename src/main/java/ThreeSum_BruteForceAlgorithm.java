public class ThreeSum_BruteForceAlgorithm {

    public static int count(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for (int k = j + 1; k < n; k++)
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        count++;
                    }

        return count;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,-3};

        System.out.println(count(nums));
    }
}
