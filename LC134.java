class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int curSum = 0;
        int position = 0;
        for(int i = 0; i < gas.length; i++){
            sum += (gas[i] - cost[i]);
            curSum += (gas[i] - cost[i]);
            if(curSum < 0){
                curSum = 0;
                position = i + 1;
            }
        }
        if(sum < 0) return -1;
        return position;
    }
}
// O(N), O(1)
