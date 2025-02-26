class Solution {
    int max = 0;
    public int maxAbsoluteSum(int[] nums) {
        back(nums,0,0,-1);
        return max;
    }

    public void back(int nums[], int sum, int i, int j){
        if(sum!=0 && j==-1)
            return;
        else if(sum != 0 && i != j+1)
            return;
        max = Math.max(Math.abs(sum),max);
        if(i==nums.length)
            return;
        back(nums,sum,i+1,-1);
        back(nums,sum+nums[i],i+1,i);

    }
}

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0,min=0,sum=0;
        for(int num : nums){
            sum += num;
            max = Math.max(max,sum);
            min = Math.min(min,sum);
        }
        return max-min;
    }
}
