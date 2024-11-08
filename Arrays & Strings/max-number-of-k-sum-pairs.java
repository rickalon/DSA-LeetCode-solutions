class Solution {
    public int maxOperations(int[] nums, int k) {
    int answer = 0;
    Arrays.sort(nums);
    int left = 0;
    int right = nums.length-1;
    while(left < right)
    {
    int aux = nums[left] + nums[right];
    if(aux == k){
        answer++;
        left++;right--;
    }else if(aux > k){
        right--;
    }else{
        left++;
    }
    }

    return answer;  
    }
}
