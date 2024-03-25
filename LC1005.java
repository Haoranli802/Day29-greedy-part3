class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int index = 0;
        while(k-- > 0){
            nums[index] = - nums[index];
            if(index < nums.length - 1 && nums[index] > nums[index + 1]){
                index++;
            }
        }
        int sum = 0;
        for(int i : nums) sum += i;
        return sum;
    }
}

//O(N), O(1)
